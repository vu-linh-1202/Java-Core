package InheritanceAndPolymophism.Polymophism;

public class PolymophismDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 3, 20);
        Cat cat1 = new CatAsian("Asian Tom", 4, 25);
        System.out.println("Animal name of cat: "+ cat.getAnimalName());
        System.out.println("Animal name of cat 1: "+ cat1.getAnimalName());
    }
}
