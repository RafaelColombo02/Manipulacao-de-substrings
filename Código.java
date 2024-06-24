import java.util.Scanner;

public class ManipulacaoSubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar uma string ao usuário
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        // Verificar se a string não está vazia
        if (!entrada.isEmpty()) {
            // Exibir o substring sem o último caractere
            String substring = entrada.substring(0, entrada.length() - 1);
            System.out.println("Substring sem o último caractere: " + substring);
        } else {
            System.out.println("A string está vazia.");
        }

        scanner.close();
    }
}
