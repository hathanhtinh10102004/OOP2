package tuan_1;

public class tao_lop_con_nguoi_va_lop_con_ke_thua {
}
class People{
    private String name;
    private boolean gender;
    private int age;

    public People(){
        this.name = "ten mac dinh";
        this.gender = false;
        this.age = 0;
    }

    public People(String name, boolean gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("nguoi an ....");
    }
    public void sleep(){
        System.out.println("dang ngu .. .");
    }
    @Override
    public String toString(){
        return "A people with name: "
                + getName()
                +", age: "
                + getAge()
                +" and gender: "
                +(isGender() ? "nam" : "nu");
    }
}
class PeoleTest {

    public static void main(String[] args){
        People people = new People();
        System.out.println(people);
        people = new People("Nguyen Van C", false, 18);
        System.out.println(people);

        people.setAge(20);
        System.out.println(people);

    }
}
class Student extends People{
    private String className;

    public Student(){
        super();
        this.className = "D101_C1K14";
    }
    public Student(String className){
        super();
        this.className = className;
    }
    public Student(String name , boolean gender , int age , String className){
        super(name, gender, age);
        this.className = className;
    }
    public String getClassName(){
        return className;
    }
    public void setClassName(String className){
        this.className = className;
    }
    public void study(){
        System.out.println("hoc ma ...");
    }
    @Override
    public String toString(){
        return "A hoc sinh co len lop:"
                + getClassName()
                + ", do la mot lop con"
                + super.toString();
    }
}
class StudenTest{
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);

        student = new Student("D101_C2K14");
        System.out.println(student);

        student = new Student("ta van A", false, 23, "IBSK1D1");
        System.out.println(student);
    }
}
class EmpLoyee extends People{
    private String enterprise;
    public EmpLoyee(){
        super();
        this.enterprise = "Codegym";
    }
    public EmpLoyee(String enterprise){
        super();
        this.enterprise = enterprise;
    }

    public EmpLoyee(String name , boolean gender , int age , String enterprise){
        super(name , gender , age);
        this.enterprise = enterprise;
    }
    public String getEnterprise(){
        return enterprise;
    }
    public void setEnterprise(String enterprise){
        this.enterprise = enterprise;
    }
    public void work(){
        System.out.println("dang lam viec.....");
    }
    @Override
    public String toString(){
        return "A employee work at: "
                + getEnterprise()
                + " ,which is a subcclass of"
                + super.toString();
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        EmpLoyee empLoyee = new EmpLoyee();
        System.out.println(empLoyee);

        empLoyee = new EmpLoyee("Ha Thanh Tinh" , true, 19 , "FPT");
        System.out.println(empLoyee);

        empLoyee.work();
        empLoyee.setEnterprise("mobile");
        System.out.println(empLoyee);
    }
}











