/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos;

import productos_abstractos.Operacion;

/**
 *
 * @author LN710Q
 */
public class Octal implements Operacion {

    @Override
    public float OperarA(int num1, int num2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String OperarC(int num1) {
        return Integer.toOctalString(num1);
        

    }


}
