import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String textoText = "testandoo!";
        int numeroNumbers = 3;
        // double numeroFloat = 3.3;
        // boolean falsoFalse = true;

        String nome = "Letícia";
        String sobrenome = "Montenegro";
        String nomeMeu = nome + " " + sobrenome + " " + textoText;
        System.out.println(nomeMeu);

        if(numeroNumbers == 3){
            System.out.println("hee!");
        } else {
            System.out.println("deu ruim!");
        }

        while (numeroNumbers != -1){
            System.out.println(numeroNumbers);
            numeroNumbers -= 1;
        }

        for (int number = -1; number != -4; number--){
            System.out.println(number);
        }

        String[] cidades = {"Patos", "Campina Grande", "João Pessoa"};
        for(int i = 0; i < cidades.length; i++){
            System.out.println((cidades[i]));
        }

        String[] idades = new String[3];
        idades[0] = "24";
        idades[0] = "25";

        List<String> gatos = new ArrayList<>();
        gatos.add("Luna");
        System.out.println(gatos.get(0));
    }
}
