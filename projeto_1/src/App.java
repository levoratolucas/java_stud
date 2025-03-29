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

        // ______________________________ pra concatenar variaveis dentro de box de texto ________________________

        String mensagem = String.format("""
                Olá, mundo!
                Este é um Text Block.
                Ele permite escrever %s textos com múltiplas linhas
                sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                """, senhaCorreta);
        String nome = "João";
        int aulas = 4;
        String mensagem2 = """
                Olá, %s!
                Boas vindas ao curso de Java.
                Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                """.formatted(nome, aulas);
        // ________________________________________________________________________________________________________


    }
}
