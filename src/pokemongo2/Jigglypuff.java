package pokemongo2;

import javax.swing.ImageIcon;

public class Jigglypuff extends Pokemon{
    private final ImageIcon imagej = new ImageIcon(getClass().getResource("jigglypuff.png"));
    
    Jigglypuff(){
    }
    Jigglypuff(String name,String type){
        super.pokemonname = name;
        super.pokemontype = type;
    }
    
    @Override
    public ImageIcon getImage(){
        return this.imagej;
    }
    
    @Override
    public void showDamageScore(){
        System.out.println(super.damageScore = 70);
    }
    
    @Override
    public int damage_score(){
        return super.damageScore=70;
    }
    
    @Override
    public int pokemon_ID(){
        return super.pokemonID=3;
    }
    
    @Override
    public String getName(){
        return super.pokemonname ="Jigglypuff";
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