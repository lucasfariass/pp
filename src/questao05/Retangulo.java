package questao05;

public class Retangulo implements FormasGeometrica {
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public double perimetro() {
		return 2*altura + 2*base;
	}

	@Override
	public double area() {

		return base * altura;
	}

}
