package vehiculars;

public class Pickup extends vehicle {
        public void makeNoise(){
            System.out.println(this.getName() + " goes phttt phttt");
        }

        public void breakingDownNoise(){
            super.makeNoise();
            System.out.println("phttt phttt");
            System.out.println(" ... crakety crack");
        }
    }

