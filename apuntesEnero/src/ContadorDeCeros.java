public class ContadorDeCeros {
  public static void main(String[] args) {
    System.out.println(contarCeros(102030));
  }
  public static int contarCeros(int n) {
    if(n<10) return n==0? 1 : 0;
    return ((n%10==0)? 1 : 0) + contarCeros(n/10);
  }
}
