package LUDO_PROJECT;
import javafx.scene.paint.Color;

public class Player {
     private String PlayerName ;
        private Color color;
        private int[][] PositionOfCoins;
        Player(String PlayerName , Color color ){
            this.PlayerName = PlayerName ;
            this.color = color ;
            this.PositionOfCoins = new int[4][4];
            for(int i=0 ; i < 4 ; i++){
                PositionOfCoins[i][i] = -1;
            }
            
        }
        public String getName(){
            return PlayerName;
        }

        public Color getcolor(){
            return color;
        }

        public int[][] getPosition(){
            return PositionOfCoins ;
        }

}
