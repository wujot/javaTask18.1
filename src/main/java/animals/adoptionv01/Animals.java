package animals.adoptionv01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Animals {
    private List<Animal> animals;

    @Autowired
    public Animals() {
        animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "animals=" + animals +
                '}';
    }
}
