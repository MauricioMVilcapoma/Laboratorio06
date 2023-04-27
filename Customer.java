package SistemaDeVuelos;

public class Customer implements User {
	private String name;
	
	public Customer(String name) {
		this.name=name;
		
	}
	
	public void NotifyUpdate(int price) {
		System.out.println("Hola "+name+", el precio: "+price+" ha sido notificado");
	
	}

}
