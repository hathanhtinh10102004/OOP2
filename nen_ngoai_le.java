package tuan_3;

public class nen_ngoai_le {
}
class ThrowExcep{
    static void fun(){
        try {
            throw new NegativeArraySizeException("demo");
        }catch (NumberFormatException e){
            System.out.println("Caught inside fun().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            fun();
        }catch (NumberFormatException e){
            System.out.println("caught in main.");
        }
    }
}
