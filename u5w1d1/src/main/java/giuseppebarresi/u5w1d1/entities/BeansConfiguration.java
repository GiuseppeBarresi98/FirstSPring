package giuseppebarresi.u5w1d1.entities;


import giuseppebarresi.u5w1d1.StatoTavolo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

    @Bean
    @Primary
    Tavolo getTavoloN1(){ return new Tavolo(4,1, StatoTavolo.Libero);}

    @Bean
    Tavolo getTavoloN2(){ return new Tavolo(4,2, StatoTavolo.Libero);}

    @Bean
    Tavolo getTavoloN3(){ return new Tavolo(10,3, StatoTavolo.Libero);}
}
