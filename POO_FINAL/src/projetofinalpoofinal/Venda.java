package projetofinalpoofinal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {

    private Date data;
    private List<ItemDeVenda> itensDeVenda;
    private Pagamento pagamento;

    public Venda() {
        this.data = new Date();
        this.itensDeVenda = new ArrayList<>();
    }

    public void incluirItemDeVenda(EspecificacaoDeProduto spec, int qtd) {
        ItemDeVenda iv = new ItemDeVenda(spec, qtd);
        this.itensDeVenda.add(iv);
    }
    
    public double getTotal() {
        double total = 0;
        for (ItemDeVenda iv : this.itensDeVenda) {
            total += iv.getSubTotal();
        }
        return total;
    }
    
    public double getTroco() {
        return this.pagamento.getValorPago() - this.getTotal();
    }
    
    void efetuarPagamento(double valorPago) {
        this.pagamento = new Pagamento(valorPago);
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<ItemDeVenda> getItensDeVenda() {
        return itensDeVenda;
    }

    public void setItensDeVenda(List<ItemDeVenda> itensDeVenda) {
        this.itensDeVenda = itensDeVenda;
    }

}
