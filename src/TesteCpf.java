
public class TesteCpf {
	 public static void main(String[] args) {
		Cliente clie = new Cliente();
		clie.cpf = "41474989811";
		
		if (clie.ehccpfValido()) {
			System.out.println(true);
			
		}
		else {
			System.out.println(false);
		}
	}
	
	

}
