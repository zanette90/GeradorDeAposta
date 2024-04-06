import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Aposta aposta = new Aposta();
        Configuracoes configuracoes = new Configuracoes();
        Scanner leitura = new Scanner(System.in);

        //variaveis globais
        int opcao = 0;
        int quantidadeDeApostas;
        int quantidadeDeNumeros;


        while (opcao != 4) {

            System.out.println("GERADOR DE APOSTAS");

            System.out.println("1. Gerar uma aposta simples");
            System.out.println("2. Diversas apostas ");
            System.out.println("3. Configuracoes ");
            System.out.println("4. Sair ");

            try {
                System.out.println("Digite uma opção válida:");
                opcao = leitura.nextInt();
                System.out.println();

                switch (opcao) {
                    case 1:
                        System.out.println("Seus numeros da sorte são: ");
                        for (int i = 0; i < configuracoes.getQuantidadeNumero(); i++) {
                            aposta.geraNumero();
                            System.out.println(aposta.getNumeroAleatorio());
                        }
                        aposta.limpalista();
                        System.out.println("---------------------");
                        break;
                    case 2:
                        System.out.println("Digite a quantidade de apostas: ");
                        quantidadeDeApostas = leitura.nextInt();
                        System.out.println();

                        if (quantidadeDeApostas > 0) {

                            for (int k = 0; k < quantidadeDeApostas; k++) {
                                for (int j = 0; j < configuracoes.getQuantidadeNumero(); j++) {
                                    aposta.geraNumero();
                                    System.out.println(aposta.getNumeroAleatorio());
                                }
                                aposta.limpalista();
                                System.out.println("---------------------");
                            }
                        }else {
                            throw new IllegalArgumentException("quantidade inválida, verifique");
                        }
                        break;
                    case 3:
                        while (opcao == 3) {
                            configuracoes.mostraMenu();
                            quantidadeDeNumeros = leitura.nextInt();
                            configuracoes.setQuantidadeDeNumeros(quantidadeDeNumeros);
                            configuracoes.calculaValorAposta();
                            System.out.println("Digite 0 para voltar ou 3 para continuar?");
                            opcao = leitura.nextInt();
                        }

                        break;

                    case 4:
                        System.out.println("Saindo...");

                    default:
                        System.out.println("Opcao inválida");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas numeros" + e.getMessage());

            }

        }
    }

}



