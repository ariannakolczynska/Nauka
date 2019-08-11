/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.pkg378;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author Horikss
 */
class number {
         long number3;
        List<Long> number = new ArrayList();
        public void putList(long t){
        do{
              number.add(t%10);
        t /=10;
        }while(t != 0);
      
        }
       public void showList(){
 String listString = number.stream().map(Object::toString).collect(Collectors.joining(", "));
     System.out.println(listString);
       }
       public void Option1(){
            for(int i =0; i < number.size();i++){
               if(number.get(i) == 0 ){
                   number.remove(i);
                   i--;
               }
                   
           }
           
       }
       public void Option2(){
            for(int i =0; i < number.size();i++){
             Collections.sort(number);
                   
           }
             Collections.reverse(number);
       }
       boolean check;
       public boolean Option3(){
           number3 = number.get(0);
           number.remove(0);
           if( number.size() <= number3){
               check= false; 

           }
           else{
               check= true;
 
           }
           
           return  check;
           
       }
       

       public void Option4(){
           
 if(Option3()){
     System.out.println("test");
    for(int i =0; i < number3;i++){
             number.set(i, (number.get(i) - 1));         
} showList();

           
 
       }
 else{
     System.out.println("False mean stop");
 }
       }

       
}

