import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Test extends Application {
    private static final int BOARD_SIZE = 15;
    private static final int SQUARE_SIZE = 40;

    private Label diceLabel;

    @Override
    public void start(Stage primaryStage) {
        // Create a border pane to hold the game board and controls
        BorderPane root = new BorderPane();

        // Create a grid pane to hold the game board
        GridPane board = new GridPane();
        board.setHgap(1);
        board.setVgap(1);
        board.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));

        // Add squares to the game board
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                StackPane square = new StackPane();
                square.setPrefSize(SQUARE_SIZE, SQUARE_SIZE);

                Rectangle background = new Rectangle(SQUARE_SIZE, SQUARE_SIZE);
                background.setFill(Color.WHITE);

				if (row < 6 && col < 6) background.setFill(Color.RED);
                if (row < 6 && col > 8) background.setFill(Color.GREEN);
                if (row > 8 && col < 6) background.setFill(Color.YELLOW);
                if (row > 8 && col > 8) background.setFill(Color.BLUE);

                // Color the home rows
                if (row == 7 && col < 6 && col > 0) background.setFill(Color.RED);
                if (row < 6 && row > 0 && col == 7) background.setFill(Color.GREEN);
                if (row == 7 && col > 8 && col < 14) background.setFill(Color.BLUE);
                if (row > 8 && row < 14 && col == 7) background.setFill(Color.YELLOW);

				if(row == 6 && col == 1) background.setFill(Color.RED);
				if(row == 1 && col == 8) background.setFill(Color.GREEN);
				if(row == 8 && col == 13) background.setFill(Color.BLUE);
				if(row == 13 && col == 6) background.setFill(Color.YELLOW);

				if (row > 0 && row < 5 && col > 0 && col < 5) background.setFill(Color.WHITE);
                if (row < 5 && row > 0 && col > 9 && col < 14) background.setFill(Color.WHITE);
                if (row > 9 && row < 14 && col < 5 && col > 0) background.setFill(Color.WHITE);
                if (row > 9 && row < 14 && col > 9 && col > 1 && col < 14) background.setFill(Color.WHITE);



				
                if ((row == 6 || row == 8) && col > 5 && col < 9) background.setFill(Color.BLACK);
                if ((col == 6 || col == 8) && row > 5 && row < 9) background.setFill(Color.BLACK);

                if (row >9&& row<14&&col<5&&col>0){
                    Circle coin = new Circle(SQUARE_SIZE /2-2 );
                    coin.setFill(Color.YELLOW); // Change the color as needed
                    square.getChildren().add(coin);
                }
                if (row >9&& row<14&&col>9&&col>1&&col<14){
                    Circle coin = new Circle(SQUARE_SIZE /2-2 );
                    coin.setFill(Color.BLUE); // Change the color as needed
                    square.getChildren().add(coin);
                }

				
                if ((row == 6 || row == 8) && col >5&&col<9){
                    Circle coin = new Circle(SQUARE_SIZE /2-2 );
                    coin.setFill(Color.BLACK); // Change the color as needed
                    square.getChildren().add(coin);
                }
                if ((col ==6||col==8)&&row>5&&row<9){
                    Circle coin = new Circle(SQUARE_SIZE /2-2 );
                    coin.setFill(Color.BLACK); // Change the color as needed
                    square.getChildren().add(coin);
                }

                square.getChildren().add(background);

                
				if (row > 1 && row < 4 && col > 1 && col < 4) {
                    Circle coin = new Circle(SQUARE_SIZE / 2 - 2);
                    coin.setFill(Color.RED); // Change the color as needed
                    square.getChildren().add(coin);
                }
                if (row < 4 && row > 1 && col > 10 && col < 13) {
                    Circle coin = new Circle(SQUARE_SIZE / 2 - 2);
                    coin.setFill(Color.GREEN); // Change the color as needed
                    square.getChildren().add(coin);
                }
                if (row > 10 && row < 13 && col < 4 && col > 1) {
                    Circle coin = new Circle(SQUARE_SIZE / 2 -2 );
                    coin.setFill(Color.YELLOW); // Change the color as needed
                    square.getChildren().add(coin);
                }
                if (row > 10 && row < 13 && col > 10 && col > 9 && col < 13){
                    Circle coin = new Circle(SQUARE_SIZE /2-2 );
                    coin.setFill(Color.BLUE); // Change the color as needed
                    square.getChildren().add(coin);
                }

                board.add(square, col, row);
            }
        }
            
        root.setCenter(board);

        // Create a flow pane to hold the controls
        FlowPane controls = new FlowPane();
        controls.setHgap(10);
        controls.setPadding(new Insets(10));

        // Add a button for rolling the dice
        Button rollButton = new Button("Roll dice");
        rollButton.setOnAction(event -> {
            int roll = (int)(Math.random() * 6 +1 );
            diceLabel.setText("Dice: " + roll);
        });
        controls.getChildren().add(rollButton);

        // Add a label to display the result of rolling the dice
        diceLabel = new Label("Dice: ");
        controls.getChildren().add(diceLabel);

        root.setBottom(controls);

        // Create a scene and add the root pane to it
        Scene scene = new Scene(root);

        // Set up the primary stage
        primaryStage.setTitle("Ludo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
