package tuan_3;

import java.util.Scanner;

public class bai_tap_lllegaltriangleexception {
}

class  IllegalTriangleException extends Exception {
    public IllegalTriangleException(String a) {
        super(a);
    }
}
class CheckTriangle  {
    private int a;
    private int b;
    private int c;
   public static void CheckException(int a , int b , int c) throws IllegalTriangleException{
       if (a < 0 || b < 0 || c < 0){
           throw new IllegalTriangleException("các cạnh không được âm");
       }
       if (a + b <= 0 && a + c <= 0 && b + c <= 0){
           throw new IllegalTriangleException("2 cạnh phải lớn hơn cạnh còn lại");
       }
   }
//   public int gePerimeter(){
//     return this.a + this.b + this.c;
//   }


    public static void main(String[] args) {
//       CheckTriangle checkTriangle = new CheckTriangle();
//        System.out.println(checkTriangle.gePerimeter());
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biến a : ");
        int a = scanner.nextInt();
        System.out.println("Nhập biến b : ");
        int b =scanner.nextInt();
        System.out.println("Nhập biến c : ");
        int c = scanner.nextInt();
        try {
            CheckException(a,b,c);
            System.out.println("tam giác hơp lệ");
        }catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("Ngoại lệ  " +ex.getMessage());
        }

    }
}
