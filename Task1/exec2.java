public class exec2 {
    public static void main(String[] args) {
        // vamos usar switch1 pelo fato de que switch é uma palavra reservada
        Switch switch1 = new Switch();
        System.out.println("Estado inicial do interruptor:");
        switch1.printState();
        switch1.toggle();
        switch1.printState();
        switch1.toggle();
        switch1.printState();
    }
}
