package LUDO_PROJECT;
import javafx.scene.shape.Circle;

public class Coins extends Circle {
        private int row;
        private int col;
        private String name;
        

        public Coins(int row, int col, String name, double radius) {
            super(radius);
            this.row = row;
            this.col = col;
            this.name = name;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getCol() {
            return col;
        }

        public String getname()
        {
            return name;
        }

        public void setCol(int col) {
            this.col = col;
        }

        public boolean isHome(){
            return true;
        }

        public boolean isFinalPath(){
            return false;            
        }         
    
    }
