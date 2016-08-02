package classemath;

public class ClasseMath
{
    public static void main(String[] args)
    {
        double num1, num2, num3;
        
        System.out.println("O valor de PI é " + Math.PI + ".");
        System.out.println("O valor de Euler é " + Math.E + ".");
        
        num1 = Math.exp(1);
        
        System.out.printf("O exponencial de 1 é %2.2f\n\n", num1);
        
        num2 = Math.pow(2,2);
        
        System.out.println("2 elevado a 2 é " + num2 + ".");
        
        num3 = Math.sqrt(Math.PI);
        
        System.out.println("A raíz quadrada de PI é " + num3 + ".");
        System.out.println("A raíz quadrada de 9 é " + (int)Math.sqrt(9) + ".");
        
        System.out.println("O logaritmo natural de 10 é " + Math.log(10) + ".");
        
        System.out.println("O seno de 90 é " + Math.sin(Math.PI / 2) + ".");
        System.out.println("O cosseno de 0 é " + Math.cos(0) + ".");
        System.out.println("A tangente de 45 é " + Math.tan(Math.PI / 4));
        
        System.out.println("O módulo de 5.2 é " + Math.abs(5) + ".");
        System.out.println("O valor mínimo entre 1 e 5 é " + Math.min(1, 5) + ".");
        System.out.println("O valor máximo entre 1 e 5 é " + Math.max(1, 5) + ".");
        System.out.println("Arredondando 5.6 para cima, temos " + (int)Math.ceil(5.6) + ".");
        System.out.println("Arredondando o valor 5.6 para baixo, temos " + (int)Math.floor(5.6) + ".");
    }
}