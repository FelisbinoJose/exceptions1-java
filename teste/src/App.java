import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o seu nome: ");
        String name = sc.nextLine();
        System.out.println(name);


        sc.close();
    }
}
