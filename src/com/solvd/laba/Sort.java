package com.solvd.laba;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
                               
public class Sort {

	public static void main(String[] arg) {
		//Add value
        Scanner sc = new Scanner (System.in);
        Boolean endOfValue  = false;
        String typeValue = null;
        Numeric objValueN = new Numeric();
        Alphabetic objValueA = new Alphabetic();

        while(endOfValue == false){
            System.out.print("\n Menu of values: \n");
            System.out.print("a) Numeric values \n");
            System.out.print("b) Alphabet values \n");

            String value = sc.next();
            typeValue = value;

            if(value.equals("a")){
                
            	objValueN.AddNumbers();

                //Print array of numbers
                Integer[] array = new Integer[objValueN.ListNumbers().size()];

                for(int i = 0; i < objValueN.ListNumbers().size(); i++) {
                    array[i] = objValueN.ListNumbers().get(i);
                }
            
                System.out.println("The numeric values are: ");
                Numeric.printArray(array);
        
                endOfValue = true;

            }else if(value.equals("b")){
            
            	objValueA.AddLetters();

                //Print array of letters
                String[] array = new String[objValueA.ListLetters().size()];

                for(int i = 0; i < objValueA.ListLetters().size(); i++) {
                    array[i] = objValueA.ListLetters().get(i);
                }
                    
                System.out.println("The alphabetic values are: ");
                Alphabetic.printArray(array);

                endOfValue = true;

            }else{
                System.out.print("Option not valid. \n");
            }
        }

        if (typeValue.equals("a")) {
        	
        	Integer[] array = new Integer[objValueN.ListNumbers().size()];
        	
            for(int i = 0; i < objValueN.ListNumbers().size(); i++) {
                array[i] = objValueN.ListNumbers().get(i);
            }

            Numeric.sortArray(array);

        } else if (typeValue.equals("b")) {
        	
            String[] array = new String[objValueA.ListLetters().size()];

            for(int i = 0; i < objValueA.ListLetters().size(); i++) {
                array[i] = objValueA.ListLetters().get(i);
            }

            Alphabetic.sortArray(array);
        }
        sc.close();
	}
}