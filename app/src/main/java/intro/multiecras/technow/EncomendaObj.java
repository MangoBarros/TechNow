package intro.multiecras.technow;

public class EncomendaObj {
    String produtos;
    String morada;
    Double preco;
    String pagamento;
    String data;
    Boolean confirmado;


    public EncomendaObj(String produtos, String morada, Double preco, String pagamento, String data) {
        this.produtos = produtos;
        this.morada = morada;
        this.preco = preco;
        this.pagamento = pagamento;
        this.data = data;
        this.confirmado = false;
    }
}
