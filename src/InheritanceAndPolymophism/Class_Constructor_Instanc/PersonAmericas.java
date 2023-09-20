package InheritanceAndPolymophism.Class_Constructor_Instanc;

public class PersonAmericas extends Person{
    private int age;
    private int height;
    public PersonAmericas(String name,int age,  int height) {
        // Gọi tới Constructor mặc định của lớp cha (Person).
        // Nhằm mục đích gán tạo giá trị cho các trường (field) của lớp cha.
        super(name);
        this.age = age;
        this.height = height;
    }
    public PersonAmericas(int age, int height) {
        super();
        this.age = age;
        this.height = height;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    // Thực hiện (implement) phương thức trừu tượng được khai báo tại lớp cha.
    @Override
    public String getPersonName() {
        return "U.S is a PersonAmericas";
    }
}

