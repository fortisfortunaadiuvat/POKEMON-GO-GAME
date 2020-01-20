package pokemongo2;

import javax.swing.ImageIcon;

public class Snorlax extends Pokemon{
    private final ImageIcon images = new ImageIcon(getClass().getResource("snorlax.png"));
    
    Snorlax(){}
    Snorlax(String name,String type){
        super.pokemonname = name;
        super.pokemontype = type;
    }
    
    @Override
    public ImageIcon getImage(){
        return this.images;
    }
    
    
    @Override
    public void showDamageScore(){
        System.out.println(super.damageScore = 30);
    }
    
    @Override
    public int damage_score(){
        return super.damageScore=30;
    }
    
    @Override
    public int pokemon_ID(){
        return super.pokemonID=5;
    }
    
    @Override
    public String getName(){
        return super.pokemonname ="Snorlax";
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