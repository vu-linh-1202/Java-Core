package AbstractClassAndInterface.Abstract;

// Class này thừa kế từ class trìu tượng ManualJob
// BuildHouse không được khai báo là trừu tượng.
// Vì vậy nó cần thực hiện tất cả các phương thức trừu tượng còn lại.
public class BuildHouse extends ManualJob {
    // Thực hiện phương thức trừu tượng của lớp cha.
    @Override
    public void doJob() {
        System.out.println("Build a House");
    }
}
