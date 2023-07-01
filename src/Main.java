import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Usando la clase Scanner ----------------------------------------------------------------
        Scanner console = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        var user = console.nextLine();
        System.out.println("Nombre del usuario: " + user);

        // Tarea de practica
        System.out.println("Proporciona el titulo:");
        var title = console.nextLine();
        System.out.println("Proporciona el autor");
        var author = console.nextLine();
        System.out.println(title + " fue escrito por " + author);
    }
}