package giuseppebarresi.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;


@Getter
@Setter
public class Pizze extends Menu{
    List<Topping> toppings;

    public Pizze(String name, double price) {
        super(name, price);
    }

    public Pizze(String name, double price, List<Topping> toppings) {
        super(name, price);
        this.toppings = toppings;
    }

    public String getToppingsInPizza() {
        return toppings.stream()
                .map(Menu::getName)
                .collect(Collectors.joining("\n"));
    }
}
