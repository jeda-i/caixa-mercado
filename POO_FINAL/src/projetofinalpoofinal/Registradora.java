package projetofinalpoofinal;

import java.util.Date;

public class Registradora {
    
    private Venda venda;
    private CatalogoDeProdutos catalogoDeProdutos;

    public Registradora() {
        this.catalogoDeProdutos = new CatalogoDeProdutos();
    }

    public void iniciarVenda() {
        this.venda = new Venda();
    }
    
    public void incluirItem(int id, int qtd) {
        EspecificacaoDeProduto spec = this.catalogoDeProdutos.getEspecificacao(id);
        this.venda.incluirItemDeVenda(spec, qtd);
    }
    
    public double concluirVenda() {
        return this.venda.getTotal();
    }
    
    public double getTroco() {
        return this.venda.getTroco();
    }
    
    public void efetuarPagamento(double valorPago) {
        this.venda.efetuarPagamento(valorPago);
    }
    
    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public CatalogoDeProdutos getCatalogoDeProdutos() {
        return catalogoDeProdutos;
    }

    public void setCatalogoDeProdutos(CatalogoDeProdutos catalogoDeProdutos) {
        this.catalogoDeProdutos = catalogoDeProdutos;
    }
    
}
