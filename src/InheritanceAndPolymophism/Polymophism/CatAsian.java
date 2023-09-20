package InheritanceAndPolymophism.Polymophism;

public class CatAsian extends Cat{
    public CatAsian(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public String getAnimalName() {
        return "Asian Cat";
    }
}
