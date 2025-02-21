public class exec1
 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println("Person 1: " + person1.name + " tem " + person1.age + " ano/s de idade e tem " + person1.height + "cm de altura");
        System.out.println("Person 2: " + person2.name + " tem " + person2.age + " ano/s de idade e tem " + person2.height + "cm de altura");
        person1.name = "João";
        person1.age = 25;
        person1.setGiantHeight();
        person2.name = "Maria";
        person2.age = 30;
        person2.setDwarfHeight();
        System.out.println("Person 1: " + person1.name + " tem " + person1.age + " ano/s de idade e tem " + person1.height + "cm de altura");
        System.out.println("Person 2: " + person2.name + " tem " + person2.age + " ano/s de idade e tem " + person2.height + "cm de altura");
    }
}