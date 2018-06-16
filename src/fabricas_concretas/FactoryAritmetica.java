/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.AbstractFactory;
import productos_abstractos.Operacion;
import productos_concretos.Division;
import productos_concretos.Multiplicacion;
import productos_concretos.Resta;
import productos_concretos.Suma;

/**
 *
 * @author LN710Q
 */
public class FactoryAritmetica implements AbstractFactory{

    @Override
    public Operacion getConvertor(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Operacion getAritmetica(String type) {
        switch(type){
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "multi":
                return new Multiplicacion();
            case "divi":
                return new Division();
        }
        return null;
    }
    
}
