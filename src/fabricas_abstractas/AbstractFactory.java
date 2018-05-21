/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_abstractas;

import productos_abstractos.Operacion;



/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
    Operacion getConvertor(String type);
    Operacion getAritmetica(String type);
}
