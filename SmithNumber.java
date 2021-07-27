package School;

import java.util.Scanner;

public class SmithNumber {
    
    static boolean isPrime(int n) {
        if(n == 1) return false;
        
        int factors = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) factors++;
        }
        
        return factors <= 2;
    }
    
    static int sumDigitsPrimeFactorisation(int n) {
        int sum = 0;
        int primes[] = fillWithPrime(n/2);
        int i = 0;
        
        while(n > 1) {
            if(n % primes[i] == 0) {
                sum += sumOfDigits(primes[i]);
                n = n/primes[i];
            } else {
                i++;
            }
        }
        return sum;
    }
    
    static int[] fillWithPrime(int size) {
        int arr[] = new int[size];
        int n = 2;
        
        for(int i = 0; i < size; i++) {
            while(!isPrime(n)) 
                n++;
            
            arr[i] = n++;
        }
        return arr;
    }
   
    static int sumOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n = n/10;
        }
        return sum;
    }
    
    static boolean isSmith(int n) {
        if(isPrime(n))
            return false;
        
        return sumOfDigits(n) == sumDigitsPrimeFactorisation(n);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Smith number: "+isSmith(n));
    }
}
