package AbstractClassAndInterface.Abstract;

/* Do kế thừa từ lớp cha (AbstractJob) nên nó sẽ thực hiện
*  hết các phương thức trừu tượng của lớp cha*/
public class JavaCoding extends AbstractJob {

    public JavaCoding(){}
    // Thực hiện phương thức trừu tượng khai báo tại lớp cha.
    @Override
    public String getJobName() {
        return "Coding Java";
    }
    // Thực hiện phương thức trừu tượng khai báo tại lớp cha.
    @Override
    public void doJob() {
        System.out.println("Coding Java");
    }
}
