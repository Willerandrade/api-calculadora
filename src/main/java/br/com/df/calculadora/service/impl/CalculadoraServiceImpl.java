package br.com.df.calculadora.service.impl;

import br.com.df.calculadora.service.CalculadoraService;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

    @Override
    public String calculoSoma(double valor1, double valor2) {
        double soma = valor1+valor2;
        return "Resultado = " + soma;
    }

    @Override
    public String calculoDivisao(double valor1, double valor2) {
        double divisao = valor1 / valor2;
        return "Resultado = " + divisao;
    }

    @Override
    public String calculoMultiplicacao(double valor1, double valor2) {
        double multiplicacao = valor1 * valor2;
        return "Resultado = " + multiplicacao;
    }

    @Override
    public String calculoSubtracao(double valor1, double valor2) {
        double subtracao = valor1 - valor2;
        return "Resultado = " + subtracao;

    }

}
