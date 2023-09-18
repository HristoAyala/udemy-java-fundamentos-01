package TiposPrimitivosJava;

public class ConversionTiposPrimitivos {
    public static void test() {
        // Covertir tipo String a tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad: " + (edad + 1));

        var pi = Double.parseDouble("3.1416");
        System.out.println("pi: " + pi);

        //Solicitar un valor
//        var console = new java.util.Scanner(System.in);
//        System.out.println("Ingrese su edad");
//        edad = Integer.parseInt(console.nextLine());
//        System.out.println("edad ingresada: " + edad);

        var edadText = String.valueOf(10);
        System.out.println("edadText: " + edadText);

        var caracter = "hola".charAt(2);
        System.out.println("caracter: " + caracter);
    }
}
