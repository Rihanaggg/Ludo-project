package LUDO_PROJECT;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class LudoBoard extends Pane {
    private static final int BOARD_SIZE = 600;
    private static final int SQUARE_SIZE = BOARD_SIZE / 15;

    public LudoBoard() {
        // Create the Ludo board layout with colored squares
        for (int row = 0; row < 15; row++) {
            for (int col = 0; col < 15; col++) {
                boolean isColoredSquare = ((row % 2 == 0 && col % 2 == 0) || (row % 2 != 0 && col % 2 != 0));
                Rectangle square = new Rectangle(col * SQUARE_SIZE, row * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
                square.setFill(isColoredSquare ? Color.LIGHTGRAY : Color.WHITE);
                this.getChildren().add(square);
            }
        }
    }
}
