package LUDO_PROJECT;

import javafx.scene.paint.Color;

public class Player {
    private String playerName;
    private Color color;
    private int[][] positionOfCoins;

    Player(String playerName, Color color) {
        this.playerName = playerName;
        this.color = color;
        this.positionOfCoins = new int[4][4];
        // Initialize the positions of coins to -1 (indicating that no coins are on the board)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                this.positionOfCoins[i][j] = -1;
            }
        }
    }

    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        this.playerName = name;
    }

    public Color getColor() {
        return color;
    }

    public int[][] getPosition() {
        return positionOfCoins;
    }

    
    Player p1 = new Player("Player1" , Color.RED);
    Player p2 = new Player("Player2" , Color.YELLOW);
    Player p3 = new Player("Player3" , Color.BLUE);
    Player p4 = new Player("Player4" , Color.GREEN);

    // int[][] positions = p1.getPosition()
    // for(int i=0;i<positions.length;i++){
    //     for(int j=0;j<positions[i].length;j++){
    //         System.out.println(positions[i][j]);
    //     }
    // }
}
