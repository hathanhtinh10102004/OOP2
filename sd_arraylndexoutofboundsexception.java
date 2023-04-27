package tuan_3;

import java.util.Random;
import java.util.Scanner;

public class sd_arraylndexoutofboundsexception {
}
class ArrayExample{
    public Integer[] createRandom(){
        Random random = new Random();

        Integer[] arr = new Integer[100];

        System.out.println("danh sách phần tử của mảng: ");

        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("vui lòng nhập chỉ số của một phần tử bất kỳ: ");

        int x = scanner.nextInt();

        try {
            System.out.println("giá trị có phần tử có chỉ số 5" + x + "là" + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("chỉ số vượt qua giới hanj của mảng");
        }
    }
}

