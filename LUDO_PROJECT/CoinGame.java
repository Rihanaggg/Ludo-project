package LUDO_PROJECT;

public class CoinGame {
    static int[][] ax= { // x coordinates of path for each player
        {1,2,3,4,5,6,6,6,6,6,6,7,8,8,8,8,8,8,9,10,11,12,13,14,14,14,13,12,11,10,9,8,8,8,8,8,8,7,6,6,6,6,6,6,5,4,3,2,1,0,0,1,2,3,4,5,6},
        {8,8,8,8,8,9,10,11,12,13,14,14,14,13,12,11,10,9,8,8,8,8,8,8,7,6,6,6,6,6,6,5,4,3,2,1,0,0,0,1,2,3,4,5,6,6,6,6,6,6,7,7,7,7,7,7,7},
        {13,12,11,10,9,8,8,8,8,8,8,7,6,6,6,6,6,6,5,4,3,2,1,0,0,0,1,2,3,4,5,6,6,6,6,6,6,7,8,8,8,8,8,8,9,10,11,12,13,14,14,13,12,11,10,9,8},
        {6,6,6,6,6,5,4,3,2,1,0,0,0,1,2,3,4,5,6,6,6,6,6,6,7,8,8,8,8,8,8,9,10,11,12,13,14,14,14,13,12,11,10,9,8,8,8,8,8,8,7,7,7,7,7,7,7}
};
static int[][] ay= { // y coordinates of path for each player
        {6,6,6,6,6,5,4,3,2,1,0,0,0,1,2,3,4,5,6,6,6,6,6,6,7,8,8,8,8,8,8,9,10,11,12,13,14,14,14,13,12,11,10,9,8,8,8,8,8,8,7,7,7,7,7,7,7},
        {1,2,3,4,5,6,6,6,6,6,6,7,8,8,8,8,8,8,9,10,11,12,13,14,14,14,13,12,11,10,9,8,8,8,8,8,8,7,6,6,6,6,6,6,5,4,3,2,1,0,0,1,2,3,4,5,6},
        {8,8,8,8,8,9,10,11,12,13,14,14,14,13,12,11,10,9,8,8,8,8,8,8,7,6,6,6,6,6,6,5,4,3,2,1,0,0,0,1,2,3,4,5,6,6,6,6,6,6,7,7,7,7,7,7,7},
        {13,12,11,10,9,8,8,8,8,8,8,7,6,6,6,6,6,6,5,4,3,2,1,0,0,0,1,2,3,4,5,6,6,6,6,6,6,7,8,8,8,8,8,8,9,10,11,12,13,14,14,13,12,11,10,9,8}
};
static int[][] initialx= { // x coordinates of initial position of each player
        {2,2,3,3},
        {11,11,12,12},
        {11,11,12,12},
        {2,2,3,3}
};
static int[][] initialy= { // y coordinates of initial position of each player
        {2,3,2,3},
        {2,3,2,3},
        {11,12,11,12},
        {11,12,11,12}
};
    
    public static void main(String[] args) {
        // Example usage:
        int player = 0; // Player number (0 to 3)
        int diceRoll = 4; // Dice roll value (1 to 6)
        int[] currentX = initialx[player];
        int[] currentY = initialy[player];
        moveCoin(player, diceRoll, currentX, currentY);
    }

    public static void moveCoin(int player, int diceRoll, int[] currentX, int[] currentY) {
        // Calculate the next position after the dice roll
        int nextPosition = Math.min(currentX.length - 1, diceRoll - 1);
        int newX = ax[player][nextPosition];
        int newY = ay[player][nextPosition];

        // Check if the new position is already occupied by another player
        // You may want to add additional logic to handle this situation
        // For simplicity, we will just skip the move if the new position is occupied.
        boolean isOccupied = false;
        for (int i = 0; i < currentX.length; i++) {
            if (i != player && currentX[i] == newX && currentY[i] == newY) {
                isOccupied = true;
                break;
            }
        }

        // If the new position is not occupied, update the player's position
        if (!isOccupied) {
            currentX[player] = newX;
            currentY[player] = newY;
        }

        // You can now display the new positions of the player's coins
        for (int i = 0; i < currentX.length; i++) {
            System.out.println("Player " + (i + 1) + ": (" + currentX[i] + ", " + currentY[i] + ")");
        }
    }
}

