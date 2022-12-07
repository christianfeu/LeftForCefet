package leftforcefet;

public class ItemSuporte extends Item {
    private int tipo;
    private int bonus;

    public ItemSuporte(int tipo, int bonus, int id, String nome, int preco, int quant, String descricao) {
        super(id, nome, preco, quant, descricao);
        this.tipo = tipo;
        this.bonus = bonus;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public void usar(Usuario a) {
         if (tipo == 0)
          a.setVida(a.getVida() + bonus);
         if (tipo ==1)
          a.setVelocidade(a.getVelocidade() + bonus);
    }
    
  
    
    @Override
    public void analisar(){
     
    }
}
