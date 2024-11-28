import java.util.Collection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Collection<String> vogais = new ArrayList<>();
        vogais.add("A");
        vogais.add("E");
        vogais.add("I");
        vogais.add("O");
        vogais.add("U");
        
        System.out.println("Contém a vogal I?: " + vogais.contains("I"));
        System.out.println("Listagem das vogais: " + vogais);
    }
}