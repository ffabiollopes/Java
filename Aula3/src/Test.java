import entities.Automovel;
import entities.Mota;
import repositories.AutomovelRepository;
import repositories.MotaRepository;

public class Test {

	private static MotaRepository repositorioDeMotas = new MotaRepository();
	private static AutomovelRepository repositorioDeAutomoveis = new AutomovelRepository();
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();

	}
		public static void run() {
			Mota mota1 = new Mota(2,0,"Piaggio",5,250);
			repositorioDeMotas.save(mota1);
			System.out.println(repositorioDeMotas.findById((long)0).getMarca());
			
			
			Automovel auto1 = new Automovel(4,3,"opel","fm",10);
			repositorioDeAutomoveis.save(auto1);
			String marca = repositorioDeAutomoveis.findById((long)0).getMarca();
			System.out.println(marca);
	
			
		}
}
