import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Qual a quantidade de números?");
            int totalNum = scanner.nextInt();

            int num1 = 0;
            int num2 = 1;

            for (int qtd = totalNum; qtd > 0; qtd--) {
                System.out.print(num1 + " ");
                int num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
        } finally {
            scanner.close();
        }
    }
}
