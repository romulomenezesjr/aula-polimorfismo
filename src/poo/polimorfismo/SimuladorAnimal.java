package poo.polimorfismo;

public class SimuladorAnimal {
	public void executarSimulacao(Animal[] animais) {
		for (Animal animal : animais) {
			animal.mover();
			System.out.println(animal.getClass() + " - " + animal.getX());
		}
	}

	public static void main(String args[]) {
		Animal animais[] = new Animal[3];
		animais[0] = new Anfibio(0., 0.);
		animais[1] = new Passaro(0., 10.);
		animais[2] = new Peixe(0., 20.);
		SimuladorAnimal simulador = new SimuladorAnimal();
		for (int i = 0; i < 10; i++) {
			simulador.executarSimulacao(animais);
		}
		TelaSimulacao tela = new TelaSimulacao(animais);
		tela.inicializar();
	}
}
