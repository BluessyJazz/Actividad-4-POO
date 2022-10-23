package Inmuebles;
/**
* Esta clase denominada Apartaestudio modela un tipo específico de
* apartamento que tiene una sola habitación.
* @version 1.2/2020
*/
public class Apartaestudio extends Apartamento {
	// Atributo que identifica el valor por área de un apartaestudio
	protected static double valorArea = 1500000;
	/**
	* Constructor de la clase Apartaestudio
	* @param identificadorInmobiliario Parámetro que define el
	* identificador inmobiliario de un apartaestudio
	* @param área Parámetro que define el área de un apartaestudio
	* @param dirección Parámetro que define la dirección donde se
	* encuentra localizado un apartaestudio
	* @param númeroHabitaciones Parámetro que define el número de
	* habitaciones que tiene un apartaestudio
	* @param númeroBaños Parámetro que define el número de baños
	* que tiene un apartaestudio
	*/
	public Apartaestudio(int identificadorInmobiliario, int área, String
		dirección,
		int númeroHabitaciones, int númeroBaños) {
		// Invoca al constructor de la clase padre
		// Los apartaestudios tienen una sola habitación y un solo baño
		super(identificadorInmobiliario, área, dirección, 1, 1);
	}
	/**
	* Método que muestra en pantalla los datos de un apartaestudio
	*/
	void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println();
	}
}