import java.sql.Connection;
import java.sql.PreparedStatement;

public class Functionality {

    public void insertGame(Connection cnx , PreparedStatement insert , int winnerPlayerIndex , boolean isGameCompleted){
        String insertQuery = "INSERT INTO Games (winner_id, is_completed) VALUES (?, ?)";

        try{
            insert = cnx.prepareStatement(insertQuery);

            insert.setInt(2, winnerPlayerIndex);
            insert.setBoolean(3, isGameCompleted);
            insert.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void updatetCoin(Connection cnx , PreparedStatement insert , Game game){
        String insertCoinQuery =  "UPDATE Coins SET(x_coordinate, y_coordinate) VALUES (?, ?) WHERE Player.player_id = Coins.player_id";

        try{
            cnx.prepareStatement(insertCoinQuery);

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    insert.setInt(1, game.p.pl[i].pa[j].getX());
                    insert.setInt(2, game.p.pl[i].pa[j].getY());
                }
            }
            insert.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void updatePlayer(Connection cnx , PreparedStatement insert , Game game ){
        String updatePlayerQuery = "UPDATE Players SET(player_score) VALUES (?) WHERE Player.player_id = Coins.player_id";

        try{
            cnx.prepareStatement(updatePlayerQuery);

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    insert.setInt(1, game.p.pl[i].score);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
