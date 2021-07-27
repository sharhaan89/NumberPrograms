package ComputerProjectClass11;

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

ALGORITHM:
1. Start
2. Create a function isLuckyNumber(int n) to check if lucky number or not
3. Store numbers from 1 to n in an array int numbers[]
4. Store copy of number n in c
5. Create int variable del with initial value = 1
6. Create a while loop with condition del < n
7. Make an inner for loop from i = del to i < n and i += del
8. Make a second-inner for loop from j = i to j < n - 1 and j++, at each iteration numbers[j] = numbers[j+1]
9. Decrement n by 1 at the first for-loop ending
10. Increment del by 1 at the while-loop ending
11.Run a for-loop from i = 0 to i < n and check if given number is present in the array, using the c variable
   and return true if found
12.Lastly, return false.
13.In the main method, create a Scanner object and take number input in n and check for lucky number using
   isLuckyNumber(int n)
14.Print the message respectively according to the output of the method.
15.End

VARIABLE DESCRIPTION TABLE:
╔═══════════════╦══════╦════════════════════════════════════════╗
║ Variable name ║ Type ║ Function                               ║
╠═══════════════╬══════╬════════════════════════════════════════╣
║ n             ║ int  ║ Store the number                       ║
╠═══════════════╬══════╬════════════════════════════════════════╣
║ c             ║ int  ║ Store the copy of n in c               ║
╠═══════════════╬══════╬════════════════════════════════════════╣
║ numbers[]     ║ int  ║ Store the numbers from 1 to n          ║
╠═══════════════╬══════╬════════════════════════════════════════╣
║ del           ║ int  ║ Store the index of deletion from array ║
╠═══════════════╬══════╬════════════════════════════════════════╣
║ i             ║ int  ║ Used in outer for-loop                 ║
╠═══════════════╬══════╬════════════════════════════════════════╣
║ j             ║ int  ║ Used in inner for-loop                 ║
╚═══════════════╩══════╩════════════════════════════════════════╝
*/