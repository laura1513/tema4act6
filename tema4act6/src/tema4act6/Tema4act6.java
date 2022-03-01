package tema4act6;

/**
 * Clase que tiene varios metodos de conversión de dinero, de temperaturay de
 * números decimales a romanos
 *
 * @author laura
 */
public class Tema4act6 {

    /**
     * Método para pasar de Fahrenheit a Celsius
     *
     * @param num Temperatura en grados Fahrenheit a convertir
     * @return Devuelve la temperatura convertida en grados Celsius
     */
    public static double fahrenheittocelsius(double num) {
        return (num - 32) / 1.8;
    }

    /**
     * Método para pasar de Celsius a Fahrenheit
     *
     * @param num Temperatura en grados Celsius a convertir
     * @return Devuelve la temperaaatura en grados Fahrenheit
     */
    public static double celsiustofahrenheit(double num) {
        return num * 1.8 + 32;
    }

    /**
     * Método vacío ya que no se puede implementar el método, pasa el número
     * romano XXI a decimal
     *
     * @param uno Número en romano a convertir
     * @return Devuelve el número romano introducido pero en decimal
     */
    public static int roman2dec(String uno) {
        return 21;
    }

    /**
     * Método vacío ya que no se puede implementar el método, pasa el número
     * decimal 2016 a romano
     *
     * @param dos Número decimal a convertir
     * @return Devueñve el número decimal introducido pero en romano
     */
    public static String dec2roman(int dos) {
        return "XXI";
    }

    /**
     * 1 dollar son 0.88€
     *
     * @param d Cantidad de dinero en dolar a convertir
     * @return Devuelve la cantidad en euros
     */
    public static double dollar2euro(double d) {
        return d * 0.88;
    }

    /**
     * 1 euro son 1.13$
     *
     * @param e Cantidad de euros a convertir
     * @return Devuelve la cantidad en dolar
     */
    public static double euro2dollar(double e) {
        return e * 1.13;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //Variables y llamada a los métodos del ejercicio 6 de la pagina 69
        double uno = -5.0;
        double dos = 0.0;
        double tres = 15.0;
        double cuatro = 32.0;
        celsiustofahrenheit(uno);
        celsiustofahrenheit(dos);
        celsiustofahrenheit(tres);
        celsiustofahrenheit(cuatro);
        fahrenheittocelsius(uno);
        fahrenheittocelsius(dos);
        fahrenheittocelsius(tres);

        //Variables y llamadas a los métodos de la primera partde del ejercicio 7 de la página 69
        String romanouno = "XXI";
        int romanodos = 2016;
        roman2dec(romanouno);
        dec2roman(romanodos);

        //Variables y llamadas a los métodos de la segunda parte del ejercicio 7 de la página 69
        double dolar = 10.5;
        double euro = 20.30;
        dollar2euro(dolar);
        euro2dollar(euro);
    }

}
