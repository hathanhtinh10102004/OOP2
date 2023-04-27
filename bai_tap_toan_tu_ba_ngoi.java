package tuan_3;

public class bai_tap_toan_tu_ba_ngoi {
}
class GFG{
    public static void main(String[] args) {
        String str = null;
        String message = (str == null) ? "":
                str.substring(0,8);
        System.out.println(message);
        str = "Geeksforgeeks";
        message = (str == null) ? "" :
                str.substring(0,8);
        System.out.println(message);
    }
}
