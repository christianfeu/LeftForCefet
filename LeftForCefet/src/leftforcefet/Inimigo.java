package leftforcefet;

import java.util.Random;

public class Inimigo extends Personagem {
    private int nivel;
    private int scoreDrop;
    private String itemDrop;

    public Inimigo(int nivel, int scoreDrop, String itemDrop, String nome, int vida, int ataque, int defesa, int velocidade) {
        super(nome, vida, ataque, defesa, velocidade);
        this.nivel = nivel;
        this.scoreDrop = scoreDrop;
        this.itemDrop = itemDrop;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getScoreDrop() {
        return scoreDrop;
    }

    public void setScoreDrop(int scoreDrop) {
        this.scoreDrop = scoreDrop;
    }

    public String getItemDrop() {
        return itemDrop;
    }

    public void setItemDrop(String itemDrop) {
        this.itemDrop = itemDrop;
    }
    
    public int atacarSpecial(){
        Random random = new Random();
        
        return super.atacar() + random.nextInt(30);
    }
}
