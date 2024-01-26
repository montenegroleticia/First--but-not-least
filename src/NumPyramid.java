import java.util.Scanner;

public class NumPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        try {
            System.out.println("Qual o tamanho da sua piramide?");
            int num = scanner.nextInt();

            for(int i = 1; i <= num; i++) {
                String print = "";
                for(int j = 1; j <=i; j++) {
                    print += i;
                }
                System.out.println(print);
            }
        } finally {
            scanner.close();
        }
    }
}
