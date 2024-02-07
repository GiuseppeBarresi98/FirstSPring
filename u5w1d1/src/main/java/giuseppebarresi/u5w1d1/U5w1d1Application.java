package giuseppebarresi.u5w1d1;

import giuseppebarresi.u5w1d1.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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

		Ordine ordine1 = new Ordine((Tavolo) ctx.getBean("getTavoloN1"), Arrays.asList((Pizze)ctx.getBean("getMargherita"),(Bevanda)ctx.getBean("getCocaCola")),Stato.In_corso, 2,LocalDate.now(),2.0);

		System.out.println(ordine1);
		ordine1.getElementiOrdinatiList().forEach(elemento -> System.out.println("Nome dell'elemento: " + elemento.getName()));

		System.out.println("Il prezzo del conto è : " + (ordine1.getPrezzoFinale(ordine1) + (ordine1.getPrezzoCoperto()* ordine1.getNumero_coperti())));

	}
}
