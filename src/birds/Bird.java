package birds;

public class Bird {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("HONKUS PONKUS");
    }

    public void move() {
        System.out.println("Flippity flappaty");
    }

    public Bird() {

    }
}
