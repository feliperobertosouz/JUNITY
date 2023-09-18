import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testesCalculadora {

    public void testeSoma(){
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(2,2);
        System.out.println("RESULTADO DA SOMA: " + resultado);
    }

    public void testeSubtracao(){
        Calculadora calc = new Calculadora();
        int resultado = calc.subtracao(2,2);
        System.out.println("RESULTADO DA SUBTRACAO: " + resultado);
    }

    public void testeMultiplicacao(){
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicacao(2,2);
        System.out.println("RESULTADO DA MULTIPLICACAO: " + resultado);
    }

    public void testeDivisao(){
        Calculadora calc = new Calculadora();
        int resultado = calc.divisao(2,2);
        System.out.println("RESULTADO DA DIVISAO: " + resultado);
    }



}
