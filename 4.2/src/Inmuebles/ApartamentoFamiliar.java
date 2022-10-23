package Inmuebles;
/**
* Esta clase denominada ApartamentoFamiliar modela un tipo
* específico de apartamento con atributos como el valor por área y el
* valor de la administración.
* @version 1.2/2020
*/
public class ApartamentoFamiliar extends Apartamento {
	// Atributo que identifica el valor por área de un apartamento familiar
	protected static double valorArea = 2000000;
	/* Atributo que identifica el valor de la administración de un
	apartamento familiar */
	protected int valorAdministración;
	/**
	* Constructor de la clase ApartamentoFamiliar
	* @param identificadorInmobiliario Parámetro que define el
	* identificador inmobiliario de un apartamento familiar
	* @param área Parámetro que define el área de un apartamento familiar
	* @param dirección Parámetro que define la dirección donde se
	* encuentra localizado un apartamento familiar
	* @param númeroHabitaciones Parámetro que define el número de
	* habitaciones que tiene un apartamento familiar
	* @param númeroBaños Parámetro que define el número de baños
	* que tiene un apartamento familiar
	* @param valorAdministración Parámetro que define el valor de la
	* administración de un apartamento familiar
	*/
	public ApartamentoFamiliar(int identificadorInmobiliario, int área,
		String dirección, int númeroHabitaciones, int númeroBaños, int valorAdministración) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección,
			númeroHabitaciones, númeroBaños);
		this.valorAdministración = valorAdministración;
	}
	/**
	* Método que muestra en pantalla los datos de un apartamento familiar
	*/
	void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println("Valor de la administración = $" +
		valorAdministración);
		System.out.println();
	}
}