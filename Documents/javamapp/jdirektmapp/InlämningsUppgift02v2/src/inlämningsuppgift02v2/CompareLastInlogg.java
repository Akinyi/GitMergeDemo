
package inlämningsuppgift02v2;

import java.time.LocalDate;
import java.time.Period;


public class CompareLastInlogg {
     public int compareLastInlogg(String date){
        int paid;
        String recentPayment;
        Period duration = Period.between(LocalDate.parse(date), LocalDate.now());
        recentPayment = " " + duration.getYears() + " years " + duration.getMonths() + 
                " months " + duration.getDays() + " days ";
        recentPayment = recentPayment.trim(); 
         //System.out.println(recentPayment);
         String p = recentPayment.charAt(0)+"";
        paid = Integer.parseInt(p);
        return paid;
    }
      
     
}
