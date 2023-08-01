package LUDO_PROJECT;

import java.util.List;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class Roll_dice {
    private Label diceLabel;

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
        boolean success = squares.get(coin.getRow()).get(coin.getCol()).getChildren().remove(coin);
        System.out.println(success);
        System.out.println("row" + coin.getRow() + "col" + coin.getCol());

        coin.setRow(7);
        coin.setCol(roll);
        System.out.println("row" + coin.getRow() + "col" + coin.getCol());
        // squares.get(7).get(roll).getChildren().add(coin);
        boolean fail = squares.get(coin.getRow()).get(coin.getCol()).getChildren().add(coin);
        System.out.println(fail);

    }

}
