public class Item{
    private int id;
    private String nome;
    private int preço;
    private int quant;
    private String descricao;
    



    public void usar(Usuario a){
        if (this.id<2000){
            a.ataque = a.ataque - this.oldAtk;
            oldAtk = a.ataque;
            a.ataque = a.ataque + this.valorAtk;
        }
        if (this.id>2000 && this.id<3000){
            a.defesa = a.defesa - this.oldDef;
            oldDef = a.defesa;
            a.velocidade = a.velocidade - this.oldVelocidade;
              oldVelocidade = a.velocidade;
            a.defesa = a.defesa + this.ValorDef;
            a.velocidade = a.velocidade + this.valorVelocidade;
        }
        if (this.id>3000){
            if (this.tipo == 0)
                a.vida = a.vida + this.bonus;
            if (this.tipo == 1)
                a.velocidade = a.velocidade + this.bonus;

        
    }



  public static void main (String[] args) {
    
}



}