package tema4act6;

public class Tema4act6 {

public static double fahrenheittocelsius(double num){
    return (num-32)/1.8;
}
public static double celsiustofahrenheit(double num) {
    return num*1.8+32;
}
    public static void main(String[] args) {
        // TODO code application logic here
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
                
    }
    
}
