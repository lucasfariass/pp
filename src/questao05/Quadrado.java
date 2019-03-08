package questao05;

public class Quadrado implements FormasGeometrica {

	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}


	@Override
	public double perimetro() {
		
		return 4*lado;
	}

	@Override
	public double area() {
		return Math.pow(lado, 2);
	}
}
