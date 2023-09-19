package OperadoresAritmeticosJava;

public class PrecedenciaDeOperadores {
    public static void test () {
        var x = 5;
        var y = 10;
        var z = ++x + y--; // (5+1) + (10) = 16
        System.out.println("x = " + x);
        System.out.println("y = " + y); // 10-1 = 9
        System.out.println("z = " + z);

        var resultado = 4 + 5 * 6 / 3; // 14
        System.out.println("resultado = " + resultado);

        resultado = (4 + 5) * 6 / 3; //18
        System.out.println("resultado = " + resultado);
    }
}
