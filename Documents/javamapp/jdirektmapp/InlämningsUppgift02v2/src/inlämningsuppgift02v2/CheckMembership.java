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
public class CheckMembership {
    public String checkMembership(int paid){
        String gymMember;
                
        if(paid == 0){
            gymMember = "Nuvarande Medlem";
        }
        else if(paid>0)
            gymMember = "Före detta medlem";
        
        else
            gymMember = "Obehörig";
        
        return gymMember;  
    }
}
