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
public class Binario implements Operacion{

    @Override
    public void OperarA(int num1, int num2) {
    }

    @Override
    public void OperarC(int num1) {
        
        String binario=null;
        int residuo;
        
        while(num1<=2){
            residuo=num1%2;
            binario = residuo+binario;
            num1=num1/2;
        }
    }
    
}
