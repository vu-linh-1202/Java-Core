package AbstractClassAndInterface.Interface;

public class DemoInterface {
    public static void main(String[] args) {
        // kế thừa trường tĩnh từ interface CanDrink
        System.out.println("Drink" + Cat.SEVEN_UP);

        // Khởi tạo một đối tượng CanEat.
        // Một đối tượng khai báo là CanEat.
        // Nhưng thực tế là Cat.
        CanEat canEat = new Cat("Tom");
        // Tính đa hình (Polymorphism) thể hiện rõ tại đây.
        // Java luôn biết một đối tượng là kiểu gì
        // ==> Tom cat eat ...
        canEat.eat();
    }
}
