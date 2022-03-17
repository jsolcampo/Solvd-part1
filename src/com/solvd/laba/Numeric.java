package com.solvd.laba;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Numeric{
	private List<Integer> listNumbers = new ArrayList<Integer>();
	
	protected List<Integer> ListNumbers() {
        return this.listNumbers;
    }
	  
    protected void AddNumbers(){
        Scanner scNumbers = new Scanner (System.in);
        Boolean endNumber = false;
        Integer number;

        while(!endNumber){
        
            System.out.println("Enter numeric value(If you finish adding, press 'n') ");
            String answer = scNumbers.next();

            if(answer.equals("n")){
                endNumber = true;
            } else {
                number = Integer.parseInt(answer);
                listNumbers.add(number);
            }
        }
        //scNumbers.close();
    }

    protected static void printArray(Integer arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    protected static void sortArray(Integer array[]){

        Boolean endOfSorting = false;
        Scanner scSort = new Scanner (System.in);
        //List menu

        while(endOfSorting == false){
            System.out.print("\n Menu of sorting: \n");
            System.out.print("a) Sort asc \n");
            System.out.print("b) Sort desc \n");
            System.out.print("c) End\n\n");


            String value = scSort.next();

            if(value.equals("a")){

                Arrays.sort(array);
                System.out.print("Sort asc: ");
                printArray(array);                           

            }else if(value.equals("b")){
              
                Arrays.sort(array, Collections.reverseOrder());
                System.out.print("Sort desc: ");
                printArray(array);                     

            }else if(value.equals("c")){

                    endOfSorting = true;
            }
        }
     }
}