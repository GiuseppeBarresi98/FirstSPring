package giuseppebarresi.u5w1d1.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bevanda extends Menu{
    public Bevanda(String name, double price) {
        super(name, price);
    }
}
