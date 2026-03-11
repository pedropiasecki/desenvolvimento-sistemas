package view;

import controller.ContadorController;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContadorController controller = new ContadorController();

        System.out.println("Digite um texto:");

        String texto = scanner.nextLine();

        int total = controller.contar(texto);

        System.out.println("Nº de palavras: " + total);

        scanner.close();
    }
}
