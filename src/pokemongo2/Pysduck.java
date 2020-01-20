package pokemongo2;

import javax.swing.ImageIcon;

public class Pysduck extends Pokemon{
    private final ImageIcon imagepys = new ImageIcon(getClass().getResource("pysduck.png"));
    
    Pysduck(){}
    Pysduck(String name,String type){
        super.pokemonname = name;
        super.pokemontype = type;
    }
    
    @Override
    public ImageIcon getImage(){
        return this.imagepys;
    }
    
    @Override
    public void showDamageScore(){
        System.out.println(super.damageScore = 20);
    }
    
    @Override
    public int damage_score(){
        return super.damageScore=20;
    }
    
    @Override
    public int pokemon_ID(){
        return super.pokemonID=2;
    }
    
    @Override
    public String getName(){
        return super.pokemonname = "Pysduck";
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