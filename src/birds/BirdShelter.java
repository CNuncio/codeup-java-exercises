package birds;
//polymorphic array
public class BirdShelter {

public void visitShelter(Bird[] alltheBirdsinDaClub){
    for (Bird bird : alltheBirdsinDaClub) {
        System.out.println(bird.getName() + " goes ");
        bird.makeNoise();
    }

//    public void birdInjured(Bird injuredBird) {
//        injuredBird.makeNoise();
//    }
}
}
