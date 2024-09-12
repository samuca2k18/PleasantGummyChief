import java.util.Scanner;

public class CaractereParaNumero{
    Scanner prompt = new Scanner(System.in);
    public void LetraAoNumero(){
        System.out.println("Digite o caracter: ");
        String string = prompt.next();
        int n = string.length();
        int decimal = 0;
        int base = Character.codePointAt(string,0);
        int digito;

      for (int i = 0; i < n; i++){
        digito = Character.codePointAt(string, i) - base;
        decimal = decimal * 10 + digito;
      }
      System.out.println("Formato decimal: "+ decimal);
    }
}