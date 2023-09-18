import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testesCalculadora {

    @Test
    //crie um metodo de teste
    public void testSoma(){
        //crie uma instancia da classe Calculadora
        Calculadora calc = new Calculadora();
        //chame o metodo soma passando os parametros 2 e 3
        int resultado = calc.soma(2, 3);
        //verifique se o resultado é igual a 5
        Assertions.assertEquals(5, resultado);
    }

    @Test
    public void testSubtracao(){
        Calculadora calc = new Calculadora();
        int sub = calc.subtracao(5, 3);
        //checa se o resultado da subtração é 2
        Assertions.assertEquals(2,sub);
    }

    @Test
    public void testMultiplicacao(){
        Calculadora calc = new Calculadora();
        int mult = calc.multiplicacao(5, 3);
        //checa se o resultado da multiplicação é 15
        Assertions.assertEquals(15,mult);
    }

    @Test
    public void testDivisao(){
        Calculadora calc = new Calculadora();
        int div = calc.divisao(6, 3);
        //checa se o resultado da divisão é 2
        Assertions.assertEquals(2,div);
    }
}
