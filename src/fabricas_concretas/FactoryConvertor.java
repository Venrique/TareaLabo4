/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.AbstractFactory;
import productos_abstractos.Operacion;
import productos_concretos.Binario;
import productos_concretos.Hexadecimal;
import productos_concretos.Octal;

/**
 *
 * @author LN710Q
 */
public class FactoryConvertor implements AbstractFactory {

    @Override
    public Operacion getConvertor(String type) {
        switch(type){
            case "binario":
                return new Binario();
            case "octal":
                return new Octal();
            case "hexadecimal":
                return new Hexadecimal();
        }
        return null;
    }

    @Override
    public Operacion getAritmetica(String type) {
        return null;
    }
    
}
