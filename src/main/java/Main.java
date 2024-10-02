import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Create a Scanner instance
    Scanner scanner = new Scanner(System.in);

    //Print the greeting
    System.out.println("Por favor ingrese su usario");

    //Print and Scan the sing-in fields
    System.out.println("Usuario: ");
    String user = scanner.nextLine();
    System.out.println("Contraseña: ");
    String pin = scanner.nextLine();

    }
}
