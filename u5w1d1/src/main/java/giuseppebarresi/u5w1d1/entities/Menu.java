package giuseppebarresi.u5w1d1.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public  abstract class Menu {
    private String name;
    private double price;

    public Menu(String name,double price) {
        this.name = name;
        this.price = price;
    }
}
