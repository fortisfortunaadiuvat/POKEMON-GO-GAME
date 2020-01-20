package pokemongo2;

import javax.swing.ImageIcon;

public class Pikachu extends Pokemon {
    private final ImageIcon imagep = new ImageIcon(getClass().getResource("pikachu.png"));
    
    Pikachu(){
    }
    Pikachu(String name,String type){
        super.pokemonname = name;
        super.pokemontype = type;
    }
 
    @Override
    public ImageIcon getImage(){
        return this.imagep;
    }
    
    @Override
    public void showDamageScore(){
        System.out.println(super.damageScore = 40);
    }
    
    @Override
    public int damage_score(){
        return super.damageScore=40;
    }
    
    @Override
    public int pokemon_ID(){
        return super.pokemonID=9;
    }
    
    @Override
    public String getName(){
        return super.pokemonname = "Pikachu" ;
    }
    
    @Override
    public void setName(String name){
        this.pokemonname = name;
    }
    
    @Override
    public boolean useCard(){
        return super.useCard();
    }
}
