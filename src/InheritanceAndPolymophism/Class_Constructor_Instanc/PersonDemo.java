package InheritanceAndPolymophism.Class_Constructor_Instanc;

import java.util.Random;

public class PersonDemo {

    public static Person getRandomPerson()
    {
        // return random value 0 or 1
        int random = new Random().nextInt(2);
        Person p = null;
        if (random == 0)
        {
            p = new PersonAsia("Vu Trong Linh", 24, 165);
        }
        else
        {
            p = new PersonAmericas("Thomas", 23, 175);
        }
        return p;
    }
    public static void main(String[] args) {

        Person person = getRandomPerson();

        if (person instanceof PersonAsia)
        {
            // Ép kiểu đối tượng person thành kiểu PersonAsia
            PersonAsia personAsia = (PersonAsia) person;
            System.out.println("Height: "+ personAsia.getHeight());
        }
        else if(person instanceof  PersonAmericas)
        {
            // Ép kiểu đối tượng person thành kiểu PersonAmericas
            PersonAmericas personAmericas= (PersonAmericas) person;
            System.out.println("Height: " + personAmericas.getHeight());
        }
    }
}
