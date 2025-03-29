import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // int a = 5;
        // int b = 10;
        // int soma = a + b;

        // String nome ;

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Digite seu nome: ");

        // nome = scanner.nextLine(); // levorato]

        Double pi = 3.146546;

        System.out.printf("nuemro teste %.4f \n\nqual a senha? \n\n", pi);

        // String ola = "Oi Tudo bem " + nome + "?";

        // System.out.println(ola);
        // System.out.println(soma);
        // System.out.println(nome);

        String senha = scanner.nextLine();;
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

    }
}
