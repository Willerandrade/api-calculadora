package br.com.df.calculadora.controler;

import br.com.df.calculadora.service.CalculadoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculadora")
public class CalculadoraControler {

    private final CalculadoraService calculadoraService;

    @GetMapping("soma")
    public String calculoSoma(double valor1, double valor2) {
        return calculadoraService.calculoSoma(valor1, valor2);
    }

    @GetMapping("multiplicacao")
    public String multiplicacao(double valor1, double valor2) {
        return calculadoraService.calculoMultiplicacao(valor1, valor2);
    }

    @GetMapping("divisao")
    public String divisao(double valor1, double valor2) {
        return calculadoraService.calculoDivisao(valor1, valor2);
    }

    @GetMapping("subtracao")
    public String subtracao(double valor1, double valor2) {
        return calculadoraService.calculoSubtracao(valor1, valor2);
    }

}