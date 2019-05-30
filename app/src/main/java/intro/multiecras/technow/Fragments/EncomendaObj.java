package intro.multiecras.technow.Fragments;

public class EncomendaObj {
    public String produtos;
    public String morada;
    public Double preco;
    public String pagamento;
    public String data;
    public Boolean confirmado;


    public EncomendaObj(String produtos, String morada, Double preco, String pagamento, String data) {
        this.produtos = produtos;
        this.morada = morada;
        this.preco = preco;
        this.pagamento = pagamento;
        this.data = data;
        this.confirmado = false;
    }
}
