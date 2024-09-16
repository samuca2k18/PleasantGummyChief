import java.util.Scanner;
public class Mdc{
    Scanner prompt = new Scanner(System.in);
    public void mdc(){
        System.out.println("Digite o numero 1 ");
        int n1 = prompt.nextInt();
        System.out.println("Digite o numero 2 ");
        int n2 = prompt.nextInt();
        
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        System.out.println("O MDC é: " + n1);
        

    }
}