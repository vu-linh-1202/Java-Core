package InheritanceAndPolymophism.Class_Constructor_Instanc;

/*
* Class có ít nhất 1 phương thức trừu tượng
* Bắt buộc phải được khai báo là trừu tượng*/
public abstract class Person{
    private  String name;

    public Person(String name) {
        this.name = name;
    }
    public Person() {
        // Gán giá trị mặc định có name
        this.name = getPersonName();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Đây là một phương thức trừu tượng.
    // Nội dung cụ thể của phương thức này
    // sẽ được thực hiện (implemented) tại các lớp con.
    public abstract String getPersonName();
}
