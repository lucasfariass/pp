package questao01;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	public Retangulo() {
		
	}
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getPerimetro() {
		return (this.altura + this.altura) + (this.largura + this.largura);
	}
	
	public double getArea() {
		return this.altura * this.largura;
	}

	@Override
	public String toString() {
		return "Retangulo [largura=" + largura + ", altura=" + altura + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Retangulo other = (Retangulo) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (Double.doubleToLongBits(largura) != Double.doubleToLongBits(other.largura))
			return false;
		return true;
	}
	
	

}
