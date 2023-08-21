import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFrame;

class Testing {
	   public static void main(String[] args) {
	        JFrame jframe = new JFrame();
	        jframe.setBounds(10,10,1000,600);
            jframe.setBackground(new Color(0XFFFFFF));
	        jframe.setTitle("LUDO");
	        jframe.setResizable(true);
	        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        Game gm = new Game();
	        gm.setFocusable(true);
	        gm.addKeyListener(gm);
	        gm.addMouseListener(gm);
	        jframe.add(gm);
	        jframe.setVisible(true);

			Game game = new Game();

			Database db = new Database();
			Functionality fun  = new Functionality();

			PreparedStatement insert = null;
			Connection cnx = null;

			if(game.isGameCompleted){
				fun.insertGame(db.DBConnection(cnx), insert , game.winnerPlayerIndex , game.isGameCompleted );
			}
	    }
}