package giuseppebarresi.u5w1d1;

import giuseppebarresi.u5w1d1.entities.Bevanda;
import giuseppebarresi.u5w1d1.entities.Pizze;
import giuseppebarresi.u5w1d1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class U5w1d1Application {

	public static void main(String[] args) {

		SpringApplication.run(U5w1d1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d1Application.class);

		Bevanda cocaCola = (Bevanda) ctx.getBean("getCocaCola");
		Pizze margherita = (Pizze) ctx.getBean("getMargherita");
		Pizze hawaiana = (Pizze) ctx.getBean("getHawaiianPizza");
		Topping ananas = (Topping) ctx.getBean("getAnanas");
		Topping mozzarella = (Topping) ctx.getBean("getMozzarella");
		Bevanda sprite = (Bevanda) ctx.getBean("getSprite");


        List<Bevanda> listaBevande = new ArrayList<>();
		List<Pizze> listaPizze = new ArrayList<>();
		List<Topping> listaToppings = new ArrayList<>();
		listaPizze.add(margherita);
		listaPizze.add(hawaiana);
		listaToppings.add(mozzarella);
		listaToppings.add(ananas);
		listaBevande.add(sprite);
		listaBevande.add(cocaCola);


		System.out.println("Ecco il nostro menu");
		System.out.println("Le nostre pizze");
		for (Pizze pizza :listaPizze){
			System.out.println("-" + pizza.getName() + "(" + pizza.getToppingsInPizza() + ")" + " Prezzo finale: " + pizza.getPrice() + "£");
		}

		System.out.println("I nostri toppings");
		for (Topping topping : listaToppings){
			System.out.println("-"+ topping.getName() + " " + topping.getPrice()+ "£");
		}

		System.out.println("Bevande: ");
		for (Bevanda bevande : listaBevande){
			System.out.println("-"+ bevande.getName() + " " +  bevande.getPrice() + " £") ;
		}


	}



}
