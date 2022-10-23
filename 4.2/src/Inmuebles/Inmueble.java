package Inmuebles;
/**
* Esta clase denominada Inmueble modela un inmueble que posee
* como atributos un identificador, un área, una dirección y un precio
* de venta. Es la clase raíz de una jerarquía de herencia.
* @version 1.2/2020
*/
public class Inmueble {
// Atributo para el identificador inmobiliario de un inmueble
	protected int identificadorInmobiliario;
	protected int área; // Atributo que identifica el área de un inmueble
	protected String dirección; /* Atributo que identifica la dirección de
	un inmueble */
	protected double precioVenta; /* Atributo que identifica el precio de
	venta de un inmueble */
	/**
	 * Constructor de la clase Inmueble
	 * @param identificadorInmobiliario Parámetro que define el
	 * identificador de un inmueble
	 * @param área Parámetro que define el área de un inmueble
	 * @param dirección Parámetro que define la dirección donde se
	 * encuentra localizado un inmueble
	 */
	Inmueble(int identificadorInmobiliario, int área, String dirección) {
		this.identificadorInmobiliario = identificadorInmobiliario;
		this.área = área;
		this.dirección = dirección;
		}
		/**
		* Método que a partir del valor del área de un inmueble, calcula su
		* precio de venta
		* @param valorArea El valor unitario por área de un determinado
		* inmueble
		* @return Precio de venta del inmueble
		*/
		double calcularPrecioVenta(double valorArea) {
		precioVenta = área * valorArea;
		return precioVenta;
		}
		/**
		* Método que muestra en pantalla los datos de un inmueble
		*/
		void imprimir() {
			System.out.println("Identificador inmobiliario = " +
					identificadorInmobiliario);
			System.out.println("Area = " + área);
			System.out.println("Dirección = " + dirección);
			System.out.println("Precio de venta = $" + precioVenta);
		}
}