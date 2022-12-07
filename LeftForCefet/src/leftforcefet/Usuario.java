package leftforcefet;
import java.util.ArrayList;
import java.util.Random;

public class Usuario extends Personagem {
    private int dinheiro;
    private ArrayList<Item> itens = new ArrayList<Item>();

    public Usuario(int dinheiro, String nome, int vida, int ataque, int defesa, int velocidade) {
        super(nome, vida, ataque, defesa, velocidade);
        this.dinheiro = dinheiro;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }


    public ArrayList<Integer> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Integer> itens) {
        this.itens = itens;
    }


    public int fugir(){
        Random random = new Random();
        
        return super.getVelocidade() + random.nextInt(10);
    }
    
    
    
}
