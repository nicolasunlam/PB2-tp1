package ar.edu.unlam.pb2.tp1Disco;

public class Disco {
	private Double diametro;
	private Double radio;
	private Double superficie;
	private Double perimetro;
	

	public Double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(Double diametro) {
		this.perimetro = 2*3.14*(diametro/2);
	}

	public Disco(Double diametro){
		this.diametro=diametro;
		}

	public Double getDiametro() {
		return diametro;
	}

	public void setDiametro(Double diametro) {
		this.diametro = diametro;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double diametro) {
		this.radio = diametro/2;
	}

	public Double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Double diametro) {
		this.superficie = 3.14*(diametro/2)*(diametro/2);
	}

	

		
		
		
	}//Debe tener operaciones para cambiar el radio exterior.
	
	
	
