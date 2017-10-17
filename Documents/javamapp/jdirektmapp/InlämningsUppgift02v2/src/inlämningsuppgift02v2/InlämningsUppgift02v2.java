
package inlämningsuppgift02v2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.nio.file.Files.write;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class InlämningsUppgift02v2 {

    
      //Metoder
    public int findID(String customerNr, String pnr){
        int i = 1;
        if(customerNr.equals(pnr)){
            i =1;
        }
        else 
            i=2;
        
     return i;   
    }

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
 //======================================================================   
    
    
    InlämningsUppgift02v2() throws IOException{
        File customersTrained2 = new File("src\\inlämningsuppgift02v2\\customersTrained2.txt");
        customersTrained2.createNewFile();
        Scanner sc = new Scanner(System.in);
        File inFilename = new File("src\\inlämningsuppgift02v2\\customers2.txt");
        String filePath = "src\\inlämningsuppgift02v2\\"+inFilename;
        String firstLine = "",  secondLine = "";
        Path inFilePath;
        String outFilePathString = "src\\inlämningsuppgift02v2\\customersTrained2.txt";
        Path outFilePath = Paths.get("src\\inlämningsuppgift02v2\\customersTrained2.txt");
//        FileWriter fw = new FileWriter(filePath, shouldAppend);
//    //PrintWriter w = new PrintWriter(new BufferedWriter(new FileWriter(filnamn)));
//  
//    //BufferedWriter utfil = new BufferedWriter(new FileWriter("customersTrained2.txt", true));
//    
        String pnr,  finnsPersonNummer, finnsPersonNamn, senastBetalning;
        String[] pnrAndName;
        LocalDate dateNow = LocalDate.now();
    
    Scanner scPN = new Scanner(System.in);
    System.out.print("Kundens personnummer eller namn: "); System.out.flush();
    pnr = scPN.nextLine().trim();
    System.out.println(" ");
    try(PrintWriter write = new PrintWriter(Files.newBufferedWriter(outFilePath))){
     inFilePath = Paths.get(filePath);
            Scanner fileScanner = new Scanner(inFilename); 
            while (fileScanner.hasNext()){
            
               firstLine = fileScanner.nextLine();
               
               pnrAndName = firstLine.split(","); // Splitar raden med komma till två strings
               finnsPersonNummer = pnrAndName[0].trim(); // personnummer
            
                if(findID(finnsPersonNummer,pnr) == 1 ){// || findName(finnsPersonNamn,pnr) == 1
                System.out.println("\n"+firstLine);   
                write.println(firstLine + "\n");
                
                  if(fileScanner.hasNext())
                   secondLine = fileScanner.nextLine();

                   int paid = compareLastInlogg(secondLine); 
                 
                    System.out.println("Senast avgiftsbetalning: " + secondLine + "\n");
                    System.out.println(checkMembership(paid) + "\n");
                    write.println("Inloggad: " + dateNow + "  \n" +
                    checkMembership(paid)+"\n" ); // Prints out to customersTrained File
                    write.println("--------------------------------------------");// prints a separator line
                }
              }
               
              
            }catch(Exception e){
            System.out.println("Could not find text in file");
            //e.printStackTrace();
            System.out.flush();
            System.exit(0);
       }

    }
        
    public static void main(String[] args) throws IOException {
      InlämningsUppgift02v2 inup = new InlämningsUppgift02v2();
    }
    
    
  
}
