package br.com.example.primeirotdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootTest
public class ComissaoTest {
    
    @TestConfiguration
    static class ComissaoConfiguracao{
        @Bean
        public Comissao comissao(){
            return new Comissao();
        }
    }

    @Autowired
    Comissao comissao;

    @Test
    public void deve_calcular_20_reais_de_comissao_para_uma_venda_de_200_reais(){        
        Double valorVenda = 200.0; // Preparação
        Double valorComissaoEsperada = 20.0; // Preparação

        Double comissaoCalculada = comissao.calcularComissao(valorVenda); // Ação

        Assertions.assertEquals(valorComissaoEsperada, comissaoCalculada); // Confirmação
    }

    @Test
    public void deve_calcular_234_11_reais_de_comissao_para_uma_venda_de_1560_70_reais(){        
        Double valorVenda = 1560.70; // Preparação
        Double valorComissaoEsperada = 234.11; // Preparação

        Double comissaoCalculada = comissao.calcularComissao(valorVenda); // Ação

        Assertions.assertEquals(valorComissaoEsperada, comissaoCalculada); // Confirmação
    }

}
