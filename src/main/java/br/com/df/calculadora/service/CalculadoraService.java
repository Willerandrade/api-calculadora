package br.com.df.calculadora.service;

import java.math.BigDecimal;

public interface CalculadoraService {

    String calculoSoma(BigDecimal valor1, BigDecimal valor2);

    String calculoDivisao(BigDecimal valor1, BigDecimal valor2);

    String calculoMultiplicacao(BigDecimal valor1, BigDecimal valor2);

    String calculoSubtracao(BigDecimal valor1, BigDecimal valor2);

}
