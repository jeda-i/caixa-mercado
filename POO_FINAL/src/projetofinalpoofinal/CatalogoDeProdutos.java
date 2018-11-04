package projetofinalpoofinal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatalogoDeProdutos {

    private Map<Integer, EspecificacaoDeProduto> catalogo;

    public CatalogoDeProdutos() {
        this.catalogo = new HashMap<>();
        
        // Ler o arquivo e obtem os produtos
        try {
            // ler todas as linhas do arquivo
            List<String> linhas = Files.readAllLines(Paths.get("produtos"));
            for (String linha : linhas) {
                String[] pedacos = linha.split(","); // Quebra a linha num vetor usando ','
                EspecificacaoDeProduto item =  new EspecificacaoDeProduto(Integer.parseInt(pedacos[0]),
                        pedacos[1], Double.parseDouble(pedacos[2]));
                catalogo.put(Integer.parseInt(pedacos[0]), item);
            }
        } catch (IOException ex) {
            // Imprimi onde aconteceu o erro
            ex.printStackTrace();
        }
    }

    public EspecificacaoDeProduto getEspecificacao(int id) {
        return this.catalogo.get(id);
    }
    
    public Map<Integer, EspecificacaoDeProduto> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Map<Integer, EspecificacaoDeProduto> catalogo) {
        this.catalogo = catalogo;
    }
    
}
