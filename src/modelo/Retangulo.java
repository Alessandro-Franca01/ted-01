package modelo;

public class Retangulo {
	private float altura;
	private float base;
	
	public Retangulo() {	
	}
	
	public Retangulo(float base, float altura) {
		this.altura = altura;
		this.base = base;
	}
	
	public double calcArea() {
		double area;
		area = this.base* this.altura;
		return area;
	}
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}
	
	
}
