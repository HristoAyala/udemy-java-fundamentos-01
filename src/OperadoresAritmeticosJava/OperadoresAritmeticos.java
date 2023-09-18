package OperadoresAritmeticosJava;

public class OperadoresAritmeticos {

    public static void test() {
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("Resultado de la suma = " + resultado);

        resultado = a - b;
        System.out.println("Resultado de la resta = " + resultado);

        //Multiplicación
        resultado = a * b;
        System.out.println("Resultado de la multiplicación = " + resultado);

        //División
        var resultado2 = 3.0 / b;
        System.out.println("Resultado de la división = " + resultado2);

        resultado = a % b;
        System.out.println("Resultado del residuo de la división = " + resultado);

        if (a % 2 == 0) {
            System.out.println("Es número par");
        } else {
            System.out.println("Es número impar");
        }
    }
}
