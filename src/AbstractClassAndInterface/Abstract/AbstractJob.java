package AbstractClassAndInterface.Abstract;

// Một lớp trừu tượng ( mô phỏng công việc )
public abstract class AbstractJob {
    public AbstractJob(){}

    // đây là phương thức trừu tượng
    // Method này trả về tên của công việc
    public  abstract String getJobName();

    // Đây là một phương thức trừu tượng
    public abstract void doJob();
}
