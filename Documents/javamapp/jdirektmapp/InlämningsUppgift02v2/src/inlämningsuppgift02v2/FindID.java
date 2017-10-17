/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämningsuppgift02v2;

/**
 *
 * @author ägare
 */
public class FindID {
    
    public int findID(String customerNr, String pnr){
        int i = 1;
        if(customerNr.equals(pnr)){
            i =1;
        }
        else 
            i=2;
        
     return i;   
    }
}
