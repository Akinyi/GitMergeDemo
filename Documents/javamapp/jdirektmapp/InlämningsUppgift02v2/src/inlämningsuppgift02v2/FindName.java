/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämningsuppgift02v2;

public class FindName {
   public int findName(String customerName, String name){
        customerName = customerName.trim();
        name = name.trim();
        int i = 1;
        if(customerName.equalsIgnoreCase(name)){
            i =1;
        }
        else 
            i=2;
        
     return i;   
    }  
   
//   public String findName(String customerName, String name){
//        customerName = customerName.trim();
//        name = name.trim();
//        String found = "";
//        if(customerName.equalsIgnoreCase(name)){
//            found = customerName;
//        }
//               
//        
//     return found;   
//    }  
   
   
   
   
   
   
}
