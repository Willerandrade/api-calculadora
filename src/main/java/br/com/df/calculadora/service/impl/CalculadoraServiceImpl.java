package br.com.df.calculadora.service.impl;

import br.com.df.calculadora.service.CalculadoraService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

    @Override
    public String calculoSoma(BigDecimal valor1, BigDecimal valor2) {
        BigDecimal soma = valor1.add(valor2);
        return "Resultado = " + soma;
    }

    @Override
    public String calculoDivisao(BigDecimal valor1, BigDecimal valor2) {
        BigDecimal divisao = valor1.divide(valor2);
        return "Resultado = " + divisao;
    }

    @Override
    public String calculoMultiplicacao(BigDecimal valor1, BigDecimal valor2) {
        BigDecimal multiplicacao = valor1.multiply(valor2);
        return "Resultado = " + multiplicacao;
    }

    @Override
    public String calculoSubtracao(BigDecimal valor1, BigDecimal valor2) {
        BigDecimal subtracao = valor1.subtract(valor2);
        return "Resultado = " + subtracao;

    }

}
