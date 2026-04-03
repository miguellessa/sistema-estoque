
public class Eletronico extends Produto implements Vendavel {

    private int garantiaMeses;

    public Eletronico(String nome, double preco, int garantiaMeses) {
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.95;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("ELETRONICO");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Garantia: " + getGarantiaMeses() + "Meses");
        System.out.println("-----------------------------");
    }

}
