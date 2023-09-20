package AbstractClassAndInterface.Abstract;

public class JobDemo {
    public static void main(String[] args) {
        // Khởi tạo một đối tượng AbstractJob
        // từ Constructor của lớp JavaCoding.
        AbstractJob job = new JavaCoding();
        job.doJob();

        // Phương thức getJobName là trừu tượng trong lớp AbstractJob.
        // Nhưng nó đã được thực hiện tại một lớp con nào đó.
        // Vì vậy bạn có thể gọi nó.
        String jobName = job.getJobName();
        System.out.println("Job Name: " + jobName);

        AbstractJob job1 = new BuildHouse();
        job1.doJob();
        String jobName1 = job1.getJobName();
        System.out.println("Job Name 1: " + jobName1);
    }
}
