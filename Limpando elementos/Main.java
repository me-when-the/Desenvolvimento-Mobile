import java.util.Collection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Collection<String> livros = new ArrayList<>();
        livros.add("Java");
        livros.add("PhP");
        livros.add("Python");
        livros.add("SQL");
        
        
        System.out.println("Listagem de livros: " + livros);
        
        livros.clear();
        
        System.out.println("Listagem de livros: " + livros);
    }
}