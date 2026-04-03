
public class Alimento extends Produto implements Vendavel {

    private String validade;

    public Alimento(String nome, double preco, String validade) {
        super(nome, preco);
        this.validade = validade;
    }

    public String getValidade() {
        return validade;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("ALIMENTO");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Validade: " + getValidade());
        System.out.println("-----------------------------");
    }

}
