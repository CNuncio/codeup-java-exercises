package birds;

public class BirdShelterTest {
        public static void main(String[] args){
    Bird[] birds = new Bird[3];
    birds[0] = new Roadrunner();
    birds[0].setName("Roadrunner");
    birds[1] = new Duck();
    birds[1].setName("Harold");
    birds[2] = new Penguin();
    birds[2].setName("Mumble");

            BirdShelter healingWings = new BirdShelter();
            healingWings.visitShelter(birds);
//        healingWings.takieCareofBirbs(birds[2]);

    }

}
