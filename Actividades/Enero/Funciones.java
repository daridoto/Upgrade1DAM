package Actividades.Enero;
public class Funciones {
  public static int[] calcularModa(int[] lista) {
		if (lista.length == 0) {
				throw new IllegalArgumentException("La lista está vacía.");
		}

		// Arreglo para almacenar las frecuencias
		int[] frecuencias = new int[lista.length];
		int maxFrecuencia = 0;

		// Calcular la frecuencia de cada elemento
		for (int i = 0; i < lista.length; i++) {
				int frecuencia = 0;

				for (int j = 0; j < lista.length; j++) {
						if (lista[i] == lista[j]) {
								frecuencia++;
						}
				}

				frecuencias[i] = frecuencia;

				// Actualizar la frecuencia máxima
				if (frecuencia > maxFrecuencia) {
						maxFrecuencia = frecuencia;
				}
		}

		// Contar cuántos elementos tienen la frecuencia máxima
		int modaCount = 0;
		for (int i = 0; i < frecuencias.length; i++) {
				if (frecuencias[i] == maxFrecuencia) {
						modaCount++;
				}
		}

		// Crear un arreglo para almacenar las modas
		int[] modas = new int[modaCount];
		int index = 0;

		// Guardar los elementos con frecuencia máxima en el arreglo de modas
		for (int i = 0; i < lista.length; i++) {
				if (frecuencias[i] == maxFrecuencia) {
						boolean yaExiste = false;

						// Verificar si ya se agregó la moda al arreglo
						for (int k = 0; k < index; k++) {
								if (modas[k] == lista[i]) {
										yaExiste = true;
										break;
								}
						}

						if (!yaExiste) {
								modas[index] = lista[i];
								index++;
						}
				}
		}

		return modas; // Retornar el arreglo con las modas
}

public static void main(String[] args) {
		int[] lista = {1, 2, 2, 3, 3, 3, 4, 4};

		try {
				int[] modas = calcularModa(lista);

				System.out.print("La(s) moda(s) es(son): ");
				for (int moda : modas) {
						System.out.print(moda + " ");
				}
		} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
		}
}
}
                             
