import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Coin class for coins objects
 class Coin {
	int x,y;
	int current;
	int height,width;
	public Coin(int h,int w){ 
		current=-1;
		x=-1;
		y=-1;
		height=h;
		width=w;
	}

	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}
	//this function draws coins
	public void draw(Graphics2D g, int i, int j,int player) { //this is for the inital position of the coin
		if(current==-1) { 
			int temp1=80+(height/2);
			int temp2=50+(width/2); 
			x=i;
			y=j; 
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
			g.fillOval(temp1+5+(i*width),temp2+5+(j*height),width-10,height-10); 
			g.setStroke(new BasicStroke(3)); 
			g.setColor(Color.BLACK);
	    	g.drawOval(temp1+5+(i*width),temp2+5+(j*height),width-10,height-10); 
		}
		else //this is when coin is outside house
		{ 
			int temp1=80,temp2=50; 
			x=Path.ax[player][current]; 
			y=Path.ay[player][current];
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
			g.fillOval(temp1+5+(x*width),temp2+5+(y*height),width-10,height-10); 
			g.setStroke(new BasicStroke(2)); 
			g.setColor(Color.BLACK);
	    	g.drawOval(temp1+5+(x*width),temp2+5+(y*height),width-10,height-10); 
		}
	}
}