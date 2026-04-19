
import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueService {

    public static void listarProdutos(ArrayList<Produto> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado...");
            return;
        }
        for (Produto prod : produtos) {
            prod.mostrarInfo();
        }
    }

    public static void mostrarPrecoFinal(ArrayList<Produto> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado...");
            return;
        }
        for (Produto p : produtos) {
            if (p instanceof Vendavel v) {
                System.out.println("Preço com desconto: R$" + v.calcularPrecoFinal());
            }
        }
    }

    public static void cadastrarAlimento(Scanner sc, ArrayList<Produto> produtos) {
        System.out.println("Digite o nome do alimento: ");
        String nomeAli = sc.nextLine();
        System.out.println("Digite o preço do alimento: ");
        double precoAli = sc.nextDouble();
        sc.nextLine();

        if (precoAli < 0) {
            System.out.println("Digite um valor válido");
            return;
        }

        System.out.println("Digite a validade do alimento: ");
        String validade = sc.nextLine();

        Alimento a1 = new Alimento(nomeAli, precoAli, validade);
        produtos.add(a1);
        System.out.println("Alimento cadastrado com sucesso!");
    }

    public static void cadastrarEletronico(Scanner sc, ArrayList<Produto> produtos) {
        System.out.println("Digite o nome do eletronico: ");
        String nomeProd = sc.nextLine();
        System.out.println("Digite o preco do eletronico: ");
        double precoProd = sc.nextDouble();
        sc.nextLine();

        if (precoProd < 0) {
            System.out.println("Digite um valor válido!");
            return;
        }

        System.out.println("Digite a garantia do eletronico: ");
        int garantia = sc.nextInt();
        sc.nextLine();

        Eletronico e1 = new Eletronico(nomeProd, precoProd, garantia);
        produtos.add(e1);
        System.out.println("Eletronico cadastrado com sucesso!");
    }

    public static void excluirProduto(Scanner sc, ArrayList<Produto> produtos) {
        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                produtos.remove(i);
                System.out.println("Produto removido com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public static void menu() {
        System.out.println("=======SISTEMA DE ESTOQUE INTELIGENTE========");
        System.out.println("[1] - Cadastrar Alimento");
        System.out.println("[2] - Cadastrar Eletronico");
        System.out.println("[3] - Listar Produtos");
        System.out.println("[4] - Mostrar Preco Final");
        System.out.println("[5] - Excluir Produto");
        System.out.println("[6] - Sair");
    }
}
