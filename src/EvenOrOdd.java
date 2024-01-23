import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite um número:");
            int num = scanner.nextInt();
    
            String print = num + " é ";
    
            if (num % 2 == 0){
                print += "par";
            } else {
                print += "ímpar";
            }
            if (num > 0){
                print += " e positivo.";
            } else {
                print += " e negativo.";
            }
    
            System.out.println(print);
        } finally {
            scanner.close();
        }
    }
}
