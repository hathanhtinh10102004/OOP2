package tuan_1;

public class tao_lop_dong_vat_va_lop_con_ke_thua {
}
class Animal{
    private double weight;
    private double height;
     public Animal(){
         this.weight = 0.0;
         this.height = 0.0;
     }
     public Animal(double weight , double height){
         this.weight = weight;
         this.height = height;
     }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString(){
         return "A Animal with weight: "
                 +getWeight()
                 +" and "
                 + getHeight();
    }
}
class AnimalTest{
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);

        Animal animal1 = new Animal(5 , 6);
        System.out.println(animal1);

        Animal animal2 = new Animal();
        animal2.setHeight(1);
        animal2.setWeight(10);
        System.out.println(animal2);
    }
}
class Cat extends Animal{
    private double age;

    public Cat(){
        super();
        this.age = 1.0;
    }

    public Cat(double age){
        super();
        this.age = age;
    }
    public Cat(double weight , double height, double age){
        super(weight , height);
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String sound(){
        return "meo meo .....";
    }
    public String eat(){
        return "mouse !!!";
    }
    @Override
    public String toString(){
        return "A Cat with age: "
                + getAge()
                + ", which is a subclacc of"
                + super.toString();
    }
}
class CatTest{
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("---------------");
        cat.setAge(10);
        cat.setHeight(5);
        cat.setWeight(3.5);
        System.out.println(cat);
    }    
}













