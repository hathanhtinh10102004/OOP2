package tuan_1;

public class tao_lop_dt_va_lop_con_ke_thua {
}
class Mobile{
    public void downloadApp(){
    }
}
class Iphone extends Mobile{
    @Override
    public void downloadApp(){
        System.out.println("Tải xuống từ Appstore");
    }
}
class Nokia extends Mobile{
    @Override
    public void downloadApp(){
        System.out.println("Tải xuống từ CHPlay");
    }
}
class AndroidTest{
    public static void main(String[] args) {
        Nokia nokia = new Nokia();
        Iphone iphone = new Iphone();

        nokia.downloadApp();

        iphone.downloadApp();
    }
}
