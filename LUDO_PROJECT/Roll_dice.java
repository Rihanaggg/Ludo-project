package LUDO_PROJECT;

import java.util.List;
import java.util.Random;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;

public class Roll_dice {
    private Label diceLabel;

    private int maxValue;
    private Random random;
    private int consecutiveSixes ;

    private List<List<StackPane>> squares;
    private List<Coins> coins;
    public Roll_dice(List<List<StackPane>> squares, List<Coins> coins) {
        this.squares = squares;
        this.coins = coins;
    }

    public FlowPane createControls() {
        FlowPane controls = new FlowPane();
        controls.setHgap(10);
        controls.setPadding(new Insets(10));

        Button rollButton = new Button("Roll dice");
        rollButton.setOnAction(event -> {
            int roll = (int)(Math.random() * 6 + 1);
            diceLabel.setText("Dice: " + roll);
            this.moveCoin(coins.get(0),roll);
        });
        controls.getChildren().add(rollButton);

        diceLabel = new Label("Dice: ");
        controls.getChildren().add(diceLabel);

        return controls;
    }

    public void moveCoin(Coins coin , int roll)
    {
        if(coin.isHome() && roll == 6){

            coin.setRow(1);
            coin.setCol(6);
            squares.get(coin.getRow()).get(coin.getCol()).getChildren().remove(coin);
            squares.get(coin.getRow()).get(coin.getCol()).getChildren().add(coin);
        }else if(coin.isHome() && roll!=6){            
            coin.setRow(coin.getRow());
            coin.setCol(coin.getCol());
            squares.get(coin.getRow()).get(coin.getCol()).getChildren().remove(coin);
            squares.get(coin.getRow()).get(coin.getCol()).getChildren().add(coin);
        }else{
            coin.setRow(5);
            coin.setCol(roll);
            squares.get(coin.getRow()).get(coin.getCol()).getChildren().remove(coin);
            squares.get(coin.getRow()).get(coin.getCol()).getChildren().add(coin);

            
        }
        System.out.println("row" + coin.getRow() + "col" + coin.getCol());
        System.out.println("row" + coin.getRow() + "col" + coin.getCol());

    }

    public  int roll() {
        
        int diceValue = random.nextInt(maxValue) + 1;
        
        if(diceValue == 6){
            consecutiveSixes++ ;
            // for 3 times consecutive 6
            if(consecutiveSixes == 3){
                consecutiveSixes = 0;
                diceValue = 0;
            }else{
                //addition of 1 roll for getting 6
                diceValue += roll();
            }
        }else {
            consecutiveSixes = 0;
        }
        return diceValue;
    }   
    


}
