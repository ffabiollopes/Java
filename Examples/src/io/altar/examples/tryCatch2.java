package io.altar.examples;

public class tryCatch2 {

	public static void main(String[] args) {
		try {
		switch (args[0]) {
		case "DEV":
			runDEV();
				break;
		case "TEST":
			runTEST();
				break;
		case "PROD":
			runPROD();
				break;
		default:
			System.out.println("Erro :  'DEV' 'PROD' 'TEST'");
			break;
		}
	}catch (Exception e) {
			runTEST();
	}
}
	public static void runDEV() {
		System.out.println("Config DEV");

	}
	public static void runTEST() {
		System.out.println("Config TEST");
	}
	public static void runPROD() {
		System.out.println("Config PROD");
	}

}
