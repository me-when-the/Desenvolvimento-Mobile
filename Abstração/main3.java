abstract class Veiculo {
    protected double cargaMaxima;

    public Veiculo(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public abstract void transportar();

    public double getCargaMaxima() {
        return cargaMaxima;
    }
}

class Caminhao extends Veiculo {
    public Caminhao(double cargaMaxima) {
        super(cargaMaxima);
    }

    @Override
    public void transportar() {
        System.out.println("Transportando carga com o caminhão. Carga máxima: " + cargaMaxima + " kg.");
    }
}

class Van extends Veiculo {
    public Van(double cargaMaxima) {
        super(cargaMaxima);
    }

    @Override
    public void transportar() {
        System.out.println("Transportando carga com a van. Carga máxima: " + cargaMaxima + " kg.");
    }
}

public class main3 {
    public static void main (String[] args) {
        Veiculo caminhao = new Caminhao(10000);
        Veiculo van = new Van(2000);
        caminhao.transportar();
        van.transportar();
    }
}
