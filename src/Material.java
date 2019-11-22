
public class Material {
    private String nome;
    private Double quantidade;

    
    public Material(String p, double i) throws QuantidadeInvalidaException{
        this.setNome(p);
        this.setQuantidade(i);
    }

    
    private String getNome() {
        return nome;
    }

    
    private void setNome(String nome) {
        this.nome = nome;
    }

    
    private Double getQuantidade() {
        return quantidade;
    }

   
    private void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}
