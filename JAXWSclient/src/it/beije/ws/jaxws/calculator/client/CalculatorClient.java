package it.beije.ws.jaxws.calculator.client;
 
public class CalculatorClient {
 
    public static void main(String[] args) {
        CalculatorImplService service = new CalculatorImplService();
        Calculator calc = service.getCalculatorImplPort();
        
        int a = 56;
        int b = 63;
        int c = 92;
        int d = 140;
        
        System.out.println(a + " + " + b + " = " + calc.add(a, b));
        System.out.println(b + " - " + c + " = " + calc.subtract(b, c));
        System.out.println(d + " * " + d + " = " + calc.multiply(d, d));
        System.out.println(d + " / " + b + " = " + calc.divide(d, b));
    }
 
}
