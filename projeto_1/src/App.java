import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        
        double valor1 = 10.0;
        int f = (int) valor1;
        System.out.println(f);
        
        Double valor2 = 101.0;
        int f2 = valor2.intValue();
        System.out.println(f2);






        scanner.close();
    }

}
