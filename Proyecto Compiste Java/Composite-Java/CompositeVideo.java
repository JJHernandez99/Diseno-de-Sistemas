/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.video;

/**
 *
 * @author Joaquin
 */
public class CompositeVideo {

    
    public static void main(String[] args) {
        
        ExpresionComposite sum = new ExpresionComposite("+");
        ExpresionComposite res = new ExpresionComposite("-");
        ExpresionComposite mul = new ExpresionComposite("*");
        ExpresionComposite div = new ExpresionComposite("/");
        
        Leaf uno = new Leaf(1);
        Leaf dos = new Leaf(2);
        Leaf tres = new Leaf(3);
        Leaf cuatro = new Leaf(4);
        Leaf ocho = new Leaf(8);
        
        sum.agregar(uno);
        sum.agregar(tres);
        
        res.agregar(tres);
        res.agregar(uno);
        
        mul.agregar(tres);// 3*2 = 6 Ok
        mul.agregar(dos);
        
        div.agregar(ocho);// 8/2 = 4 Ok
        div.agregar(dos);
        
        double cuenta = sum.operacion();
        double cuenta2 = res.operacion();
        double cuenta3 = mul.operacion();
        double cuenta4 = div.operacion();
        
        System.out.println("La suma de las hojas es: " + cuenta);
        System.out.println("La resta de las hojas es: " + cuenta2);
        System.out.println("La multiplicacion de las hojas es: " + cuenta3);
        System.out.println("La divicion de las hojas es: " + cuenta4);
        
        
    }
    
}
