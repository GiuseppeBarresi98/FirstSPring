package giuseppebarresi.u5w1d1.entities;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BeansConfiguration {

    @Bean
    Pizze getMargherita(){
        return new Pizze("Margherita",5, Arrays.asList(new Topping("Mozzarella",1.5),new Topping("Pomodoro",1)));
    }

    @Bean
    Bevanda getCocaCola(){
        return new Bevanda("Coca-Cola",2);
    }

    @Bean
    Pizze getHawaiianPizza(){
        return new Pizze("Hawaaiian Pizza",8.99, Arrays.asList(getMozzarella(),getAnanas()));
    }

    @Bean
    Bevanda getSprite(){
        return new Bevanda("Sprite",2);
    }

    @Bean
    Topping getMozzarella(){
        return new Topping("Mozzarella",1.5);
    }

    @Bean
    Topping getAnanas(){
        return new Topping("Ananas",3);
    }

}
