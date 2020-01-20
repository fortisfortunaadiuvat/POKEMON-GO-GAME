package pokemongo2;

import javax.swing.ImageIcon;

public class Meowth extends Pokemon{
    private final ImageIcon imagem = new ImageIcon(getClass().getResource("meowth.png"));
    
    Meowth(){
    }
    Meowth(String name,String type){
        super.pokemonname = name;
        super.pokemontype = type;
    }
    
    @Override
    public ImageIcon getImage(){
        return this.imagem;
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
        return super.pokemonID=6;
    }
    
    @Override
    public String getName(){
        return super.pokemonname = "Meowth" ;
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