public class Scanner {
    public static void test() {
        // Usando la clase Scanner ----------------------------------------------------------------
        java.util.Scanner console = new java.util.Scanner(System.in);

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
