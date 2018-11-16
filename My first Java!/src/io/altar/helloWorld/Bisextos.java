package io.altar.helloWorld;

public class Bisextos {

	private int ano;


public Bisextos(int ano) {
	this.ano = ano;
}


public int getAno() {
	return ano;
}

public void setAno(int ano) {
	this.ano = ano;
}


public static boolean isBisexto(int ano) {
	
	if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 !=0)) {
		
		return true;	
	}
	
	else {
		return false;
	}
}

}

