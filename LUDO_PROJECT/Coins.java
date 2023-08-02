package LUDO_PROJECT;
import javafx.scene.shape.Circle;

public class Coins extends Circle {
        private int row;
        private int col;
        private String color;
        

        public Coins(int row, int col, String color, double radius) {
            super(radius);
            this.row = row;
            this.col = col;
            this.color = color;
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

        public String getcolor()
        {
            return color;
        }

        public void setCol(int col) {
            this.col = col;
        }

        public boolean isHome(){
            Coins c = new Coins(row, col,"RED", col);
            switch(color){
                case "RED":
                    if(c.getRow() == 2 && c.getCol() == 2 ){
                        return true;
                    }else if(c.getRow() ==2 && c.getCol() == 3){
                        return true;
                    }else if(c.getRow() ==3 && c.getCol() == 2){
                        return true;
                    }else if(c.getRow() ==3 && c.getCol() == 3){
                        return true;
                    }
                    break;
                
                case "YELLOW":
                   if(c.getRow() == 11 && c.getCol() == 2 ){
                        return true;
                    }else if(c.getRow() ==11 && c.getCol() == 3){
                        return true;
                    }else if(c.getRow() ==12 && c.getCol() == 2){
                        return true;
                    }else if(c.getRow() ==12 && c.getCol() == 3){
                        return true;
                    } 
                    break;

                case "BLUE":
                    if(c.getRow() == 11 && c.getCol() == 11 ){
                        return true;
                    }else if(c.getRow() ==11 && c.getCol() == 12){
                        return true;
                    }else if(c.getRow() ==12 && c.getCol() == 11){
                        return true;
                    }else if(c.getRow() ==12 && c.getCol() == 12){
                        return true;
                    }
                    break;
                
                case "GREEN":
                   if(c.getRow() == 2 && c.getCol() == 11 ){
                        return true;
                    }else if(c.getRow() ==2 && c.getCol() == 12){
                        return true;
                    }else if(c.getRow() ==3 && c.getCol() == 11){
                        return true;
                    }else if(c.getRow() ==3 && c.getCol() == 12){
                        return true;
                    } 
                    break;
            }
            return false;
        }

        // public boolean isHome(){
        //     return true;            
        // } 

        public boolean isFinalPath(){
            return false;            
        }         
    
    }
