package LUDO_PROJECT;
import java.util.Random;
public class Dice { 
    private int maxValue;
    private Random random;
    private int consecutiveSixes ;

    public Dice(int maxValue) {
        this.maxValue = maxValue;
        this.random = new Random();
        this.consecutiveSixes = 0;
    }

    public  int roll() {
        int diceValue = random.nextInt(maxValue) + 1;
        if(diceValue == 6){
            consecutiveSixes++ ;
            // for 3 times consecutive 6
            if(consecutiveSixes == 3){
                consecutiveSixes = 0;
                diceValue = 0;
            }else{
                //addition of 1 roll for getting 6
                diceValue += roll();
            }
        }else {
            consecutiveSixes = 0;
        }
        return diceValue;
    }    

}
