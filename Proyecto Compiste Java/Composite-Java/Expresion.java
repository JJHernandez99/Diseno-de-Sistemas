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
public interface Expresion {
    
    public void agregar(Expresion expresion);

    public void eliminar(Expresion expresion);
    
    public double operacion();

}
