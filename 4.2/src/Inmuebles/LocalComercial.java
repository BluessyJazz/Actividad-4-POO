package Inmuebles;
/**
* Esta clase denominada LocalComercial modela un tipo específico de
* Local destinado para un uso comercial con atributos como el valor
* por área y el centro comercial al cual pertenece.
* @version 1.2/2020
*/
public class LocalComercial extends Local {
	// Atributo que identifica el valor por área de un local comercial
	protected static double valorArea = 3000000;
	/* Atributo que identifica el centro comercial donde está ubicado el
	local comercial */
	protected String centroComercial;
	/**
	* Constructor de la clase LocalComercial
	* @param identificadorInmobiliario Parámetro que define el
	* identificador inmobiliario de un local comercial
	* @param área Parámetro que define el área de un local comercial
	* @param dirección Parámetro que define la dirección donde se
	* encuentra localizado un local comercial
	* @param tipoLocal Parámetro que define el tipo de local comercial
	* (interno o que da a la calle)
	* @param centroComercial Parámetro que define el nombre del
	* centro comercial donde está ubicado el local comercial
	*/
	public LocalComercial(int identificadorInmobiliario, int área, String
		dirección, tipo tipoLocal, String centroComercial) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección, tipoLocal);
		this.centroComercial = centroComercial;
	}
	/**
	* Método que muestra en pantalla los datos de un local comercial
	*/
	void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println("Centro comercial = " + centroComercial);
		System.out.println();
	}
}
