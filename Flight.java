package SistemaDeVuelos;
import java.util.List;
import java.util.ArrayList;

public class Flight implements User {
	private UserList<User>users;
	private String destino;
	private int price;
	private int numeroPasaporte;
	
	public Flight() {
		this.users=new ArrayList<>();
		this.destino="Florida";
		this.price="340";
		this.numeroPasaporte="1223";
	}

	public void registerUser(User user) {
		//se agregar usuarios a la lista
		users.add(user);
		
	}
	
	public void removeUser(User user) {
		//se quitan usuarios de la lista
		users.remove(user);
	}
	
	public void notifyUsers() {
		for(User user:users) {
			//se notifica el precio al usuario
			user.update(price);
		}
	}
	
	public void DataUser(int price) {
		this.price=price;
		notifyUsers();
	}
}
