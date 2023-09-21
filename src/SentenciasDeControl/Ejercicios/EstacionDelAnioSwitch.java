package SentenciasDeControl.Ejercicios;

public class EstacionDelAnioSwitch {
    public static void test() {
        var mes = 10;
        var estacion = "Estacion desconocida";

        switch (mes) {
            case 1, 2, 12:
                estacion = "invierno";
                break;
            case 3, 4, 5:
                estacion = "primavera";
                break;
            case 6, 7, 8:
                estacion = "verano";
                break;
            case 9, 10, 11:
                estacion = estacion = "otoño";
                break;
        }

        System.out.println("estacion = " + estacion);
    }
}
