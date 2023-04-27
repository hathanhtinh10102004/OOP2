package tuan_3;

import java.util.Scanner;

public class su_dung_nhieu_try_catch {
}
class test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scanner.nextLine());
            if (99 %n == 0)
                System.out.println(n + "is a factor of 99");
        }catch (NumberFormatException | ArithmeticException ex){
            System.out.println("Number Format Exception " + ex);
        }
    }
}
