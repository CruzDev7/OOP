import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Moeda> moedas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int opcao = -1;


        System.out.println("""
                *********************
                  Bem Vindo ao Cofre
                **********************\n""");
        // menu de interações
        while (opcao != 0) {
            System.out.println("""
                    Opções:
                    1- Adicionar Moeda
                    2- Listar Moedas
                    3- Remover Moeda
                    4- Converter Valores
                    0- Sair""");

            System.out.println("Digite a opção desejada:");
            opcao = input.nextInt();

            // opçoes de Escolha
            switch (opcao) {
                case 1:
                    System.out.println("""
                            Qual moeda gostaria de Adicionar?
                            1- Dolar
                            2- Euro
                            3- Real""");
                    System.out.println("Digite a opção desejada:");
                    int escolha = input.nextInt();
                    // Para facilitar a Escolha das opçoes listadas acima
                    switch (escolha) {
                        case 1:
                            System.out.println("Qual o valor que gostaria de Adicionar?");
                            double valorDolar = input.nextDouble();
                            Dolar dolar = new Dolar(valorDolar);
                            moedas.add(dolar);
                            System.out.printf("Valor de US$ %.2f adicionado\n", valorDolar);
                            break;
                        case 2:
                            System.out.println("Qual o valor que gostaria de Adicionar?");
                            double valorEuro = input.nextDouble();
                            Euro euro = new Euro(valorEuro);
                            moedas.add(euro);
                            System.out.printf("Valor de € %.2f adicionado\n", valorEuro);
                            break;
                        case 3:
                            System.out.println("Qual o valor que gostaria de Adicionar?");
                            double valorReal = input.nextDouble();
                            Real real = new Real(valorReal);
                            moedas.add(real);
                            System.out.printf("Valor de R$ %.2f adicionado\n", valorReal);
                            break;

                        default:
                            System.out.println("Opção invalida. Tente novamente.");

                    }
                    break;
                case 2: // Listagem dos valores do ArrayList, por meio do foreach.
                    System.out.println("lista de valores:");
                    for (Moeda moeda : moedas) {
                        System.out.println(moeda);
                    }
                    break;
                case 3: // opções de Remoçao de moedas, com base na escolha do usuario!
                    System.out.println("""
                            Qual moeda gostaria de remover?
                            1- Dolar
                            2- Euro
                            3- Real""");
                    System.out.println("Digite a opção desejada:");
                    int opcao1 = input.nextInt();
                    for (Moeda moeda : moedas) ;
                    switch (opcao1) {
                        case 1:
                            moedas.remove(0);
                            break;
                        case 2:
                            moedas.remove(1);
                            break;
                        case 3:
                            moedas.remove(2);
                            break;
                    }break;
                case 4: //mostrar o valor convertido total.
                    double total = 0;
                    for (Moeda moeda : moedas) {
                        total += moeda.converter();
                    }
                    System.out.printf("Total convertido: R$ %.2f%n", total);
                    break;
                case 0:
                    System.out.println("Encerrando app...");
                    input.close();
                    break;
                default:
                    System.out.println("Opção Invalida.Tente Novamente!");
                    break;

            }
        }
    }
}

