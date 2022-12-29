package br.com.example.primeirotdd;

public class Comissao {
    
    public Double calcularComissao(Double valorVenda){

        double valorComissao;

        if (valorVenda < 1000) {
            valorComissao = valorVenda / 100 * 10;
        } else {
            valorComissao = valorVenda / 100 * 15;
        }

        return Math.round(valorComissao * 100) / 100d; // formatar em 1 casa decimail
    }

}
