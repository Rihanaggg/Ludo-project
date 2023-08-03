import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Coin class to store Coin information
 class Coin {
	int x,y;
	int current;
	int height,width;
	public Coin(int h,int w){ // Constructor to initialize Coin
		current=-1;
		x=-1;
		y=-1;
		height=h;
		width=w;
	}
	// Function to draw Coin on board 
	public void draw(Graphics2D g, int i, int j,int player) {
		if(current==-1) { // If Coin is not on board 
			int temp1=80+(height/2);
			int temp2=50+(width/2); // Initial position of Coin 
			x=i; // x coordinate of Coin
			y=j; // y coordinate of Coin
			if(player==0) { // If player 1 
				g.setColor(Color.RED); // Color of Coin
			}
			else if(player==1) { // If player 2
				g.setColor(Color.GREEN); // Color of Coin
			} 
			else if(player==2) { // If player 3
				g.setColor(Color.YELLOW); // Color of Coin
			}
			else if(player==3) { // If player 4
				g.setColor(Color.BLUE); // Color of Coin
			}
			g.fillOval(temp1+5+(i*width),temp2+5+(j*height),width-10,height-10); // Drawing Coin on board
			g.setStroke(new BasicStroke(3)); // Thickness of border
			g.setColor(Color.BLACK); // Color of border
	    	g.drawOval(temp1+5+(i*width),temp2+5+(j*height),width-10,height-10); // Drawing border of Coin
		}
		else 
		{ // If Coin is on board 
			int temp1=80,temp2=50; // Initial home position of board
			x=Path.ax[player][current]; // x coordinate of Coin
			y=Path.ay[player][current]; // y coordinate of Coin
			if(player==0) {
				g.setColor(Color.RED);
			}
			else if(player==1) {
				g.setColor(Color.GREEN);
			}
			else if(player==2) {
				g.setColor(Color.YELLOW);
			}
			else if(player==3) {
				g.setColor(Color.BLUE);
			}
			g.fillOval(temp1+5+(x*width),temp2+5+(y*height),width-10,height-10); // Drawing Coin on board
			g.setStroke(new BasicStroke(2)); // Thickness of border
			g.setColor(Color.BLACK);
	    	g.drawOval(temp1+5+(x*width),temp2+5+(y*height),width-10,height-10); // Drawing border of Coin
		}
	}
}