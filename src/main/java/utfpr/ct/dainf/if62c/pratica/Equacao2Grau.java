/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Gustavo
 * @param <T>
 */
public class Equacao2Grau<T extends Number & Comparable<T>>{
    
    private T a;
    private T b;
    private T c;
    
    public Equacao2Grau(T a, T b, T c){
    
        if(a.doubleValue()==0)
            throw new RuntimeException("Coeficiente a não pode ser zero.");
        
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public T getC() {
        return c;
    }

    public void setA(T a){
        
        if(a.doubleValue()==0)
            throw new RuntimeException("Coeficiente a não pode ser zero.");
       
        this.a = a;
    }

    public void setB(T b) {
        this.b =  b;
    }

    public void setC(T c) {
        this.c = c;
    }
    
    public double getRaiz1(){
          
        double raiz1;
        double delta;
        
        delta = Math.pow(b.doubleValue(),2)-(4*(a.doubleValue())*(c.doubleValue()));
        
        if(delta<0)
            throw new RuntimeException("Equação não tem solução real");
        
        raiz1 = (-(b.doubleValue()) - (Math.sqrt(delta)))/(2*(a.doubleValue()));
        
        return raiz1;
    }
    
    public double getRaiz2(){
        
        double raiz2;
        double delta;
        
        delta = Math.pow(b.doubleValue(),2)-4*(a.doubleValue())*(c.doubleValue());
        
        if(delta<0)
            throw new RuntimeException("Equação não tem solução real");
        
        raiz2 = (-(b.doubleValue()) + (Math.sqrt(delta)))/(2*(a.doubleValue()));
        
        return raiz2;
        
    }
    
}
