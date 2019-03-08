package questao02;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade, double altura, double peso, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public double calcularIMC() {
		return Math.pow((this.peso / this.altura), 2);
	}

	@Override
	public String toString() {
		double imc = this.calcularIMC();
		if (imc <= 18.5) {
			return this.nome + " abaixo do peso normal";
		} else if (18.5 < imc || imc <= 25) {
			return this.nome + " peso normal";
		} else if (25 < imc || imc <= 30) {
			return this.nome + " acima do peso normal";
		} else if (imc > 30) {
			return this.nome + " obesidade";
		}
		return "Indefinido";
	}
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("João", 21, 1.70, 60, "Masculino");
		
		System.out.println(pessoa1);
	}

}
