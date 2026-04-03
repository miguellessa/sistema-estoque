
public abstract class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        if (preco < 0) {
            System.out.println("Preço invalido!");
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void mostrarInfo();
}
