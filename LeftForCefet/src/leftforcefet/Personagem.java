package leftforcefet;
import java.util.Random;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private int velocidade;

    public Personagem(String nome, int vida, int ataque, int defesa, int velocidade) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public int atacar(){
        Random random = new Random();
        int ataque = this.ataque + random.nextInt(20);
        System.out.println("Ataque: "+ataque);
        return ataque;   
    }
    
    public int defender(){
        Random random = new Random();
        int defesa = this.defesa + random.nextInt(20);
        System.out.println("Defesa: "+defesa);
        return defesa;
    }
    
    public int esquivar(){
        Random random = new Random();
        int esquiva = this.velocidade + random.nextInt(20);
        System.out.println("Esquiva: "+esquiva);
        return esquiva;
    }
    
    public void exibir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Vida: "+this.vida); 
        System.out.println("Ataque : "+this.ataque);
        System.out.println("Defesa : "+this.defesa);
    }
    
}
