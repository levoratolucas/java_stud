import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Double pi = 3.146546;

        System.out.printf("nuemro teste %.4f \n\nqual a senha? \n\n", pi);

        String senha = scanner.nextLine();

        String senhaCorreta = "12345";

        if (senha.equals(senhaCorreta)) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }
    }
}
