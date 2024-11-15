import java.util.Scanner;

public class ExemploIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quantos anos de experiência você possui: ");
        int anosDeExperiencia = scanner.nextInt();
        
        
        
        if(anosDeExperiencia <2){
            System.out.println("Você é um desenvolvedor júnior");
        }else if (anosDeExperiencia >= 2 && anosDeExperiencia < 5){
            System.out.println("Você é um desenvolvedor pleno");
        }else {
            System.out.println("Você é um programador sênior");
        }
    }
}