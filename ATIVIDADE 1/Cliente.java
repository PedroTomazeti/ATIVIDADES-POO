import java.util.Date;

// Criação da classe com a herança da classe pai Pessoa
public class Cliente extends Pessoa {
    // Atributos
    private String endereco;

    // Estanciando a classe como objeto e colocando o seus parâmetros e da sua
    // classe pai
    public Cliente(String _nome, String _cpf, Integer _sexo, Date _idade, String _endereco) {
        super(_cpf, _nome, _sexo, _idade);
        this.endereco = _endereco;
    }

    public static void decidir() {

    }

    public static void comprar() {

    }
}
