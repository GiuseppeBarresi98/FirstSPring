package giuseppebarresi.u5w1d1.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bevanda extends Menu{
    public Bevanda(String name, double price) {
        super(name, price);
    }
}
