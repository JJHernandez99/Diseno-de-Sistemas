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
public class Leaf implements Expresion {

	private int numero;

	public Leaf(int numero){
            this.numero = numero;
	}

        @Override
	public void agregar(Expresion expresion){

	}

        @Override
	public void eliminar(Expresion expresion){
                
	}

        @Override
	public double operacion(){
		return this.numero;
	}

}
