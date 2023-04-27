package tuan_3;

public class ngoai_le_do_nguoi_dung_dinh_nghia {
}
class MyException extends Exception{
    public MyException (String s){
        super(s);
    }
}
class mani{
    public static void main(String[] args) {
        try {
            throw new MyException("GeeksGeeks");
        }catch (MyException ex){
            System.out.println("Caught");

            System.out.println(ex.getMessage());
        }
        
    }
}


