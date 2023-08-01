package LUDO_PROJECT;
import javafx.scene.layout.Pane;

public class LudoGame {
    private LudoBoard board;
    private Player[] players;
    private Dice dice;

    private int currentPlayerIndex;
    // Add other game-related properties like a flag to check if the game is over, etc.

    public LudoGame(LudoBoard board, Player[] players,Dice dice) {
        this.board = board;
        this.players = players;
        this.dice = dice;
        this.currentPlayerIndex = 0;
        // Initialize other game-related properties
    }

    // Implement the game logic, including handling turns, token movement, capturing, etc.
    // For brevity, let's leave these methods unimplemented.

    public void startGame() {
        // Start the game here and handle the game flow, user input, etc.
        // For brevity, let's leave this method unimplemented.
    }

    public Pane getBoard() {
        return board;
    }
}


