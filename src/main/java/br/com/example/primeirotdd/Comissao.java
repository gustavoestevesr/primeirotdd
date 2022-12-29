package br.com.example.primeirotdd;

public class Comissao {
    
    public Integer calcularComissao(int valorVenda){
        if (valorVenda < 1000) {
            return valorVenda / 100 * 10;
        } else {
            return valorVenda / 100 * 15;
        }
    }

}
