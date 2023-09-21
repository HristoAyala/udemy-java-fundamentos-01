package SentenciasDeControl.Ejercicios;

public class CalcularCalificacion {
    public static void test() {
        java.util.Scanner console = new java.util.Scanner(System.in);

        System.out.println("Proporciona un valor entre 0 y 10:");
        int valor = Integer.parseInt(console.nextLine());

        var calificacion = "Valor desconocido";

        if (valor >= 0 && valor < 6) calificacion = "F";
        else if (valor == 6) calificacion = "D";
        else if (valor == 7) calificacion = "C";
        else if (valor == 8) calificacion = "B";
        else if (valor >= 9 && valor <= 10) calificacion = "A";

        System.out.println("calificacion = " + calificacion);
    }
}
