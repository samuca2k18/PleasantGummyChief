import java.util.Scanner;

public class SerieInfinita{
  Scanner prompt = new Scanner(System.in);
   
    public void Serie(){
        System.out.println("Digite o numero de termos: ");
        int n = prompt.nextInt();
        System.out.println("Valor de x: ");
        float x = prompt.nextInt();
          //float x;
          float termo = x;
          float s = x;
          int i = 1;
          float x2 = x * x;
        for (int j = 1; j < n; j++){
          i = i + 2;
          termo = - termo * x2 / (i * (i - 1));
          s = s + termo;
      }
    System.out.println("O valor da serie e: " + s);
    }
    
}