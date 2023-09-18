package TiposPrimitivosJava;

public class TipoChar {
    public static void test() {
        // Tipo char (16bits)
        char miCaracter = 'a';
        System.out.println("Mi caracter: " + miCaracter); // list unicode;

        char varChar = '\u0021';
        System.out.println("varChar: " + varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal: " + varCharDecimal);

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo: " + varCharSimbolo);

        var varChar2 = '\u0021';
        System.out.println("varChar2: " + varChar2);

        var varCharDecimal2 = 33;
        System.out.println("varCharDecimal2: " + varCharDecimal2);

        var varCharSimbolo2 = '!';
        System.out.println("varCharSimbolo2: " + varCharSimbolo2);

        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo: " + variableEnteraSimbolo);
    }
}
