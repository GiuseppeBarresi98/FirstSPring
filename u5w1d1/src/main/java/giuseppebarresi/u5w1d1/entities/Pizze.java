package giuseppebarresi.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;


@Getter
@Setter
@ToString
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
