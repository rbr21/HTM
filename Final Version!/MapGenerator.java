import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator 
{
	public int map[][];
	public int brickWidth;
	public int brickHeight;
	
	// constructor
	public MapGenerator (int row, int col){
		map = new int[row][col];		
		for(int i = 0; i<map.length; i++){ // row iterate
			for(int j = 0; j<map[0].length; j++) // col iterate
			{// 1 shows the brick is present
				map[i][j] = 1;
			}			
		}
		
		brickWidth = 540/col;
		brickHeight = 150/row;
	}	

	//when this method is called, bricks will be drawn on the particular
	// positions whose value is one
	public void draw(Graphics2D g){
		for(int i = 0; i<map.length; i++){
			for(int j =0; j<map[0].length; j++){
				if(map[i][j] > 0){
					g.setColor(Color.orange);
					g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
					
					// this is just to show separate brick, game can still run without it
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);				
				}
			}
		}
	}
	
	public void setBrickValue(int value, int row, int col)
	{
		map[row][col] = value;
	}
}