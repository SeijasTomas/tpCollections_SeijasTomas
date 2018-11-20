package ar.edu.unlam.collections;

public class Rectangulo implements Figura , Comparable<Rectangulo> {


	    private Double lado1;
	    private Double lado2;
	  
	    public Rectangulo(Double lado1, Double lado2){

	        this.lado1 = lado1;
	        this.lado2 = lado2;
	    }

	    public Double calcularArea(){

	        return lado2 * lado1;
	    }

	    public Double calcularPerimetro(){

	        return this.lado2 * 2 + this.lado1 * 2;
	    }

	    public Double diferenciaArea(Rectangulo rectangulo){

	        return this.calcularArea() - rectangulo.calcularArea();
	    }
	    public Double getLado1() {
			return lado1;
		}
	    public Double getLado2() {
			return lado2;
		}
		@Override
		public int compareTo(Rectangulo r1) {
			return this.calcularPerimetro().compareTo(r1.calcularPerimetro());
			}
}
