import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=====Partida de Par ou Ímpar=====");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Jogador 1, digite seu nome: ");
        String jogador1 = teclado.nextLine();
        System.out.print("Jogador 2, digite seu nome: ");
        String jogador2 = teclado.nextLine();

        System.out.print(jogador1 +", digite 1 para Par ou 2 para Ímpar: ");
        int escolhaJogador1 = teclado.nextInt();

        if (escolhaJogador1==1){
            System.out.print("\n");
            System.out.println(jogador1 +" escolheu Par, logo "+ jogador2 + " será Ímpar");
            int numeroSorteado1 = (int) (Math.random()*6);
            int numeroSorteado2 = (int) (Math.random()*6);
            System.out.println("O primeiro número sorteado foi: " + numeroSorteado1);
            System.out.println("O segundo número sorteado foi: " + numeroSorteado2);
            int soma = numeroSorteado1 + numeroSorteado2;
            System.out.println("A soma dos números sorteados é: " + soma);

            if (soma % 2 == 0) {
                System.out.println("\nA soma é Par, então o vencedor é: " + jogador1);
            } else {
                System.out.println("\nA soma é Ímpar, então o vencedor é: " + jogador2);
            }

            
        }else {
            System.out.print("\n");
            System.out.println(jogador1 +" escolheu Ímpar, logo "+ jogador2 + " será Par");
            int numeroSorteado1 = (int) (Math.random()*6);
            int numeroSorteado2 = (int) (Math.random()*6);
            System.out.println("O primeiro número sorteado foi: " + numeroSorteado1);
            System.out.println("O segundo número sorteado foi: " + numeroSorteado2);
            int soma = numeroSorteado1 + numeroSorteado2;
            System.out.println("A soma dos números sorteados é: " + soma);

            if (soma % 2 == 0) {
                System.out.println("\nA soma é Par, então o vencedor é: " + jogador2);
            } else {
                System.out.println("\nA soma é Ímpar, então o vencedor é: " + jogador1);
            }
            
        }


        teclado.close();


    }
}
