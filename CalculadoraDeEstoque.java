public class CalculadoraDeEstoque {
    public static void main (String[] args){
        
        double livroJava8 = 59.90;
        double livroTDD = 59.90;
        double soma = livroJava8 + livroTDD;
        
        System.out.println("O total em estoque é: R$ " + soma);
        if (soma < 150) {
            System.out.println("Seu estoque está baixo!");
        } else {
            System.out.println("Seu estoque está bom ^ ^");
        }
    }
}