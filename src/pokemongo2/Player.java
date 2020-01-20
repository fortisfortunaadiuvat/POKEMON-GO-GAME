package pokemongo2;

public abstract class Player {
    int playerID;
    String playerName;
    int score;
    
    Player(){}
    Player(int playerID,String playerName,int score){
        this.playerID = playerID;
        this.playerName = playerName;
        this.score = score;
    }
    
    
    public void showScore(){
        System.out.println(this.score);
    }
    
    public void chooseCard(){
        //
    }
    public String getName(){
        return this.playerName ;
    }
    
    public void setName(String playerName){
        this.playerName = playerName;
    }
    
    public int getID(){
        return this.playerID;
    }
    
    public void setID(int playerID){
         this.playerID = playerID;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public void setScore(int score){
        this.score = score;
    }

}
