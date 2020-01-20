package pokemongo2;

import javax.swing.ImageIcon;

public class Squirtle extends Pokemon{
    private final ImageIcon imagesq = new ImageIcon(getClass().getResource("squirtle.png"));
    
    Squirtle(){}
    Squirtle(String name,String type){
        super.pokemonname = name;
        super.pokemontype = type;
    }
    
    @Override
    public ImageIcon getImage(){
        return this.imagesq;
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
        return super.pokemonID=4;
    }
    
    @Override
    public String getName(){
        return super.pokemonname = "Squirtle";
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
