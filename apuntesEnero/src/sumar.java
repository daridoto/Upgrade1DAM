public class sumar {
  public static void main(String[] args) {
    System.out.println(sumar(1,2,3));
    System.out.println(sumar(1,2,3,4));
  }
  public static int sumar(int... numeros) { //esto es lo de usar vargargs 
    int suma = 0;
    for (int num : numeros) {
      suma += num;
    }
    return suma; 
  }
}
