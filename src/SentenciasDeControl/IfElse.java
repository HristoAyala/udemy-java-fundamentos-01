package SentenciasDeControl;

public class IfElse {
    public static void test() {
        var condicion = true;

        if (condicion) {
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }

        var numero = 2;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
