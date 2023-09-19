package OperadoresAritmeticosJava;

public class OperadorTernario {
    public static void test () {
        var resultado = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);

        var numero = 8;
        resultado = (numero % 2 == 0) ? "Numero par" : "Numero impar";
        System.out.println("resultado = " + resultado);
    }
}
