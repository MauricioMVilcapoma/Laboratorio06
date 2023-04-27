package SistemaDeVuelos;

public class Main {
	Fligth flight= new Flight() {
		
		Customer customer= new Customer("Carlos Deus");
		
		flight.registerUser(customer);
		
		flight.setPrice("50");
	}

}
