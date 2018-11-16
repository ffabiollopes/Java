package io.altar.helloWorld;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Veiculo veiculo1 = new Veiculo(3,0,"Piaggio",false);
		System.out.println("Rodas: " + veiculo1.getRodas());
		veiculo1.setRodas(5);
		System.out.println("Rodas: " + veiculo1.getRodas());
		veiculo1.setMarca("yamaha");
		System.out.println("Rodas: " + veiculo1.getMarca());
		veiculo1.setPortas(2);
		System.out.println("Portas: " + veiculo1.getPortas());
		veiculo1.setAvariado(true);
		System.out.println("Rodas: " + veiculo1.isAvariado());
		
		Bisextos bisextos = new Bisextos(2012);
		Scanner sc= new Scanner(System.in);
		bisextos.setAno(sc.nextInt());
		sc.close();
		

		System.out.println(bisextos.isBisexto(bisextos.getAno()));
		
	}
	
	
}

