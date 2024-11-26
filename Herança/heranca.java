import java.util.Date;

//Superclasse
class Pessoa {
    public String nome;
    public String cpf;
    public Date dataNascimento;

    public Pessoa (String nome, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
}

class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de nasciimento: " + dataNascimento);
        System.out.println("Matricula: " + matricula);
    }
}