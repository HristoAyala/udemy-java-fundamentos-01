package OperadoresAritmeticosJava.Ejercicios;

public class AreaDeRectangulo {
    public static void test() {
        java.util.Scanner console = new java.util.Scanner(System.in);

        System.out.println("Proporciona el alto:");
        int alto = Integer.parseInt(console.nextLine());
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.parseInt(console.nextLine());

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area : " + area);
        System.out.println("Perimetro : " + perimetro);
    }
}
