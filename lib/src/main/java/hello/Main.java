/**
 * package hello to make example use "hello" grandle project.
 */
package hello;

public class Main {

	/**
	 * Main
	 */
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("joao", 25);
		Pessoa p2 = new Pessoa("maria", 22);
		Pessoa p3 = new Pessoa("Joao", 40);
		Pessoa p4 = new Pessoa("pedro", 12);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		Pessoa[] pessoas = new Pessoa[4];
		pessoas[0] = p1;
		pessoas[1] = p2;
		pessoas[2] = p3;
		pessoas[3] = p4;
		System.out.println("-list mode");
		for(Pessoa p : pessoas) {
			System.out.println("name: " + p.getNome());
			System.out.println("age: " + p.getIdade());
		}
		
	}

}

