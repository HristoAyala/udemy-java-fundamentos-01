package TiposPrimitivosJava;

public class TiposNumericosEnteros {
    public static void test() {
        //Tipos primitivos enteros: byte (8bits), short(16bits), int(16bits), long(32bits)
        byte numeroByte = (byte) 127;
        System.out.println("Valor mínimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        System.out.println("Valor de variable: " + numeroByte);

        System.out.println("------------------------------------------------");
        short numeroShort = 32767;
        System.out.println("Valor mínimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        System.out.println("Numero short: " + numeroShort);

        System.out.println("------------------------------------------------");
        int numeroInt = 2147483647;
        System.out.println("Valor mínimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        System.out.println("Numero int: " + numeroInt);

        System.out.println("------------------------------------------------");
        long numeroLong = 9223372036854775807L;
        System.out.println("Valor mínimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        System.out.println("Numero long: " + numeroLong);
    }
}
