import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //String[] nomesJogadores = new String[10];
        Scanner sc = new Scanner(System.in);

        //Inicialização; condição; incremento
         //++ -> vai somar +1 i = i + 1
        /*for (int i = 0; i < 10; i++ ){
            System.out.println("informe o nome do player " + (i + 1) );
            nomesJogadores[i] = sc.next();
        }*/

        // Pedir o nome do time A
        // Pedir os nomes do time A (5 nomes )
        // Pedir o nome do time B
        // Pedir os nomes do time B (5 nomes )

        System.out.println("Nome do time A: " );
        String timeA = sc.next();

        String[] nomesJogadoresTimeA = new String[5];

        for (int i = 0; i < 5; i++ ){
            System.out.println("nome dos jogadores " + (i + 1) );
            nomesJogadoresTimeA[i] = sc.next();
        }
        System.out.println("Nome do time B: " );
        String timeB = sc.next();

        String[] nomesJogadoresTimeB = new String[5];

        for (int i = 0; i < 5; i++ ){
            System.out.println("nome dos jogadores " + (i + 1) );
            nomesJogadoresTimeB[i] = sc.next();
        }


    }
}