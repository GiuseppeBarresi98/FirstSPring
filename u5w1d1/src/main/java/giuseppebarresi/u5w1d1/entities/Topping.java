package giuseppebarresi.u5w1d1.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Topping extends Menu {


    public Topping(String name, double price) {
        super(name, price);
    }
}
