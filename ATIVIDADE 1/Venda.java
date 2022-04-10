import java.util.ArrayList;
import java.util.Date;

// Criação da classe
public class Venda {
    // Construindo seus atributos
    private Float valorFinal;
    private String concessionaria;
    private Integer parcelamento;
    private ArrayList<String> carrinho = new ArrayList<>();

    // Estanciando seus atributos no objeto juntamente com os pertecentes à classe
    // Cliente
    public Venda(Float _valorFinal, String _concessionaria, Integer _parcelamento, ArrayList<String> _carrinho) {
        this.valorFinal = _valorFinal;
        this.concessionaria = _concessionaria;
        this.parcelamento = _parcelamento;
        this.carrinho = _carrinho;
    }

    // Definindo seus métodos
    public static Integer consultarEstoque(String modelo, Integer ano, String cor) {

    }

    public static void registroCliente(String _cpf, String _nome) {

    }

    public static Integer comprarCarro(ArrayList<String> carro) {

    }
}
