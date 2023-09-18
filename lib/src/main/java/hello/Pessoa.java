/**
 * Dentro do package hello
 */
package hello;

/**
 * Its a person that have name & age
 */
public class Pessoa{
	private String nome;
	private int idade;
	
	
	/**
	 * 
	 * Constructor
	 * @param nome name
	 * @param idade age
	 */
	Pessoa(String nome,int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	/**
	 * Compare name function
	 *
	 * @param a First name compared
	 * @param b Second name compared
	 * @return True if equals in lowcase sensitive.
	 * @return True if not equals.
	 */
	public Boolean isEqual(String a, String b) {
		
		return a.toLowerCase().equals(b);
	}
	
	
	/**
	 * Better toString
	 *
	 * @return name with some conditions to make nickname 
	 */
	@Override
	public String toString() {
		String nomeshow = nome.toLowerCase();
		if(isEqual(nome,"joao")) {
			nomeshow = "joaozinho";
		}
		if(isEqual(nome,"maria")) {
			nomeshow = "mariazinha";
		}
		return "Your name is " + nomeshow + " with an age of " + idade + " years.";
		
	}

	public String getNome() {
		return nome;
	}


	public int getIdade() {
		return idade;
	}

	
}
