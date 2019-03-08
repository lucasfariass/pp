package questao03;

public class Ponto {
	
	private int coordX;
	private int coordY;
	
	public Ponto() {
	}
	
	public int getCoordX() {
		return coordX;
	}
	
	
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}
	
	public int getCoordY() {
		return coordY;
	}
	
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ponto other = (Ponto) obj;
		if (coordX != other.coordX)
			return false;
		if (coordY != other.coordY)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Ponto [coordX=" + coordX + ", coordY=" + coordY + "]";
	}
	

}
