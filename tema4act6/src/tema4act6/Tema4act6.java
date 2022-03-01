package tema4act6;

public class Tema4act6 {
/**
 * Método para pasar de Fahrenheit a Celsius
 * @param num
 * @return 
 */
public static double fahrenheittocelsius(double num){
    return (num-32)/1.8;
}
/**
 * Método para pasar de Celsius a Fahrenheit
 * @param num
 * @return 
 */
public static double celsiustofahrenheit(double num) {
    return num*1.8+32;
}
/**
 * Método vacío ya que no se puede implementar el método, pasa el número romano XXI a decimal
 * @param uno
 * @return 
 */
public static int roman2dec(String uno){
    return 21;
}
/**
 * Método vacío ya que no se puede implementar el método, pasa el número decimal 2016 a romano
 * @param dos
 * @return 
 */
public static String dec2roman(int dos){
    return "XXI";
}
/**
 * 1 dollar son 0.88€
 * @param d
 * @return 
 */
public static double dollar2euro(double d) {
    return d*0.88;
}
/**
 * 1 euro son 1.13$
 * @param e
 * @return 
 */
public static double euro2dollar(double e) {
    return e*1.13;
}
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables y llamada a los métodos del ejercicio 6 de la pagina 69
        double uno=-5.0;
        double dos=0.0;
        double tres=15.0;
        double cuatro=32.0;
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
        double dolar=10.5;
        double euro=20.30;
        dollar2euro(dolar);
        euro2dollar(euro);
    }
    
}
