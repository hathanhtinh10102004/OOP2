package bai_thi;

public class bai_3 {
}
class Rectangle{
    private int toadox;
    private int toadoy;
    private int widht;
    private int height;
    private String color;
    public  Rectangle(){
        this.toadox = 0;
        this.toadoy = 0;
        this.widht = 1;
        this.height = 1;
        this.color = "mausac";
    }
    public Rectangle(int toadox , int toadoy){
        this.toadox = toadox;
        this.toadoy = toadoy;
        this.widht = 1;
        this.height = 1;
        this.color = "mausac";
    }
    public Rectangle(int toadox , int toadoy , int widht , int height){
        this.toadox = toadox;
        this.toadoy = toadoy;
        this.widht = widht;
        this.height = height;
        this.color = "mausac";
    }
    public Rectangle(int toadox , int toadoy , int widht , int height , String color){
        this.toadox = toadox;
        this.toadoy = toadoy;
        this.widht = widht;
        this.height = height;
        this.color = color;
    }

    public int getToadox() {
        return toadox;
    }

    public int getToadoy() {
        return toadoy;
    }

    public int getWidht() {
        return widht;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
    public void setToadox(int toadox){
        this.toadox = toadox;
    }
    public void setToadoy(int toadoy){
        this.toadoy = toadoy;
    }
    public void setWidht(int widht){
        this.widht = widht;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void render(){

    }
    public void calArea(){

    }
}
class AppRectangle{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("toa do x la: " + rectangle.getToadox());
        System.out.println("toa do y la: " + rectangle.getToadoy());
        System.out.println("chieu rong la: " + rectangle.getWidht());
        System.out.println("chieu dai la: " + rectangle.getHeight());
    }
}


