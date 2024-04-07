
public class Main {

	public static void main(String[] args) {		

	

		serviço servi1 = new serviço();

		servi1.setSalario(1000);

		servi1.atualizarValor(20);

		System.out.println("Serviço " + servi1.getSalario());

		

		

		Balconista balconista1 = new Balconista();

		balconista1.setSalario(1200);

		balconista1.atualizarValor(20);

		System.out.println("Balconista " + balconista1.getSalario());

		

		padeiro padeiro2 = new padeiro();

		padeiro2.setSalario(2000);

		padeiro2.atualizarValor(20);

		System.out.println("Padeiro " + padeiro2.getSalario());

		

		Atendente atendente3 = new Atendente();

		atendente3.setSalario(1400);

		atendente3.atualizarValor(20);

		System.out.println("Atendente " + atendente3.getSalario());

		

		RepositorPadaria repositorpadaria4 = new RepositorPadaria();

		repositorpadaria4.setSalario(1350);

		repositorpadaria4.atualizarValor(20);

		System.out.println("RepositorPadaria " + repositorpadaria4.getSalario());

		

	}

}
    
    
         
      
 
