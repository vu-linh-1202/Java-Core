package AbstractClassAndInterface.Interface;

// Interface này định nghĩa một tiêu chuẩn
// về những thứ có khả năng di chuyển.
public interface CanMove {
    // Các phương thức trong Interface đều là trừu tượng và public.
    public abstract void run();
    // Cho dù bạn không viết rõ 'public abstract' thì java luôn hiểu là vậy.
    void back();
    // Tốc độ
    public int getVelocity();
}
