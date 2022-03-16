package com.solvd.laba;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Sort {

    List<Integer> listNumbers = new ArrayList<Integer>();
    List<String> listLetters = new ArrayList<String>();
    

    void AddNumbers(){
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
        scNumbers.close();
    }

    void AddLetters(){
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
        scLetters.close();
    }

    static void printArray(Integer arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void printArray(String arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void sortArray(Integer array[]){

        Boolean endOfSorting = false;
        Scanner sc = new Scanner (System.in);
        //Listar menu

        while(endOfSorting == false){
            System.out.print("\n Menu of sorting: \n");
            System.out.print("a) Sort asc \n");
            System.out.print("b) Sort desc \n");
            System.out.print("c) End\n\n");

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
        sc.close();
    }

    static void sortArray(String array[]){

        Boolean endOfSorting = false;
        Scanner sc = new Scanner (System.in);
        //Listar menu

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
        sc.close();
    }


    public static void main(String[ ] arg) {

        //Add value
        Scanner sc = new Scanner (System.in);
        Boolean endOfValue  = false;
        Sort objValue = new Sort();
        String typeValue = null;

        while(endOfValue == false){
            System.out.print("\n Menu of values: \n");
            System.out.print("a) Numeric values \n");
            System.out.print("b) Alphabet values \n");

            String value = sc.next();
            typeValue = value;


            if(value.equals("a")){
                //System.out.print("Option a. \n");
                objValue.AddNumbers();

                //Print array of numbers
                Integer[] array = new Integer[objValue.listNumbers.size()];

                for(int i = 0; i < objValue.listNumbers.size(); i++) {
                    array[i] = objValue.listNumbers.get(i);
                }
            
                System.out.println("The numeric values are: ");
                Sort.printArray(array);
        
                endOfValue = true;

            }else if(value.equals("b")){
                //System.out.print("Option b. \n");
                objValue.AddLetters();

                //Print array of letters
                String[] array = new String[objValue.listLetters.size()];

                for(int i = 0; i < objValue.listLetters.size(); i++) {
                    array[i] = objValue.listLetters.get(i);
                }
                    
                System.out.println("The alphabetic values are: ");
                Sort.printArray(array);

                endOfValue = true;

            }else{
                System.out.print("Option not valid. \n");
            }
        }

        if (typeValue.equals("a")) {
            Integer[] array = new Integer[objValue.listNumbers.size()];

            for(int i = 0; i < objValue.listNumbers.size(); i++) {
                array[i] = objValue.listNumbers.get(i);
            }

            Sort.sortArray(array);

        } else if (typeValue.equals("b")) {
            String[] array = new String[objValue.listLetters.size()];

            for(int i = 0; i < objValue.listLetters.size(); i++) {
                array[i] = objValue.listLetters.get(i);
            }

            Sort.sortArray(array);
        }

        sc.close();
    }
}