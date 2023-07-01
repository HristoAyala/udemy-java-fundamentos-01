// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Variable de tipo entero
        int variableEntera = 100;
        System.out.println("Mi varibale entera: " + variableEntera);

        // Variable de tipo cadena
        String variableCadena = "Hola";
        System.out.println("Mi varibale cadena: " + variableCadena);

        // Variable de tipo var a partir de JDK 10
        var variableEnteraVar = 50;
        System.out.println("Mi varibale entera (var): " + variableEnteraVar);

        // Al definir nombre de las variables considerar lo siguiente:
        // 1. No empezar con moyúsculas
        // 2. No empezar con números
        // 1. No empezar con caracteres especiales

        //-------------------------------------------------------------------------------------------

        var nombre = "Karla";
        System.out.println("Nombre: \n" + nombre); // Salto de línea
        System.out.println("Nombre: \t" + nombre); // Añade tabulación
        System.out.println("Nombre: \b" + nombre); // Caracter de retroceso, regresa una entrada
    }
}