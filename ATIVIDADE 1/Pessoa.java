import java.util.Date;

// Criação da classe
public class Pessoa {
    // Atributos
    private String cpf;
    private String nome;
    private Integer sexo;
    private Date idade;

    // Estanciando a classe como objeto com seus atributos
    public Pessoa(String _cpf, String _nome, Integer _sexo, Date _idade) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.sexo = _sexo;
        this.idade = _idade;
    }

    // Definição dos métodos
    public static void andar() {
    }

    public static void falar() {

    }
}
