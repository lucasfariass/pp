package questao05;

public abstract class Quadrilatero implements FormasGeometrica {
	
	private double ladoA, ladoB, ladoC, ladoD;

	public Quadrilatero(double ladoA, double ladoB, double ladoC, double ladoD) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
	}
	
	@Override
	public double perimetro() {
		
		return ladoA + ladoB + ladoC + ladoD;
	}

}
