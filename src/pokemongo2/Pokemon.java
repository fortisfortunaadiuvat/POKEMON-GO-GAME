package pokemongo2;

import javax.swing.ImageIcon;

public class Pokemon {
    String pokemonname;
    String pokemontype;
    int pokemonID;
    int damageScore;
    ImageIcon image;
    
    Pokemon(){}
    Pokemon(String name,String type){
        this.pokemonname = name;
        this.pokemontype = type;
    }
    
    public ImageIcon getImage(){
        return this.image;
    }
    
    public void showDamageScore(){
        System.out.println("Damage is:" + damageScore);
    }
    
    public int damage_score(){
        return this.damageScore;
    }
    
    public int pokemon_ID(){
        return this.pokemonID;
    }
    
    public String getName(){
        return this.pokemonname ;
    }
    
    public void setName(String name){
        this.pokemonname = name;
    }
    
    public boolean useCard(){
        return true;
    }
 }
