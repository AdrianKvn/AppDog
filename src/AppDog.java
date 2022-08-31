import dto.Dog;

import java.util.ArrayList;

public class AppDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        ArrayList<String> colors= new ArrayList<>();
        colors.add("Blanco");
        colors.add("Negro");

        dog.setName("Goffy");
        dog.setRace("Dalmata");
        dog.setColors(colors);
        dog.setGenre("Masculino");
        dog.setSterilization(true);
        dog.setWeight(10.2f);


        dog.eat();


    }
}
