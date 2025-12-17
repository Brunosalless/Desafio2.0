import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner imprimir = new Scanner(System.in);
        LinkedList<Missoes> missoes = new LinkedList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU DE MISSÕES =====");
            System.out.println("1 - Adicionar missão na lista");
            System.out.println("2 - Adicionar missão no início");
            System.out.println("3 - Remover primeira missão");
            System.out.println("4 - Listar missões");
            System.out.println("5 - Buscar missão por índice");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = imprimir.nextInt();
            imprimir.nextLine();

            switch (opcao) {

                case 1: {
                    System.out.println("Nome da missao: ");
                    String nome = imprimir.nextLine();

                    System.out.println("Ninja responsavel: ");
                    String ninja  = imprimir.nextLine();

                    System.out.println("Dificuldade:");
                    System.out.println("1 - FACIL");
                    System.out.println("2 - MEDIO");
                    System.out.println("3 - DIFICIL");
                    System.out.println("4 - EXTREMAMENTEDIFICIL");
                    System.out.print("Escolha: ");
                    int nivel = imprimir.nextInt();
                    imprimir.nextLine(); //limpar buffer

                    NivelDeDificuldade dificuldade =
                            (nivel == 1) ? NivelDeDificuldade.FACIL :
                                    (nivel == 2) ? NivelDeDificuldade.MEDIO :
                                            (nivel == 3) ? NivelDeDificuldade.DIFICIL:
                                                    NivelDeDificuldade.EXTREMAMENTEDIFICIL;
                    /*
                    O operador ternário funciona como uma sequência de if/else encadeados. Ele testa as condições de
                    cima para baixo e, quando nenhuma delas é verdadeira, o último valor funciona como um “senão” geral.
                    Por isso não é necessário verificar (nivel == 4) no final: se o valor não for 1, 2 ou 3, ele
                    automaticamente cai na última opção e atribui EXTREMAMENTEDIFICIL.
                    */

                    missoes.add(new Missoes(nome, ninja, dificuldade));
                    System.out.println("Missao adicionada com sucesso.");
                    break;
                }

                case 2: {
                    System.out.println("Nome da missao: ");
                    String nome = imprimir.nextLine();

                    System.out.println("Ninja responsavel: ");
                    String ninja  = imprimir.nextLine();

                    System.out.println("Dificuldade:");
                    System.out.println("1 - FACIL");
                    System.out.println("2 - MEDIO");
                    System.out.println("3 - DIFICIL");
                    System.out.println("4 - EXTREMAMENTEDIFICIL");
                    System.out.print("Escolha: ");
                    int nivel = imprimir.nextInt();
                    imprimir.nextLine(); //limpar buffer

                    NivelDeDificuldade dificuldade =
                            (nivel == 1) ? NivelDeDificuldade.FACIL :
                                    (nivel == 2) ? NivelDeDificuldade.MEDIO :
                                            (nivel == 3) ? NivelDeDificuldade.DIFICIL:
                                                     NivelDeDificuldade.EXTREMAMENTEDIFICIL;

                    missoes.addFirst(new Missoes(nome, ninja, dificuldade));
                    System.out.println("Missao adicionada com sucesso.");
                    break;
                }

                // o isEmpty verifica se a lista esta realmente vazia TRUE ou FALSE
                // ja o "!" e o inverso do isEmpty FALSE ou TRUE se nao ouvese o ! o isEmpty nao iria saber se a lista esta vazia e daria erro  caso nao ouvese elementos nela claro
                case 3: {
                    if (!missoes.isEmpty()){
                        System.out.println("Missão removida: " + missoes.removeFirst());
                    } else {
                        System.out.println("A lista está vazia!");
                    }
                    break;

                }

                case 4: {
                    if (missoes.isEmpty()) {
                        System.out.println("Nenhuma missão cadastrada.");
                    } else {
                        System.out.println("\n=== LISTA DE MISSÕES ===");
                        for (Missoes m : missoes) {
                            System.out.println(m);
                        }
                    }
                    break;
                }

                case 5: {
                    System.out.println("Digite qual index voce deseja: ");
                    int index = imprimir.nextInt();
                    // operador && significa que as duas condiçoes tem que ser verdadeira ao mesmo tempo
                    // ou seja Se o índix for maior ou igual a zero E menor que o tamanho da lista
                    if (index >= 0 && index < missoes.size()){
                        System.out.println("Missão encontrada:");
                        System.out.println(missoes.get(index));
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                }
            }
        } while (opcao != 0);

        imprimir.close();
    }
}
