package pokemongo2;

import java.util.ArrayList;

public class User extends Player {
    
    ArrayList<Pokemon> usercardList = new ArrayList<>();
    
    User(){}
    User(int playerID,String playerName,int score){
        super.playerID = playerID;
        super.playerName = playerName;
        super.score = score;
    }
    
     @Override
    public void chooseCard(){
        
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getName(){
        return this.playerName ;
    }
    
    /**
     *
     * @param name
     */
    @Override
    public void setName(String name){
        this.playerName = name;
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getID(){
        return this.playerID;
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getScore(){
        return this.score;
    }
    
    /**
     *
     * @param score
     */
    @Override
    public void setScore(int score){
        this.score = score;
    }
}
