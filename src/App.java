
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int menu = 0;

        while (menu != 6) {

            EstoqueService.menu();

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    EstoqueService.cadastrarAlimento(sc, produtos);
                    break;
                case 2:
                    EstoqueService.cadastrarEletronico(sc, produtos);
                    break;
                case 3:
                    EstoqueService.listarProdutos(produtos);
                    break;
                case 4:
                    EstoqueService.mostrarPrecoFinal(produtos);
                    break;
                case 5:
                    EstoqueService.excluirProduto(sc, produtos);
                    break;
                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção Invalida...");
            }
        }
        sc.close();
    }
}
