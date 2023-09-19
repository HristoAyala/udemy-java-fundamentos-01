package OperadoresAritmeticosJava;

public class OperadoresCondicionales {
    public static void test () {
        var a = 15;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= 0 && a <= 10;
        if (resultado) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }

        var vacaciones = false;
        var descanso = false;

        if (vacaciones || descanso) {
            System.out.println("Padre puede asistir al juego de su hijo");
        } else {
            System.out.println("Padre esta ocupado");
        }
    }
}
