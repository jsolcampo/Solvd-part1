package com.solvd.laba;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Alphabetic{
private List<String> listLetters = new ArrayList<String>();
	
	protected List<String> ListLetters() {
        return this.listLetters;
    }

	protected void AddLetters(){
        Scanner scLetters = new Scanner (System.in);
        Boolean endLetter = false;
        String letter;

        while(!endLetter){
        
            System.out.println("Enter alphabetic value(If you finish adding, press '1') ");
            String answer = scLetters.next();

            if(answer.equals("1")){
                endLetter = true;
            } else {
                letter = String.valueOf(answer);
                listLetters.add(letter);
            }
        }
        //scLetters.close();
    }

    protected static void printArray(String arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    protected static void sortArray(String array[]){

        Boolean endOfSorting = false;
        Scanner sc = new Scanner (System.in);
        //List menu

        while(endOfSorting == false){
            System.out.print("\n Menu of sorting: \n");
            System.out.print("a) Sort asc \n");
            System.out.print("b) Sort desc \n");
            System.out.print("c) End\n");

            String value = sc.next();

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