/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.video;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Joaquin
 */
public class ExpresionComposite implements Expresion {

	private String operacion;
        private List<Expresion> expresionList;

	public ExpresionComposite(String operacion){
           this.operacion = operacion;
           this.expresionList = new ArrayList<>();
             
	}

        @Override
	public void agregar(Expresion expresion){
            this.expresionList.add(expresion);
	}
	
        @Override
	public void eliminar(Expresion expresion){
            this.expresionList.remove(expresion);
	}

        @Override
	public double operacion(){
            double resultado = 0;
            double[] numeros = this.expresionList.stream().mapToDouble(Expresion::operacion).toArray();
            if (this.operacion.equals("+")){
                resultado = this.expresionList.stream().mapToDouble(Expresion::operacion).sum();
            }
            
            
            if (this.operacion.equals("-")){
                //double[] numeros = this.expresionList.stream().mapToDouble(Expresion::operacion).toArray();
                for (int i = 0; i < numeros.length -1; i++){
                    resultado = resultado + (numeros[i] - numeros[i+1]);
                }
            }
            
            if (this.operacion.equals("*")){
                //double[] numeros = this.expresionList.stream().mapToDouble(Expresion::operacion).toArray();
                for (int i = 0; i < numeros.length -1; i++){
                    resultado = resultado + (numeros[i] * numeros[i+1]);    
                }
            }
           
            
            
            if (this.operacion.equals("/")){
                //double[] numeros = this.expresionList.stream().mapToDouble(Expresion::operacion).toArray();
                for (int i = 0; i < numeros.length -1; i++){
                    resultado = resultado + (numeros[i] / numeros[i+1]);  
                }
            }
            return resultado;
        }    
}