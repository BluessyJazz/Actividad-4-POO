package Inmuebles;
/**
* Esta clase denominada CasaConjuntoCerrado modela un tipo
* específico de casa urbana que se encuentra en un conjunto cerrado
* con atributos como el valor por área, valor de la administración y
* valores booleanos para especificar si tiene piscina y campos deportivos.
* @version 1.2/2020
*/
public class CasaConjuntoCerrado extends CasaUrbana {
	// Atributo que define el valor por área de una casa en conjunto cerrado
	protected static double valorArea = 2500000;
	/* Atributo que define el valor de administración de una casa en
	conjunto cerrado */
	protected int valorAdministración;
	// Atributo que define si una casa en conjunto cerrado tiene piscina
	protected boolean tienePiscina;
	/* Atributo que define si una casa en conjunto cerrado tiene campos
	deportivos */
	protected boolean tieneCamposDeportivos;
	/**
	* Constructor de la clase CasaConjuntoCerrado
	* @param identificadorInmobiliario Parámetro que define el
	* identificador inmobiliario de una casa en conjunto cerrado
	* @param área Parámetro que define el área de una casa en conjunto
	* cerrado
	* @param dirección Parámetro que define la dirección donde se
	* encuentra localizada una casa en conjunto cerrado
	* @param númeroHabitaciones Parámetro que define el número de
	* habitaciones que tiene una casa en conjunto cerrado
	* @param númeroBaños Parámetro que define el número de baños
	* que tiene una casa en conjunto cerrado
	* @param númeroPisos Parámetro que define el número de pisos
	* que tiene una casa en conjunto cerrado
	* @param valorAdministración Parámetro que define el valor de
	* administración para una casa en conjunto cerrado
	* @param tienePiscina Parámetro que define si una casa en conjunto
	* cerrado tiene o no piscina
	* @param tieneCamposDeportivos Parámetro que define si una casa
	* en conjunto cerrado tiene o no campos deportivos
	*/
	public CasaConjuntoCerrado(int identificadorInmobiliario, int área,
		String dirección, int númeroHabitaciones, int númeroBaños,
		int númeroPisos, int valorAdministración, boolean tienePiscina,
		boolean tieneCamposDeportivos) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección,
			númeroHabitaciones, númeroBaños, númeroPisos);
		this.valorAdministración = valorAdministración;
		this.tienePiscina = tienePiscina;
		this.tieneCamposDeportivos = tieneCamposDeportivos;
	}
	/**
	* Método que muestra en pantalla los datos de una casa en conjunto
	* cerrado
	*/
	void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println("Valor de la administración = " +
			valorAdministración);
		System.out.println("Tiene piscina? = " + tienePiscina);
		System.out.println("Tiene campos deportivos? = " +
			tieneCamposDeportivos);
		System.out.println();
	}
}