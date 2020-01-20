package pokemongo2;

import javax.swing.ImageIcon;

public class Butterfree extends Pokemon{
    private final ImageIcon imagebu = new ImageIcon(getClass().getResource("butterfree.png"));
    
    Butterfree(){
    }
    Butterfree(String name,String type){
        super.pokemonname = name;
        super.pokemontype = type;
    }
    
    @Override
    public ImageIcon getImage(){
        return this.imagebu;
    }
    
    @Override
    public void showDamageScore(){
        System.out.println(super.damageScore = 10);
    }
    
    @Override
    public int damage_score(){
        return super.damageScore=10;
    }
    
    @Override
    public int pokemon_ID(){
        return super.pokemonID=1;
    }
    
    @Override
    public String getName(){
        return super.pokemonname = "Butterfree" ;
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