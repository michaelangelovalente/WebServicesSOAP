package it.beije.ws.jaxws.calculator.server;
 
import javax.jws.WebService;

import it.beije.ws.jaxws.calculator.server.Calculator;
 
@WebService(endpointInterface = "it.beije.ws.jaxws.calculator.server.Calculator")
public class CalculatorImpl implements Calculator {
 
    @Override
    public int add(int a, int b) {
    	System.out.println("add " + a + " + " + b);
        return a + b;
    }
 
    @Override
    public int subtract(int a, int b) {
    	System.out.println("subtract " + a + " - " + b);
        return a - b;
    }
 
    @Override
    public int multiply(int a, int b) {
    	System.out.println("multiply " + a + " * " + b);
        return a * b;
    }
 
    @Override
    public int divide(int a, int b) {
    	System.out.println("divide " + a + " / " + b);
        return a / b;
    }
 
    @Override
    public int module(int a, int b) {
    	System.out.println("module " + a + " % " + b);
        return a % b;
    }
}