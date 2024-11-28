import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Collection<String> vogais = new ArrayList<>();
        vogais.add("A");
        vogais.add("E");
        vogais.add("I");
        
        Collection<String> vogais2 = Arrays.asList("O", "U");
        
        vogais.addAll(vogais2);
        
        System.out.println("Lista de Vogais: " + vogais);
        
    }
}