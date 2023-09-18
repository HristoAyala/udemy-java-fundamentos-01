package OperadoresAritmeticosJava;

public class OperadoresUnarios {
    public static void test () {
        int a = 3;
        int b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // incremento
        // 1. preincremento -> simbolo antes de la variable
        var e = 3;
        var f = ++e; // primero se incrementa la variable y despues se suma su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        // 2. posincremento -> simbolo despues de la variable
        var g = 5;
        var h = g++; // se incrementará la proxima vez que se use la variable
        System.out.println("g = " + g); // se incrementa -> 6
        System.out.println("h = " + h);

        // decremento
        // 1. predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //2. postdecremento
        var k = 3;
        var l = k--; // primero se usa el valor de la variable y queda pendiente el decremento
        System.out.println("k = " + k); // tenia pendiente un decremento
        System.out.println("l = " + l);
    }
}
