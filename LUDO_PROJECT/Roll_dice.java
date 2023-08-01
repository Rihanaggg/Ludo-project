package LUDO_PROJECT;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class Roll_dice {
    private Label diceLabel;

    public FlowPane createControls() {
        FlowPane controls = new FlowPane();
        controls.setHgap(10);
        controls.setPadding(new Insets(10));

        Button rollButton = new Button("Roll dice");
        rollButton.setOnAction(event -> {
            int roll = (int)(Math.random() * 6 + 1);
            diceLabel.setText("Dice: " + roll);
        });
        controls.getChildren().add(rollButton);

        diceLabel = new Label("Dice: ");
        controls.getChildren().add(diceLabel);

        return controls;
    }

    public static void moveCoin()
    {
        
    }

}
