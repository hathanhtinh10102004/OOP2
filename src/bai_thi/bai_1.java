package bai_thi;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        if (number >= 2){
            for (int i = 2; i < number ; i++) {
                if (number %i == 0){
                    return false;
                }

            }
        }
        return true;
    }
}
