class Carro {
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}

class Fusca extends Carro {
    @Override
    public void acelerar() {
        System.out.println("O Fusca acelera lentamente: Vruum!");
    }
}

class Gol extends Carro {
    @Override
    public void acelerar(){
        System.out.println("O Gol acelera com potência: Vruuuuum!");
    }
}

class Jetta extends Carro {
    @Override
    public void acelerar() {
        System.out.println("O Jetta acelera rapidamente: Vruuuuum!");
    }
}

public class main2 {
    public static void main (String [] args) {
        Carro [] carros = new Carro [3];
        carros [0] = new Fusca();
        carros [1] = new Gol();
        carros[2] = new Jetta();


        for (Carro carro :carros) {
            carro.acelerar();    
        }
    }
}