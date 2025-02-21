public class Switch {
    private Boolean state = false;

    public Boolean getState() {
        return state;
    }

    public void printState() {
        if (state) {
            System.out.println("A luz está acesa");
        } else {
            System.out.println("A luz está apagada");
        }
    }

    public void toggle() {
        state = !state;

        System.out.println("Apertei o interruptor");
    }
}
