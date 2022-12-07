package leftforcefet;

public class ItemDefesa extends Item {
    private int valorDef;

    public ItemDefesa(int valorDef, int id, String nome, int preco, int quant, String descricao) {
        super(id, nome, preco, quant, descricao);
        this.valorDef = valorDef;
    }

    public int getValorDef() {
        return valorDef;
    }

    public void setValorDef(int valorDef) {
        this.valorDef = valorDef;
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
