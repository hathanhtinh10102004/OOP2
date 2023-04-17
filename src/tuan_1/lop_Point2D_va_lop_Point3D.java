package tuan_1;

public class lop_Point2D_va_lop_Point3D {
}
class Point2D{
    public float x;
    public float y;
    public Point2D(){
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Point2D(float x , float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x ;
        this.y = y ;
    }

    public float [] getXY() {
        float [] array = {this.x , this.y} ;
        return array;
    }
    public String toString(){
        return "x la: "
                + getX()
                +"y la: "
                + getY();
    }
}
class Point3D extends Point2D{
    public float z;
    public Point3D(){
        this.z = 0.0f;
    }
    public Point3D(float z , float x , float y){
        this.z = z;
        this.x = x;
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x ,float y , float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float [] getXYZ(){
        float [] array = {this.x , this.y , this.z};
        return array;
    }
    public String toString(){
        return "x la: "
                + getX()
                + "y la: "
                + getY()
                + "z la: "
                + getZ();
    }
}
class testhinhj{
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3,6);
        System.out.println(point2D);

        System.out.println("---------");
        Point3D point3D = new Point3D(4,5,6);
        System.out.println(point3D);
    }
}
