import java.util.Scanner;
public class NumeroPrimo{
Scanner prompt = new Scanner(System.in);
    public void numeroPrimo(){
        int n, i = 2, cont = 0;
        
        System.out.println("Digite o numero: ");
        n = prompt.nextInt();
        while(i < n){
            if(n % i == 0){
                cont++;
            }
            i++;
        }
        if(cont == 0){
            System.out.println("O numero "+ n +" é primo");
        }
        else{
            System.out.println("O numero "+ n +" não é primo");
        }
    }  
  
}