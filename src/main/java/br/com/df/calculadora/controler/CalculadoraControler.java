package br.com.df.calculadora.controler;

import br.com.df.calculadora.service.CalculadoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculadora")
public class CalculadoraControler {

    private final CalculadoraService calculadoraService;

    @GetMapping("soma")
    public String calculoSoma(BigDecimal valor1, BigDecimal valor2) {
        return calculadoraService.calculoSoma(valor1, valor2);
    }

    @GetMapping("multiplicacao")
    public String multiplicacao(BigDecimal valor1, BigDecimal valor2) {
        return calculadoraService.calculoMultiplicacao(valor1, valor2);
    }

    @GetMapping("divisao")
    public String divisao(BigDecimal valor1, BigDecimal valor2) {
        return calculadoraService.calculoDivisao(valor1, valor2);
    }

    @GetMapping("subtracao")
    public String subtracao(BigDecimal valor1, BigDecimal valor2) {
        return calculadoraService.calculoSubtracao(valor1, valor2);
    }

}