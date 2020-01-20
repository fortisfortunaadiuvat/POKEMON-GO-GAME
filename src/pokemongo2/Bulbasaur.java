package pokemongo2;

import javax.swing.ImageIcon;

public class Bulbasaur extends Pokemon {;
    private final ImageIcon imagebl = new ImageIcon(getClass().getResource("bulbasaur.png"));
    boolean useCard;
    
    Bulbasaur(){
    }
    Bulbasaur(String name,String type){
        super.pokemonname = name;
        super.pokemontype = type;
    }
    @Override
    public ImageIcon getImage(){
        return this.imagebl;
    }
    
    @Override
    public void showDamageScore(){
        System.out.println(super.damageScore=50);
    }
    
    @Override
    public int damage_score(){
        return super.damageScore=50;
    }
    
    @Override
    public int pokemon_ID(){
        return super.pokemonID=0;
    }
    
    @Override
    public String getName(){
        return super.pokemonname = "Bulbasaur" ;
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