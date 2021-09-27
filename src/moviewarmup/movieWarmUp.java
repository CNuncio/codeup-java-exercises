package moviewarmup;

public class movieWarmUp {
        private String name;
        private String director;

    public movieWarmUp(String name, String director) throws IllegalArgumentException {

        if (name == null){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.director = director;
    }

    public int getName() {
        return int name;
    }

    public void setName() {
        this.name = name;
    }

    public int getDirector() {
        return director;
    }

    public void setDirector() {
        this.director = director;
    }


}

// 4. Create a class called Movie. The class should define two instance variables of type String named name and director. Add a constructor that takes two strings and sets the name and director properties based on the passed arguments. Make it so the instance variables are not accessible from outside the Movie class. Write getters and setters for the instance variables.
// Bonus: if the passed name or director arguments are null or empty, the constructor should throw an IllegalArgumentException



