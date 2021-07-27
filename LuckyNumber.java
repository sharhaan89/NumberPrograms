import java.util.Scanner;

public class LuckyNumber {
    
    static boolean isLuckyNumber(int n) {
        int numbers[] = new int[n]; //storing numbers in array
        int c = n; //copy of number
         
        //filling the array with numbers from 1 to n
        for(int i = 0; i < n; i++) { 
            numbers[i] = i + 1;
        }
 
        int del = 1;
        
        //deletion of numbers to extract out lucky numbers
        while(del < n) {
            for(int i = del; i < n; i += del) {
                for(int j = i; j < n - 1; j++) {
                    numbers[j] = numbers[j+1];
                }
                n--;
            }
            del++;
        } //end of while loop
        
        //checking if given number present in lucky number array
        for(int i = 0; i < n; i++) {
            if(numbers[i] == c) return true;  
        }
        
        return false; //return false when not found
    }
    
    public static void main(String args[]) {
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        
        if(isLuckyNumber(n)) 
            System.out.println(n+" is a Lucky number.");
        else 
            System.out.println(n+" is not a Lucky number.");
    } //end of main
} //end of class
/*
OUTPUT:
Enter a number: 
7
7 is a Lucky number.
