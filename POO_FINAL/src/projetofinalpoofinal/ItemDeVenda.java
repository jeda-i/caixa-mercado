package projetofinalpoofinal;

public class ItemDeVenda {
    
    private EspecificacaoDeProduto especificacaoDeProduto;
    private int qtd;

    public ItemDeVenda(EspecificacaoDeProduto especificacaoDeProduto, int qtd) {
        this.especificacaoDeProduto = especificacaoDeProduto;
        this.qtd = qtd;
    }

    public double getSubTotal() {
        return this.especificacaoDeProduto.getPreco() * this.qtd;
    }
    
    public EspecificacaoDeProduto getEspecificacaoDeProduto() {
        return especificacaoDeProduto;
    }

    public void setEspecificacaoDeProduto(EspecificacaoDeProduto especificacaoDeProduto) {
        this.especificacaoDeProduto = especificacaoDeProduto;
    }
    
    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

}
