import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("De que número vocÊ quer a tabela de multiplicação?");
            int num = scanner.nextInt();

            for(int i = 1; i < 11; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        } finally {
            scanner.close();
        }
    }
}
