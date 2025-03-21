// Classe Motor
class Motor {
    private int potencia;
    private String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public void ligar() {
        System.out.println("Motor " + tipo + " ligado com potência de " + potencia + " CV");
    }

    public void desligar(){
        System.out.println("Motor á " + tipo + " desligado.");
    }

    public int getPotencia() {
        return potencia;
    }

    public String getTipo() {
        return tipo;
    }
}

class Carro {
    private String modelo;
    private String cor;
    private Motor motor;

    public Carro(String modelo, String cor, Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
    }

    public void acelerar() {
        motor.ligar();
        System.out.println("O carro " + modelo + " " + cor + " está acelerando com potência de " + motor.getPotencia() + " CV.");
    }

    public void frear() {
        System.out.println("O carro " + modelo + " " + cor + " está freando.");
        motor.desligar();
    }
}

public class main4 {
    public static void main(String[] args) {
        Motor motor = new Motor(150, "Gasolina");
        Carro carro = new Carro("Fusca", "Azul", motor);

        carro.acelerar();
        carro.frear();
    }
}