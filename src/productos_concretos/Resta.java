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
public class Resta implements Operacion{

    @Override
    public float OperarA(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public String OperarC(int num1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
