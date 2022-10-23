package Inmuebles;
/**
* Esta clase denominada CasaUrbana modela un tipo específico de casa
* destinada para la vivienda localizada en el sector urbano.
* @version 1.2/2020
*/
public class CasaUrbana extends Casa {
	/**
	* Constructor de la clase CasaUrbana
	* @param identificadorInmobiliario Parámetro que define el
	* identificador inmobiliario de una casa urbana
	* @param área Parámetro que define el área de una casa urbana
	* @param dirección Parámetro que define la dirección donde se
	* encuentra localizada una casa urbana
	* @param númeroHabitaciones Parámetro que define el número de
	* habitaciones que tiene una casa urbana
	* @param númeroBaños Parámetro que define el número de baños
	* que tiene una casa urbana
	* @param númeroPisos Parámetro que define el número de pisos
	* que tiene una casa urbana
	*/
	public CasaUrbana(int identificadorInmobiliario, int área, String
		dirección, int númeroHabitaciones, int númeroBaños, int
		númeroPisos) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección,
				númeroHabitaciones, númeroBaños, númeroPisos);
	}
	/**
	* Método que muestra en pantalla los datos de una casa urbana
	*/
	void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
	}
}