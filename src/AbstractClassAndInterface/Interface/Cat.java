package AbstractClassAndInterface.Interface;

public class Cat extends Animal implements CanEat, CanDrink{
    private String name;

    public Cat(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void drink() {
        System.out.println(name + "cat drink....");
    }

    @Override
    public void eat() {
        System.out.println(name + "cat eat....");
    }

    @Override
    public void back() {
        System.out.println(name + "cat back....");
    }

    @Override
    public int getVelocity() {
        return 10;
    }
}
