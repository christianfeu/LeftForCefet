package leftforcefet;

public class Item {
    private int id;
    private String nome;
    private int preco;
    private int quant;
    private String descricao;

    public Item(int id, String nome, int preco, int quant, String descricao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void usar(Usuario a){
    }
    
    public void desequipar(Usuario a){
        
    }
    
    public void analisar(){
      System.out.println("Nome :"+nome);
      System.out.println("Descrição :"+descricao);
      System.out.println("Quantidade :"+quant);
      System.out.println("Preço :"+preco);  
    }
}
