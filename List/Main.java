import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Banana");
        
        System.out.println("frutas na lista " + frutas);
        System.out.println("Primeira fruta " + frutas.get(0));
    }
}