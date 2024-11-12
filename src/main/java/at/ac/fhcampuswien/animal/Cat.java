package at.ac.fhcampuswien.animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    public void purr(){
        System.out.println(getName() + " purrs.");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
