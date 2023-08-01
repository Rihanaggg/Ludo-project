package LUDO_PROJECT;

import java.util.ArrayList;
import java.util.List;

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

    private static List<Coins> coins = new ArrayList<>();

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


                square.getChildren().add(background);

                
				/*if (row > 1 && row < 4 && col > 1 && col < 4)
                {
                    Circle coin = new Circle(SQUARE_SIZE / 2 - 2);
                    coin.setFill(Color.RED); 
                    square.getChildren().add(coin);
                }*/

                // red coins code
                if(row == 2 && col == 2)
                {
                    Circle coin_red_1 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_red_1.setFill(Color.RED); 
                    square.getChildren().add(coin_red_1);
                    coins.add(new Coins(row, col, coin_red_1, "coin_red_1"));
                }

                if(row == 2 && col == 3)
                {
                    Circle coin_red_2 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_red_2.setFill(Color.RED);
                    square.getChildren().add(coin_red_2);
                    coins.add(new Coins(row, col, coin_red_2, "coin_red_2"));

                }

                 if(row == 3 && col == 3)
                {
                    Circle coin_red_3 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_red_3.setFill(Color.RED);
                    square.getChildren().add(coin_red_3);
                    coins.add(new Coins(row, col, coin_red_3, "coin_red_3"));

                }

                 if(row == 3 && col == 2)
                {
                    Circle coin_red_4 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_red_4.setFill(Color.RED);
                    square.getChildren().add(coin_red_4);
                    coins.add(new Coins(row, col, coin_red_4, "coin_red_4"));

                }

                //green coins code

                if(row == 3 && col == 11)
                {
                    Circle coin_green_1 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_green_1.setFill(Color.GREEN);
                    square.getChildren().add(coin_green_1);
                    coins.add(new Coins(row, col, coin_green_1, "coin_green_1"));

                }

                if(row == 3 && col == 12)
                {
                    Circle coin_green_2 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_green_2.setFill(Color.GREEN);
                    square.getChildren().add(coin_green_2);
                    coins.add(new Coins(row, col, coin_green_2, "coin_green_2"));

                }

                if(row == 2 && col == 11)
                {
                    Circle coin_green_3 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_green_3.setFill(Color.GREEN);
                    square.getChildren().add(coin_green_3);
                    coins.add(new Coins(row, col, coin_green_3, "coin_green_3"));

                }

                if(row == 2 && col == 12)
                {
                    Circle coin_green_4 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_green_4.setFill(Color.GREEN);
                    square.getChildren().add(coin_green_4);
                    coins.add(new Coins(row, col, coin_green_4, "coin_green_4"));

                }
                
                //blue coins code

                if(row == 11 && col == 12)
                {
                    Circle coin_blue_1 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_blue_1.setFill(Color.BLUE);
                    square.getChildren().add(coin_blue_1);
                    coins.add(new Coins(row, col, coin_blue_1, "coin_blue_1"));

                }

                if(row == 12 && col == 12)
                {
                    Circle coin_blue_2 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_blue_2.setFill(Color.BLUE);
                    square.getChildren().add(coin_blue_2);
                    coins.add(new Coins(row, col, coin_blue_2, "coin_blue_2"));

                }

                if(row == 11 && col == 11)
                {
                    Circle coin_blue_3 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_blue_3.setFill(Color.BLUE);
                    square.getChildren().add(coin_blue_3);
                    coins.add(new Coins(row, col, coin_blue_3, "coin_blue_3"));

                }

                if(row == 12 && col == 11)
                {
                    Circle coin_blue_4 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_blue_4.setFill(Color.BLUE);
                    square.getChildren().add(coin_blue_4);
                    coins.add(new Coins(row, col, coin_blue_4, "coin_blue_4"));

                }
                
                //yellow coins code

                if(row == 11 && col == 2)
                {
                    Circle coin_yellow_1 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_yellow_1.setFill(Color.YELLOW);
                    square.getChildren().add(coin_yellow_1);
                coins.add(new Coins(row, col, coin_yellow_1, "coin_yellow_1"));
                }

                 if(row == 11 && col == 3)
                {
                    Circle coin_yellow_2 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_yellow_2.setFill(Color.YELLOW);
                    square.getChildren().add(coin_yellow_2);
                    coins.add(new Coins(row, col, coin_yellow_2, "coin_yellow_2"));
                }

                 if(row == 12 && col == 2)
                {
                    Circle coin_yellow_3 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_yellow_3.setFill(Color.YELLOW);
                    square.getChildren().add(coin_yellow_3);
                    coins.add(new Coins(row, col, coin_yellow_3, "coin_yellow_3"));
                }

                if(row == 12 && col == 3)
                {
                    Circle coin_yellow_4 = new Circle(SQUARE_SIZE / 2 - 2);
                    coin_yellow_4.setFill(Color.YELLOW);
                    square.getChildren().add(coin_yellow_4);
                    coins.add(new Coins(row, col, coin_yellow_4, "coin_yellow_4"));
                }


                board.add(square, col, row);
            }
        }
            
        root.setCenter(board);

       Roll_dice dice = new Roll_dice();
       root.setBottom(dice.createControls());

        // Create a scene and add the root pane to it
        Scene scene = new Scene(root);

        // Set up the primary stage
        primaryStage.setTitle("Ludo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
       
            System.out.println(coins.get(6).getname());
        

    }
}
