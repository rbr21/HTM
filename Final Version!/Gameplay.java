import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent; //class for button methods, use instance 'e' for this
import java.awt.event.ActionListener; //class for actions when button clicking
import java.awt.event.KeyEvent; //class for keystroke methods, use instance 'e' for this
import java.awt.event.KeyListener; //class for receiving keystrokes


import javax.swing.JPanel;
import javax.swing.Timer;


public class Gameplay extends JPanel implements KeyListener, ActionListener {
	private boolean play = false; //so the game doesn't play automatically
	private int score = 0;

	private int totalBricks = 21;

	private Timer timer;  // for how fast the ball moves
	private int delay = 8; // this delay is the ball speed

	private int playerX = 310; // player starting position

	private int ballposX = 120; // ball starting position
	private int ballposY = 350;
	private int ballXdir = -1; // how much the ball changes direction
	private int ballYdir = -2;

	private MapGenerator map;

	public boolean loss;
	public Game game;

	//this is a constructor
	public Gameplay(Game game) {
		map = new MapGenerator(3, 7);
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		// here the intial delay and delay between events is set to 8 milliseconds 
		timer = new Timer(delay, this); 
		timer.start();	
		this.game = game;
	}

	//this method is used to create the slider, tiles, ball etc.
	public void paint(Graphics g) {
		//background
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592);

		//drawing map
		map.draw((Graphics2D)g);; // type-casting to 2D

		//border
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592); // border across top
		g.fillRect(0, 0, 692, 3); // border down on left
		g.fillRect(691, 0, 3, 592); // border down on right

		//		scores
		//		g.setColor(Color.white);
		//		g.setFont(new Font("serif", Font.BOLD, 25));
		//		g.drawString(""+score, 590, 30);

		// the paddle
		g.setColor(Color.green);
		g.fillRect(playerX, 550, 100, 8);

		// the ball
		g.setColor(Color.yellow);
		g.fillOval(ballposX, ballposY, 20, 20);

		if(totalBricks <= 0) {
			play = false;
			ballXdir = 0;
			ballYdir = 0;
			g.setColor(Color.green);
			g.setFont(new Font("serif", Font.BOLD, 30));
			g.drawString("SUCCESS! FIREWALL DESTROYED!", 90, 300);
			this.loss = false;
			this.game.brickBreakerMessage(this);
		}

		if(ballposY > 570) {
			play = false;
			ballXdir = 0;
			ballYdir = 0;
			g.setColor(Color.red);
			g.setFont(new Font("serif", Font.BOLD, 30));
			g.drawString("PHISHER ALERTED! GAME OVER!", 90, 300);
			this.loss = true;
			this.game.brickBreakerMessage(this);
		}
		g.dispose(); // removes the destroyed bricks

	}
	// this method will be called automatically when an action is performed
	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start(); // timer is started
		if(play) {
			// intersection between ball and paddle
			if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8))) {
				ballYdir = -ballYdir;
			}

			// the first map here is the MapGenerator type map in GamePlay
			// the second map is the array from MapGenerator
			// so we are accessing the 2D array with the map object 
			// we have created in this class
			A: for(int i = 0; i < map.map.length; i++) {
				for(int j = 0; j< map.map[0].length; j++ ) {
					if(map.map[i][j] > 0) { // if > 0 then detect intersection
						int brickX = j * map.brickWidth + 80;
						int brickY = i * map.brickHeight + 50;
						int brickWidth = map.brickWidth;
						int brickHeight = map.brickHeight;

						// rectangle created around brick
						Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
						//rectangle created around ball to detect intersection
						Rectangle ballRect = new Rectangle(ballposX, ballposY, 20, 20);
						Rectangle brickRect = rect;

						// if the ball rect intersects with the brick rect then the brick value is set to 0
						if(ballRect.intersects(brickRect)) {
							map.setBrickValue(0, i, j);
							totalBricks--;
							score += 5;

							// for left and right intersection
							// .x is the top left of the rectangle
							if(ballposX + 19 <= brickRect.x  || ballposX + 1 >= brickRect.x + brickRect.width) {
								ballXdir = -ballXdir;
							}
							else {
								ballYdir = -ballYdir;
							}

							break A; // breaks out of outer loop
						}
					}
				}
			}


			ballposX += ballXdir; // this increments the ball position
			ballposY += ballYdir;

			// this changes the ball direction to be positive 
			// so it doesn't go out of bounds
			if(ballposX < 0) { // for the left border
				ballXdir = -ballXdir;
			}
			if(ballposY < 0) { // for the top border
				ballYdir = -ballYdir;
			}
			if(ballposX > 670) { // for the right border
				ballXdir = -ballXdir;
			}
		}

		repaint(); 
		// this will recall the paint method and draw everything again
		// when the move right/left method is called there is no change 
		// to the display unless you draw everything again
	}

	// the following 2 methods are not used but are kept in because an error occurs 
	// if they are not
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}

	// this used to detect the arrow keys
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (playerX >= 600) { // ensures the player doesn't go over the x boundary
				playerX = 600;
			} else {
				moveRight();
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (playerX < 10) { // ensures the player doesn't go over the y boundary
				playerX = 10;
			} else {
				moveLeft();
			}
		}
	}

	public void moveRight() {
		play = true; // game starts and ball starts moving upon this keystroke
		playerX += 20; // move 20 places to right on right keystroke
	}
	public void moveLeft() {
		play = true;
		playerX -= 20; // move 20 places to left on left keystroke
	}



}
