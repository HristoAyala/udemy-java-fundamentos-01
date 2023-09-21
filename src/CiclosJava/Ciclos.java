package CiclosJava;

public class Ciclos {
    public static void test() {
        //While
        var contador = 0;
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }

        //Do while
        var contador2 = 0;
        do {
            System.out.println("contador = " + contador2);
            contador++;
        } while (contador2 < 0);

        //For
        for (var contador3 = 0; contador3 < 3; contador3++) {
            if (contador3 % 2 != 0) {
                //break;
                continue; // ir a la siguiente iteracion
            }
            System.out.println("contador3 = " + contador3);
        }

        //For mas etiquieta (label)
        inicio:
        for (var contador4 = 0; contador4 < 3; contador4++) {
            if (contador4 % 2 != 0) {
                //break;
                continue inicio; // ir a la linea de codigo 29
            }
            System.out.println("contador4 = " + contador4);
        }

        for (var contador5 = 0; contador5 < 3; contador5++) {
            if (contador5 % 2 != 0) {
                break;
            }
            System.out.println("contador5 = " + contador5);
        }
    }
}
