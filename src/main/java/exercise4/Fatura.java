package exercise4;

public class Fatura {

    private String numero;

    private String descricao;

    private Integer qtdComprada;

    private Double preco;

    public Fatura(String numero, String descricao, Integer qtdComprada, Double preco) {
        setNumero(numero);
        setDescricao(descricao);
        setQtdComprada(qtdComprada);
        setPreco(preco);
    }

    public void getValorFatura(){
        Double valorFatura = qtdComprada * preco;
        System.out.printf("O valor da fatura é %.2f.%n", valorFatura);
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(Integer qtdComprada) {
        this.qtdComprada = Math.max(qtdComprada, 0);
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = Math.max(preco, 0);
    }
}
