import java.util.Scanner;

public class ConversaoBase{

    Scanner prompt = new Scanner(System.in);
      public void Conversao(){
          System.out.println("Digite o numero: ");
          int n = prompt.nextInt();
          int q = n;
          int ndigit = 0;
          int novarep [] = new int [100];
          int r;

            do {
              r = q % 2;
              novarep[ndigit] = r;
              ndigit++;
              q = q / 2;
            }
          while(q != 0);
            System.out.println("Numero "+ n +" na base binaria: ");
        for (int i = ndigit - 1; i >= 0; i--){
          System.out.println(novarep[i]);
        }
      }
}