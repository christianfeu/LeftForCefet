package leftforcefet;

public class ItemAtaque extends Item {
    private int valorAtk;

    public ItemAtaque(int valorAtk, int id, String nome, int preco, int quant, String descricao) {
        super(id, nome, preco, quant, descricao);
        this.valorAtk = valorAtk;
    }

    public int getValorAtk() {
        return valorAtk;
    }

    public void setValorAtk(int valorAtk) {
        this.valorAtk = valorAtk;
    }
    
    @Override
    public void usar(Usuario a){
    }
    
    @Override
    public void desequipar(Usuario a){
        
    }
    
    @Override
    public void analisar(){
     
    }
}
