public class OrdenInverso {
  public static void main(String[] args) {
    int m = 9;
    System.out.println(ordenInverso(m));
  }

  public static int ordenInverso(int n) {
    if(n == 0) return -1;
    if(n == 1) return 1;
    return n + ordenInverso(n - 1);
  }
}
