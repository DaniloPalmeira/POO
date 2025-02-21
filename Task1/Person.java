public class Person {

    public String name = "Indigente"; // Person's name
    public int age = 0; // Person's age
    public double height = 0; // Person's height

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