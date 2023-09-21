package SentenciasDeControl;

public class Switch {
    public static void test() {
        var numero = 5;
        var numeroTexto = "valor desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "Numero 1";
                break;
            case 2:
                numeroTexto = "Numero 2";
                break;
            case 3:
                numeroTexto = "Numero 3";
                break;
            case 4:
                numeroTexto = "Numero 4";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }

        System.out.println("numeroTexto = " + numeroTexto);
    }
}
