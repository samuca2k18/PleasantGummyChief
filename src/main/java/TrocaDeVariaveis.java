  public class TrocaDeVariaveis{
    int a = 30, b = 40, aux;
    public void TrocaDeValores(){
      System.out.println("valor de a: "+a);
      System.out.println("valor de b: "+b);
      System.out.println("valor de aux: "+aux);
        aux = a;
        a = b;
        b = aux;
          System.out.println("valor de a: "+a);
          System.out.println("valor de b: "+b);
          System.out.println("valor de aux: "+aux);
    }
  }