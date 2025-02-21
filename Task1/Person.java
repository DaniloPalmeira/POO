public class Person {

    public String name; // Person's name
    public int age; // Person's age
    public double height; // Person's height

    public Person() {
        name = "Indigente";
        age = 0;
        height = 0;
    }

    public void setDwarfHeight() {
        height = 1.47;
    }

    public void setGiantHeight() {
        height = 2.10;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}