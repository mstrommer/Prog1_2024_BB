package at.ac.fhcampuswien.animal;

public abstract class Animal implements NoiseCapable{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep(){
        System.out.println(name + " sleeps.");
    }

    public void eat(){
        System.out.println(name + " eats.");
    }
}
