package tuan_3;

import static java.lang.reflect.Array.getLength;

public class bai_tap_2 {
}
class GHG{
    public static void main(String[] args) {
        String s = "";
        try {
            System.out.println(getLength(s));
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArggumentException caught");
        }
        s = "GeeksforGeeks";
        try {
            System.out.println(getLength(s));
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught");
        }
        s = null;
        try {
            System.out.println(getLength(s));
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught");
        }
    }

    public static int getLength (String s) {
        if (s == null)
            throw new IllegalArgumentException("the argument cannot be null");
        return s.length();
    }
}