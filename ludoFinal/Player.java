// class to store player information
class Player { 
	int height,width,status,coin;
	Coin[] pa=new Coin[4]; //array for coins
	public Player(int height,int width) {
		status=-1;
		coin=0;
		for(int i=0;i<4;i++) { // initalising 4 coins for 4 players
			pa[i]=new Coin(height,width); 
		}
	}
}