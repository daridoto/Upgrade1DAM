public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("El termino 5 de la sucesion de Fibonacci es " + fibonacci(5));
  }

  public static int fibonacci(int n){
    if(n==0) return 0;
    if(n==1) return 1;
    return fibonacci(n-1) + fibonacci(n-2);
  }
}
