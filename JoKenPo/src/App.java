import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner tec = new Scanner(System.in);
    Random random = new Random();

        System.out.println("=========Vamos jogar Jo Ken Po!(Pedra, Papel e Tesoura)=========");
        System.out.println();
        

        int mantemJogo = 1;

         while (mantemJogo !=2){
            System.out.println("Escolha uma das opções e digite o número correspondente");
            System.out.print("1-Pedra\n2-Papel\n3-Tesoura\n\n");

            System.out.print("Digite o valor da escolha: ");
             int opcao = tec.nextInt();

             while (opcao < 1 || opcao >3){
             System.out.print("Você digitou um valor inválido. Digite o valor da escolha: ");
                opcao = tec.nextInt();
             }
                 switch (opcao){
                    case 1:
                        System.out.println("Você escolheu Pedra");
                        break;
                    case 2:
                        System.out.println("Você escolheu Papel");
                        break;
                    case 3:
                        System.out.println("Você escolheu Tesoura");
                        break;           

                     }

                int escolhaComputador =  random.nextInt(3);

                switch (escolhaComputador){
                    case 0:
                        System.out.println("O computador escolheu Pedra");
                        break;
                    case 1:
                        System.out.println("O computador escolheu Papel");
                        break;
                    case 2:
                        System.out.println("O computador escolheu Tesoura");           

                }

            if (opcao == 1 && escolhaComputador == 2 || opcao == 2 && escolhaComputador == 0 || opcao == 3 && escolhaComputador == 1){
                System.out.println("Você ganhou!");
            } else if (opcao == 1 && escolhaComputador == 1 || opcao == 2 && escolhaComputador == 2 || opcao == 3 && escolhaComputador == 0){
                System.out.println("O computador ganhou!");
            } else {
                System.out.println("Empate!");
            }

            System.out.print("Deseja jogar novamente? (1-Sim 2-Não): ");
            mantemJogo = tec.nextInt(); 
            System.out.println();         
        }

            System.out.println("Jogo encerrado. Obrigado por jogar!");

           tec.close();

     }
        
        
}
