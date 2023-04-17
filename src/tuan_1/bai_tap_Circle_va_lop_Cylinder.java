package tuan_1;

public class bai_tap_Circle_va_lop_Cylinder {
}
class Hinhtron{
    public double bankinh;
    public String mausac;
    public Hinhtron(){
        this.bankinh = 2;
        this.mausac = "mau hong";
    }
    public Hinhtron(int bankinh, String mausac){
        this.bankinh = bankinh;
        this.mausac = mausac;
    }

    public double getBankinh() {
        return bankinh;
    }

    public String getMausac() {
        return mausac;
    }

    public void setBankinh(int bankinh) {
        this.bankinh = bankinh;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }
    public double Tinhdientich(){
        return bankinh * bankinh * Math.PI ;
    }
    public double Tinhchuvi(){
        return 2 * Math.PI * bankinh;
    }

    @Override
    public String toString() {
        return "mausac: "
                +getMausac()
                +"bankinh: "
                +getBankinh();
    }
}
class Hinhtru extends Hinhtron{
    public double chieucao = 0;
    public Hinhtru(){
    }
    public Hinhtru(double chieucao){
        super();
        this.chieucao = chieucao;
    }


    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    public Hinhtru(double chieucao, int bankinh, String mausac){
        super(bankinh, mausac);
        this.chieucao = chieucao;

    }
    public double tinhthetich(){
        return chieucao * Tinhdientich();
    }
    @Override
    public String toString(){
        return super.toString()
                +"chieucao: "
                + getChieucao();
    }

}
class testhinh{
    public static void main(String[] args) {
        Hinhtru hinhtru = new Hinhtru(2,1,"pink, ");
        System.out.println(hinhtru.tinhthetich());
        System.out.println(hinhtru.Tinhdientich());
        System.out.println(hinhtru);
    }
}
