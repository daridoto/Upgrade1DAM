public class Funciones {
  //Procedo con la creacion de la funcion calcular para la media:
	public static int calcular(int[] numerosEnteros) {
		int suma = 0; 
		for (int numero : numerosEnteros) {
			suma += numero;
		}
		return suma / numerosEnteros.length;
	}
	public static void main(String[] args) {
		int[] numerosEnteros = {1, 2, 3}; 
		System.out.println(calcular(numerosEnteros));
	}	
}
