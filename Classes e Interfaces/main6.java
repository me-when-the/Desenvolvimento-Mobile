class Animal {
    private String animal;

    public Animal(String animal){
        this.animal = animal;
    }

    void fazerSom() {
        System.out.println("Animal faz som");
    }
}

class Cachorro extends Animal {
    private String cachorro;

    public Cachorro(String cachorro) {
        super(cachorro);
        this.cachorro = cachorro;
    }

    void fazerSom() {
        System.out.println("Cachorro late");
    }
}


public class main6 {
    public static void main(String[] args) {
        Animal animal = new Animal(null);
        Cachorro cachorro = new Cachorro(null);

        animal.fazerSom();
        cachorro.fazerSom();
    }
}