package at.ac.fhcampuswien.animal;

public class PetShop implements iPetShop{
    private NoiseCapable[] animals;

    public PetShop(NoiseCapable[] animals){
        this.animals = animals;
    }

    public static void main(String[] args) {
        Dog pluto = new Dog("Pluto");

        Cat garfield = new Cat("Garfield");
        Animal someAnimal = pluto;
        NoiseCapable nc = pluto;
        nc = someAnimal;
        Object o1 = someAnimal;
        //((Cat)o1).purr(); // ERROR -> ClassCastException
        nc.makeNoise();
        o1.toString();
        if(o1 instanceof NoiseCapable){
            ((NoiseCapable) o1).makeNoise();
        }
        someAnimal.eat();
        pluto.bark();
        System.out.println();
        NoiseCapable [] animals = {pluto, garfield, someAnimal, nc};
        PetShop ps = new PetShop(animals);
        for (NoiseCapable animal : animals) {
            animal.makeNoise();
        }
        System.out.println(animals.length);
        for (int i = 0; i < animals.length; i++) {
            animals[i] = null;
        }
        for (NoiseCapable animal : animals) {
            System.out.println(animal);
        }
    }

    @Override
    public Animal buy(Animal preferred) throws ArrayIndexOutOfBoundsException {
        if(preferred instanceof Dog) {
            return new Dog();
        } else if(preferred instanceof Cat){
            return new Cat();
        } else {
            return new Dog();
        }
    }
}
