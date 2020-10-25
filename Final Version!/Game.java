import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.GridLayout;



public class Game {

	String textIWant = "";
	JFrame window;  //non-static
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel,titleNamePanel2, choiceButtonPanel, textfieldpanel;
	JLabel titleNameLabel, titleNameLabel2, tf, tf2, labelM;
	JButton startButton, choice1, choice2, choice3,choice4,b;


	JTextArea mainTextArea;
	String position;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font normalFont = new Font("Courier", Font.PLAIN, 18);
	Font sceneFont = new Font("Courier", Font.PLAIN, 18);


	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler cHandler = new ChoiceHandler();

	public Gameplay playGame() {
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay(this);
		obj.setBounds(10, 10, 700, 600); //starting x coord, y coord, width, height
		obj.setTitle("FIREWALL ACTIVATED---BREAK TO PROCEED");
		obj.setResizable(false);
		obj.setVisible(true);
		//obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);

		return gamePlay;
	}

	public void endGame(Gameplay gameplay) {
		if (gameplay.loss) {
			introduction();
		}
	}

	public static void main(String[] args) {
		new Game();
	}


	public void nameInput(){

		JFrame f = new JFrame("The PHISHER");
		JButton b=new JButton("Submit");
		b.setBounds(80,200,140, 40);
		f.add(b);

		//set size and location of frame
		f.setSize(390, 300);
		f.setLocation(100, 150);
		//make sure it quits when x is clicked

		//set look and feel
		f.setDefaultLookAndFeelDecorated(true);
		JLabel labelM = new JLabel("Input your Secret Agent name");
		labelM.setBounds(50, 50, 200, 30);
		JLabel label1 = new JLabel("hello");
		label1.setBounds(10, 110, 200, 100);

		JTextField textfield = new JTextField();
		//set size of the text box
		textfield.setBounds(50, 100, 200, 30);
		//add elements to the frame
		f.add(labelM);
		f.add(textfield);
		f.setLayout(null);
		f.setVisible(true);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				textIWant = textfield.getText();
				//labelM.setText(textIWant);
				f.dispose();
				f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			}

		});
	}

	public void backDoorInput(){

		JFrame f = new JFrame("The PHISHER");
		JButton b=new JButton("Attempt Entry");
		b.setBounds(80,200,140, 40);
		f.add(b);

		//set size and location of frame
		f.setSize(390, 300);
		f.setLocation(100, 150);
		//make sure it quits when x is clicked

		//set look and feel
		f.setDefaultLookAndFeelDecorated(true);
		JLabel labelM = new JLabel("Enter the 4 digit pin-code");
		labelM.setBounds(50, 50, 200, 30);
		JLabel label1 = new JLabel("hello");
		label1.setBounds(10, 110, 200, 100);

		JTextField textfield = new JTextField();
		//set size of the text box
		textfield.setBounds(50, 100, 200, 30);
		//add elements to the frame
		f.add(labelM);
		f.add(textfield);
		f.setLayout(null);
		f.setVisible(true);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				textIWant = textfield.getText();
				//labelM.setText(textIWant);
				f.dispose();
				f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			}

		});
	}

	public void firstLaptopPassword(){

	     JFrame f = new JFrame("The PHISHER");
	     JButton b=new JButton("Attempt Entry");
	     b.setBounds(80,200,140, 40);
	     f.add(b);

	     //set size and location of frame
	     f.setSize(390, 300);
	     f.setLocation(100, 150);
	     //make sure it quits when x is clicked

	     //set look and feel
	     f.setDefaultLookAndFeelDecorated(true);
	     JLabel labelM = new JLabel("what is the password?");
	     labelM.setBounds(50, 50, 200, 30);
	     JLabel label1 = new JLabel("hello");
	     label1.setBounds(10, 110, 200, 100);

	     JTextField textfield = new JTextField();
	     //set size of the text box
	     textfield.setBounds(50, 100, 200, 30);
	     //add elements to the frame
	     f.add(labelM);
	     f.add(textfield);
	     f.setLayout(null);
	     f.setVisible(true);

	     b.addActionListener(new ActionListener() {

	       @Override
	         public void actionPerformed(ActionEvent arg0) {
	                 textIWant = textfield.getText();
	                 //labelM.setText(textIWant);
	                 f.dispose();
	                 f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	         }

	         });
	   }


	public void bookNameInput(){

	     JFrame f = new JFrame("The PHISHER");
	     JButton b=new JButton("Submit");
	     b.setBounds(80,200,140, 40);
	     f.add(b);

	     //set size and location of frame
	     f.setSize(390, 300);
	     f.setLocation(100, 150);
	     //make sure it quits when x is clicked

	     //set look and feel
	     f.setDefaultLookAndFeelDecorated(true);
	     JLabel labelM = new JLabel("Input a Book Title. All in lowercase!");
	     labelM.setBounds(50, 50, 200, 30);
	     JLabel label1 = new JLabel("hello");
	     label1.setBounds(10, 110, 200, 100);

	     JTextField textfield = new JTextField();
	     //set size of the text box
	     textfield.setBounds(50, 100, 200, 30);
	     //add elements to the frame
	     f.add(labelM);
	     f.add(textfield);
	     f.setLayout(null);
	     f.setVisible(true);

	     b.addActionListener(new ActionListener() {

	       @Override
	         public void actionPerformed(ActionEvent arg0) {
	                 textIWant = textfield.getText();
	                 //labelM.setText(textIWant);
	                 f.dispose();
	                 f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	         }

	         });
	   }




	public Game() {
		//this makes the window
		window = new JFrame();
		window.setSize(1000, 1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();    //geenrates title area

		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100,100,600,150);      //(x axis, y axis, width, height)
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("THE PHISHER");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);

		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300,400,200,100);
		startButtonPanel.setBackground(Color.black);

		titleNamePanel.add(titleNameLabel);
		con.add(titleNamePanel);


		startButton = new JButton("Start");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);   //if button is clicked, title screen handler will be activited and call game screen
		startButtonPanel.add(startButton);

		con.add(startButtonPanel);

		nameInput();
	}
	/*

     JFrame f = new JFrame("The PHISHER");
     JButton b=new JButton("Submit");
     b.setBounds(100,100,140, 40);
     f.add(b); }




       public static void Simplefield(){

     //set size and location of frame
     f.setSize(390, 300);
     f.setLocation(100, 150);
     //make sure it quits when x is clicked
    // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //set look and feel
     f.setDefaultLookAndFeelDecorated(true);
     JLabel labelM = new JLabel("Enter your name");
     labelM.setBounds(50, 50, 200, 30);
     JLabel label1 = new JLabel("hello");
     label1.setBounds(10, 110, 200, 100);

     JTextField textfield = new JTextField();
     //set size of the text box
     textfield.setBounds(50, 100, 200, 30);
     //add elements to the frame
     f.add(labelM);
     f.add(textfield);
     f.setLayout(null);
     f.setVisible(true);

     b.addActionListener(new ActionListener() {

       @Override
         public void actionPerformed(ActionEvent arg0) {
                 String textIWant = textfield.getText();
                 labelM.setText(textIWant);
         }

         });



  } */

	public void createGameScreen(){

		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100,50,700,400);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(100,50,700,400);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(sceneFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextPanel.add(mainTextArea);

		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(100,500,600,100);
		choiceButtonPanel.setBackground(Color.red);
		choiceButtonPanel.setLayout(new GridLayout(4,1))
		;con.add(choiceButtonPanel); //makes it happen

		choice1 = new JButton("K");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.green);
		choice1.setFont(normalFont);
		choice1.addActionListener(cHandler);
		choiceButtonPanel.add(choice1);
		choice1.setActionCommand("c1");

		choice2 = new JButton("Break the Window");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.green);
		choice2.setFont(normalFont);
		choice2.addActionListener(cHandler);
		choiceButtonPanel.add(choice2);
		choice2.setActionCommand("c2");


		choice3 = new JButton("Try the Back Door");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.green);
		choice3.setFont(normalFont);
		choice3.addActionListener(cHandler);
		choiceButtonPanel.add(choice3);
		choice3.setActionCommand("c3");


		choice4 = new JButton();
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.green);
		choice4.setFont(normalFont);
		choice4.addActionListener(cHandler);
		choiceButtonPanel.add(choice4);
		choice4.setActionCommand("c4");

		introduction();


	}

	public void introduction() {

		position = "intro";

		mainTextArea.setText("*INCOMING MESSAGE*\n"
				+ "Be aware, The PHISHER, loves novelty security tech. You will need to find out some information about him. We do not have anything on our CIA database, but the PHISHER is a social media addict. We have everything we need to know about them on @thePHISHER86. \n"
				+ "\n"
				+ "\n"
				+ "You have everything you need Agent "  + textIWant
				+ "\n"
				+ "You have arrived at the house. From the outside, it looks like a two storey house, but you know that most evil villains have basements to do their evil activities. You approach the building:\n"
				+ "");

		//Knock on the front door
		//Try the back door
		//Break the window

		choice1.setText("Knock on the front door");
		choice2.setText("Try the back door");
		choice3.setText("Break the window");
		choice4.setText("");

	}

	public void knockDoor() {

		position = "knockingDoor";

		mainTextArea.setText("Security camera spots you it and connects directly to the phone of THE PHISHER. RUN!\n"
				+ "\n"
				+ "Always use the element of the surprise!\n"
				+ "GAME OVER ");

		//Knock on the front door
		//Try the back door
		//Break the window

		choice1.setText("Start again");
		choice2.setText("exit");
		choice3.setText("");
		choice4.setText("");

	}

	public void backDoor() {

		position = "back";

		mainTextArea.setText("You open the back door but trigger the house alarm. You have to turn it off before you get caught! You study the pin pad and realise its a four digit numeric combination. What do you remember that could help?\n"
				+ "From your Cyber Security training, you know that people like to use memorable passwords. What is memorable, but also a number? \n");


		backDoorInput();

		choice1.setText("Confirm Password");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");


	}

	public void window() {

		position = "window";
		mainTextArea.setText("By breaking the glass, you cut an artery. You stopped the bleeding, but you need to get to a hospital ASAP. You wasted time, Agent Tor was killed! GAME OVER!");

		choice1.setText("Start Again");
		choice2.setText("exit");
		choice3.setText("");
		choice4.setText("");

	}

	public void enterGroundFloor() {

		position = "ground";
		String lesson1 = "23% of people chose a PIN representing a date, and nearly a third of these used their own birthday!"
				+ " \n Plus... 99% of people have ID with their birthday in their wallet! "
				+ "\n Lesson 1 - Choose a secure password";

		mainTextArea.setText(lesson1 + ". You enter the ground floor. "
				+ "You see stairs leading upstairs, "
				+ "and stairs leading downstairs.");

		choice1.setText("Explore ground floor");
		choice2.setText("Go upstairs");
		choice3.setText("Go downstairs");
		choice4.setText("");

	}

	public void explore() {

		position = "groundTwo";

		mainTextArea.setText("You have chosen to stay on the ground floor. "
				+ "You look around and find a picture hidden behind the sofa "
				+ "and a letter on the dining table. "
				+ "Do you:");

		choice1.setText("Look at the picture");
		choice2.setText("Look at the letter");
		choice3.setText("Stop exploring ground floor");
		choice4.setText("");

	}

	public void goUpstairs() {

		position = "upstairs";

		mainTextArea.setText("You have chosen to go upstairs. You carefully open each door and find a secret office. "
				+ "You enter and snoop around. "
				+ "Do you:");

		choice1.setText("Look through the bookshelf");
		choice2.setText("Look through the laptop on the desk");
		choice3.setText("Look inside the draw");
		choice4.setText("Go back to ground floor");
	}

	public void goDownstairs() {

		position = "downstairs";

		mainTextArea.setText("You have chosen to go downstairs. You halt immediately. "
				+ "You see red lasers everywhere. They will almost certainly cause a slow "
				+ "and painful death. Are you feeling flexible? ");

		choice1.setText("Risk it for a biscuit");
		choice2.setText("Go to the ground floor for clues");
		choice3.setText("Go to straight upstairs for clues");
		choice4.setText("");

	}

	public void picture() {

			position = "pic";
		  String picture = "";

		  mainTextArea.setText(picture);

		  choice1.setText("Examine the letter");
		  choice2.setText("Go Upstairs");
		  choice3.setText("Go downstairs");
		  choice4.setText("");
	}

	public void letter() {

		position = "letter";

		mainTextArea.setText("You see a love letter on the dining table addressed to Miss Kat Fish.\n"
				+ " ");

		choice1.setText("Read love letter");
		choice2.setText("Ignore and go back to snooping");
		choice3.setText("");
		choice4.setText("");
	}

	public void love() {

		position = "love";

		mainTextArea.setText("Dear Kat,\n"
				+ "\n"
				+ "I miss you every day and I regret breaking your heart by faking my profile picture. I promise you I am the same guy you were talking to. IT IS STILL ME. YOU FELL IN LOVE WITH ME NOT MY PICTURE. Please message me back. I love you.\n"
				+ "\n"
				+ "With all my heart,\n"
				+ "Your dear Phishy Poo\n"
				+ "");

		choice1.setText("Go back to snooping");
		choice2.setText("Go Upstairs ");
		choice3.setText("Go Downstairs");
		choice4.setText(" ");
	}

	public void bookshelf() {
		position = "book";

		mainTextArea.setText("You have chosen to look through the bookshelf. There are thousands of books,"
				+ " but you see such classics as Kidnapping for Dummies, "
				+ "Encyclopedia Britannica and Head First Java. Maybe one of these books hold a clue?"
				+ " ");

		  choice1.setText("Examine books");
		  choice2.setText("Look through the laptop on the desk ");
		  choice3.setText("Look inside draw ");
		  choice4.setText(" ");
	}

	public void laptop() {
		position = "laptop";

		mainTextArea.setText("You have chosen to look through the laptop. "
			      + "You put on your gloves and carefully open the laptop. "
			      + "It is password protected. This time, it requires three letters. "
			      + "so far, we know that THE PHISHER, has terrible passwords "
			      + "Common passwords are names, footballteams, and fictional characters "
			      + "2020 had a lot of ILOVE.. type passwords "
			      + "Perhaps we can guess his password based on common patterns. ");

		  firstLaptopPassword();

		  choice1.setText("Confirm Attempt");
		  choice2.setText("Go Downstairs");
		  choice3.setText("Go to Groundfloor");
		  choice4.setText(" ");
	}

	public void draw() {
		position = "draw";

		mainTextArea.setText("meme");

		choice1.setText("Check laptop instead ");
		choice2.setText("Check bookcase instead ");
		choice3.setText("Go back to ground floor ");
		choice4.setText(" ");
	}

	public void biscuit() {
		position = "biscuit";

		mainTextArea.setText("You try to wiggle around the lasers, but they  are powered by a motion detector "
				+ "that randomises the rays when someone is present. You are seriously injured, and found by the PHISHER\n"
				+ "GAME OVER but at least you got the biscuit.\n"
				+ "");

		choice1.setText("Start Again");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}

	public void pickBook() {
		position = "pick";

		mainTextArea.setText("There are 1000s of books, you do not have time to go through them all. If there is a clue to the location of Agent Tor "
				+ "What book should you be looking for?");

	    bookNameInput();
	    choice1.setText("Enter and Confirm Book title");
	    choice2.setText("Go back laptop");
	    choice3.setText("Check Draw ");
	    choice4.setText("Go to ground floor");

	}
	 public void note() {
		   position = "note";

		   mainTextArea.setText("fallout game ");

		    choice1.setText("idk");
		    choice2.setText("Go back and guess the password");
		    choice3.setText(" ");
		    choice4.setText(" ");
		 }

		 public void endScreen() {
		   position = "endScreen";
		   mainTextArea.setText("Amazing Job. You have recovered Agent Tor. "
		   + "He had a firewall, but he has not updated it since 2007, so it was quickly disabled "
		   + "Always keep your firewalls and antiviruses updated!");

		   choice1.setText(" ");
		   choice2.setText(" ");
		   choice3.setText(" ");
		   choice4.setText(" ");

		 }

		 public void noteInBook() {
		   position = "booknote";
		   mainTextArea.setText("You find a picture of a cat with initials on the reverse: K.F, hmm...");

		   choice1.setText("Go to laptop");
		   choice2.setText("Go Downstairs");
		   choice3.setText("Go to Ground ");
		   choice4.setText("");

		 }


		 public void finalLaptopPassword() {
		   position = "laststage";
		   mainTextArea.setText("You managaed to guess the password, but you underestimated him. He has a crazy firewall installed");

		   choice1.setText("Crack the Firewall");
		   choice2.setText("Go Downstairs");
		   choice3.setText("Go to Ground");
		   choice4.setText("");

		 }

	public class TitleScreenHandler implements ActionListener{

		public void actionPerformed(ActionEvent event){

			createGameScreen();   // when calling new screen, previous screen must disapear


		}              //

	}
	public class ChoiceHandler implements ActionListener {

		public void actionPerformed(ActionEvent event){


			  String yourChoice = event.getActionCommand();
			  switch(position) {
			  case "intro":
			    switch(yourChoice) {
			    case "c1": knockDoor(); break;
			    case "c2": backDoor(); break;
			    case "c3": window(); break;
			    } break;
			  case "knockingDoor":
			    switch(yourChoice) {
			    case "c1": introduction(); break;
			    } break;
			  case "back":
			    switch(yourChoice) {
			    case "c1":
			      if (textIWant.equals("0130")){
			         enterGroundFloor();
			      }
			      else {
			        backDoor();
			      }

			     break;
			    } break;
			  case "window":
			    switch(yourChoice) {
			    case "c1": introduction(); break;
			    } break;
			  case "ground":
			    switch(yourChoice) {
			    case "c1": explore(); break;
			    case "c2": goUpstairs(); break;
			    case "c3": goDownstairs(); break;
			    } break;
			  case "groundTwo":
			    switch(yourChoice) {
			    case "c1": picture(); break;
			    case "c2": letter(); break;
			    case "c3": enterGroundFloor(); break;
			    } break;
			  case "upstairs":
			    switch(yourChoice) {
			    case "c1": bookshelf(); break;
			    case "c2": laptop(); break;
			    case "c3": draw(); break;
			    case "c4": enterGroundFloor(); break;
			    } break;
			  case "downstairs":
			    switch(yourChoice) {
			    case "c1": biscuit(); break;
			    case "c2": enterGroundFloor(); break;
			    case "c3": goUpstairs(); break;
			    } break;
			  case "pic":
			    switch(yourChoice) {
			    case "c1": letter(); break;
			    }break;
			    case "c2": goUpstairs(); break;
			    case "c3": goDownstairs(); break;
			  case "letter":
			    switch(yourChoice) {
			    case "c1": love(); break;
			    case "c2": explore(); break;
			    } break;
			  case "love":
			    switch(yourChoice) {
			    case "c1": explore(); break;
			    case "c2": goUpstairs(); break;
			    case "c3": goDownstairs(); break;
			    } break;
			  case "book":
			    switch(yourChoice) {
			    case "c1": pickBook(); break;
			    case "c2": laptop(); break;
			    case "c3": draw(); break;
			    } break;
			  case "laptop":
			    switch(yourChoice) {
			    case "c1":
			    if (textIWant.equalsIgnoreCase("ilovekat")){
			      finalLaptopPassword(); }
			    else {
			      laptop();
			    } ; break;
			    case "c2": goDownstairs(); break;
			    case "c3": enterGroundFloor(); break;
			    } break;
			  case "draw":
			    switch(yourChoice) {
			    case "c1": laptop(); break;
			    case "c2": bookshelf(); break;
			    case "c3": enterGroundFloor(); break;
			    } break;
			  case "biscuit":
			    switch(yourChoice) {
			    case "c1": introduction(); break;
			    } break;
			  case "pick":
			    switch(yourChoice) {
			    case "c1":
			      if (textIWant.equals("the shortest history of germany")){
			        noteInBook();}
			    else {  pickBook();} break;
			    case "c2": laptop(); break;
			    case "c3": draw(); break;
			    case "c4": enterGroundFloor(); break;} break;

			  case "booknote":
			    switch(yourChoice){
			      case "c1": laptop();break;
			      case "c2": goDownstairs();break;
			      case "c3": enterGroundFloor();break;
			    }break;

			  case "insta":
			    switch(yourChoice) {
			    case "c1": introduction(); break;
			    case "c2": note(); break;
			    } break;
			  case "blog":
			    switch(yourChoice) {
			    case "c1": introduction(); break;
			    case "c2": note(); break;
			  } break;
			  case "laststage":
			    switch(yourChoice){
			      case "c1": Gameplay playGame = playGame();
			        endScreen();
			        break;
			      case "c2": goDownstairs();break;
			      case "c3": enterGroundFloor(); break;

			    }


			  case "note":
			    switch(yourChoice) {
			    case "c1": introduction(); break;
			    } break;
			    }


			  }

			}}
