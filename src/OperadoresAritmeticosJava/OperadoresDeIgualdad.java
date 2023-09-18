package OperadoresAritmeticosJava;

public class OperadoresDeIgualdad {
    public static void test () {
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2; // compara referencias de objetos
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2); // comparamos contenido de cadenas
        System.out.println("f = " + f);
    }
}
