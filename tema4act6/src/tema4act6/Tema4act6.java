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
 */
public static int roman2dec(String uno){
    return 21;
}
/**
 * Método vacío ya que no se puede implementar el método, pasa el número decimal 2016 a romano
 */
public static String dec2roman(int dos){
    return "XXI";
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
    }
    
}
