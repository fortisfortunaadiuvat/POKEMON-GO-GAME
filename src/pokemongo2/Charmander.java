package pokemongo2;

import javax.swing.ImageIcon;

public class Charmander extends Pokemon{
    private final ImageIcon imagec = new ImageIcon(getClass().getResource("charmander.png"));
    
    Charmander(){
    }
    Charmander(String name,String type){
        super.pokemonname = name;
        super.pokemontype = type;
    }
    
    @Override
    public ImageIcon getImage(){
        return this.imagec;
    }
    
    @Override
    public void showDamageScore(){
        System.out.println(super.damageScore = 60);
    }
    
    @Override
    public int damage_score(){
        return super.damageScore=60;
    }
    
    @Override
    public int pokemon_ID(){
        return super.pokemonID=8;
    }
    
    @Override
    public String getName(){
        return super.pokemonname = "Charmander";
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
