package ex4;

public class Macaco extends Animal {
private String cor;

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}



@Override
public String toString() {
	return "Classe animal:" + this.getClasseAnimal() + "\n Ordem:" + this.getOrdem() + "\n Bioma:" + this.getBioma()
	+ "\n cor:" + this.getCor(); 
}
}
