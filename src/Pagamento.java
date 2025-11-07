package model;

public class Pagamento {
    private String dataPagamento;
    private double valorPago;
    private String idDespesa;

    public Pagamento(String dataPagamento, double valorPago, String idDespesa) {
        this.dataPagamento = dataPagamento;
        this.valorPago = valorPago;
        this.idDespesa = idDespesa;
    }
}