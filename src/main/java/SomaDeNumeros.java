import java.util.Scanner;

public class SomaDeNumeros{
  Scanner prompt = new Scanner(System.in);
    int n, num, soma = 0, i = 0;
  
      public void Soma(){
          System.out.println("Quantos numeros a serem somados");
          n = prompt.nextInt();
            while(i < n){
                i = i + 1;
              System.out.println("Digite o " + i + "º numero");
              num = prompt.nextInt();
              soma = soma + num;
              
            }
        System.out.println("A soma da: " +soma);
      }

}
