// Player class to store player information
class Player { 
	int height,width,status,coin;
	Coin[] pa=new Coin[4]; // Array of 4 Coins for each player 
	public Player(int height,int width) {
		status=-1;
		coin=0;
		for(int i=0;i<4;i++) { // Initializing Coins for each player 
			pa[i]=new Coin(height,width); 
		}
	}
}