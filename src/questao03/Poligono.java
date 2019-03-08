package questao03;

import java.util.ArrayList;

public class Poligono {

	private ArrayList<Ponto> pontos;
	
	public Poligono() {
		this.pontos = new ArrayList<Ponto>();
	}
	
	public void addPonto(Ponto ponto) {
		this.pontos.add(ponto);
	}
	
	public void addPonto(int index, Ponto ponto) {
		this.pontos.add(index, ponto);
	}
	
	public void removerPonto(Ponto ponto) {
		this.pontos.remove(ponto);
	}
	
	public void removerPonto(int index) {
		this.pontos.remove(index);
	}
	
	public double areaPoligono() {
		double somaLados = 0;

		for (int i = 0; i < this.pontos.size(); i++) {

			if (i == pontos.size() - 1) {
				somaLados += (this.pontos.get(i).getCoordX() * this.pontos.get(0).getCoordY()
						- this.pontos.get(0).getCoordX() * this.pontos.get(i).getCoordY());
			}else {
				somaLados += (this.pontos.get(i).getCoordX() * this.pontos.get(i + 1).getCoordY()
						- this.pontos.get(i + 1).getCoordX() * this.pontos.get(i).getCoordY());				
			}
		}

		return somaLados / 2;
	}

	@Override
	public String toString() {
		return "Poligono [pontos=" + pontos + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poligono other = (Poligono) obj;
		if (pontos == null) {
			if (other.pontos != null)
				return false;
		} else if (!pontos.equals(other.pontos))
			return false;
		return true;
	}
	
	
}
