public class Sumatoria {
  public static void main(String[] args) {
    int n = 2;
    int sumatoria = calcularSumatoria(n);
    System.out.println("La sumatoria de " + n + " es " + sumatoria);
  }

  public static int calcularSumatoria(int n) {
  //ESTO ES SIN RECURSIVIDAD:
  //   int resultado = 0;
  //   for(int m = 0; m <= n; m++) {
  //     resultado = resultado + m;
  //   }
  //   return resultado;
  //  }
    if (n < 0) return -1;
    if (n == 0) return 0;
    return n + calcularSumatoria(n - 1);
  
  }
}