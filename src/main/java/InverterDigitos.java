import java.util.Scanner;

public class InverterDigitos{
  int n, inverso = 0, digito;

    Scanner prompt = new Scanner(System.in);
      public void Invercao(){
        System.out.println("Numero inteiro positivo: ");
        n = prompt.nextInt();

        while(n > 0){
          digito = n % 10;
          inverso = inverso * 10 + digito;
          n = n / 10;
        }
        System.out.println("Numero inverso: "+ inverso);
      }
}