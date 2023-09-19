package OperadoresAritmeticosJava.Ejercicios;

public class NumeroMayor {
    public static void test() {
        java.util.Scanner console = new java.util.Scanner(System.in);

        System.out.println("Proporciona el numero 1:");
        int numero1 = Integer.parseInt(console.nextLine());
        System.out.println("Proporciona el numero 2:");
        int numero2 = Integer.parseInt(console.nextLine());

        int numMayor = (numero1 >= numero2) ? numero1 : numero2;

        System.out.println("El numero mayor es : " + numMayor);
    }
}
