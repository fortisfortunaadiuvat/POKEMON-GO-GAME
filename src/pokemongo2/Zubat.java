package pokemongo2;

import javax.swing.ImageIcon;

public class Zubat extends Pokemon{
    private final ImageIcon imagez = new ImageIcon(getClass().getResource("zubat.png"));
    static boolean useCard;
    
    Zubat(){}
    Zubat(String name,String type){
        super.pokemonname = name;
        super.pokemontype = type;
    }
    
    @Override
    public ImageIcon getImage(){
        return this.imagez;
    }
    
    
    @Override
    public void showDamageScore(){
        System.out.println(super.damageScore = 50);
    }
    
    @Override
    public int damage_score(){
        return super.damageScore=50;
    }
    
    @Override
    public int pokemon_ID(){
        return super.pokemonID=7;
    }
    
    @Override
    public String getName(){
        return super.pokemonname = "Zubat";
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