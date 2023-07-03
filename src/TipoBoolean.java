public class TipoBoolean {
    public static void test() {
        boolean varBoolean = true;
        System.out.println("varBoolean: " + varBoolean);

        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }

        var edad = 30;

        if ( edad >= 18 ) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
