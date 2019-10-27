package pattern.abs_factory;

public class AbstractFactory {
    public static void main(String[] args) {
        AbstractFactoryAnimal provider = FactoryProvider.getFactory("factory");
        Animal animal = (Animal) provider.create("Duck");
        System.out.println(animal.getAnimal());

    }
}

interface Animal {
    String getAnimal();

    String makeSound();
}

class Duck implements Animal {

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}

interface AbstractFactoryAnimal<T> {
    T create(String animalType);
}

class AnimalFactory implements AbstractFactoryAnimal<Animal> {
    @Override
    public Animal create(String animalType) {
        Animal animal = null;
        if ("Dog".equalsIgnoreCase(animalType)) {

            throw new RuntimeException("Dog is not created");
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            animal = new Duck();
        }

        return animal;
    }

}

class FactoryProvider {
    static AbstractFactoryAnimal getFactory(String choice) {
        if (!choice.equalsIgnoreCase("factory")) {
            return null;
        }
        return new AnimalFactory();
    }
}


