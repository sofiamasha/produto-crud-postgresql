package CrudJava;

import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProdutoDAO dao = new ProdutoDAO();

        int opcao;

        do {

            System.out.println("1 - Listar");
            System.out.println("2 - Inserir");
            System.out.println("3 - Excluir");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Sair");

            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {

                List<Produto> lista = dao.listar();

                for (Produto p : lista) {
                    System.out.println(p.getId() + " " + p.getNome() + " " + p.getPreco());
                }

            }

            if (opcao == 2) {

                Produto p = new Produto();

                System.out.println("Nome:");
                p.setNome(sc.nextLine());

                System.out.println("Preco:");
                p.setPreco(Double.parseDouble(sc.nextLine()));

                dao.inserir(p);
            }

            if (opcao == 3) {

                System.out.println("ID:");
                int id = Integer.parseInt(sc.nextLine());

                dao.excluir(id);
            }

            if (opcao == 4) {

                Produto p = new Produto();

                System.out.println("ID:");
                p.setId(Integer.parseInt(sc.nextLine()));

                System.out.println("Nome:");
                p.setNome(sc.nextLine());

                System.out.println("Preco:");
                p.setPreco(Double.parseDouble(sc.nextLine()));

                dao.atualizar(p);
            }

        } while (opcao != 5);

        sc.close();
    }
}