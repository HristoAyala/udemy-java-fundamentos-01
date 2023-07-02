public class TiposNumericosFlotantes {
    public static void test() {
        //Tipos primitivos de tipo flotatnte: float (32bits), double(64bits)
        float numeroFloat = 3.4028235E38F; // (float) 10.0
        System.out.println("Numero float: " + numeroFloat);
        System.out.println("Valor mínimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);

        System.out.println("------------------------------------------------");
        double numeroDouble = 1.7976931348623157E308D;
        System.out.println("Numero double: " + numeroDouble);
        System.out.println("Valor mínimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);
    }
}
