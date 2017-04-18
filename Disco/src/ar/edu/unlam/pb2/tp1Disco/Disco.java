package ar.edu.unlam.pb2.disco;

public class Disco {
	private Double diametroMayor;
	private Double diametroMenor;
	private Double radioExterno;
	private Double radioInterno;
	private Double superficie;
	private Double perimetroExterno;
	private Double perimetroInterno;

	public Disco(Double diametroMayor, Double diametroMenor) {
		this.diametroMayor = diametroMayor;
		this.diametroMenor = diametroMenor;
	}

	public Double getPerimetroExterno() {
		return perimetroExterno;
	}

	public void setPerimetroExterno(Double perimetroExterno) {
		this.perimetroExterno = 2 * 3.14 * radioExterno;
	}

	public Double getPerimetroInterno() {
		return perimetroInterno;
	}

	public void setPerimetroInterno(Double perimetroInterno) {
		this.perimetroInterno = 2 * 3.14 * radioInterno;
	}

	public Double getDiametroMayor() {
		return diametroMayor;
	}

	public void setDiametroMayor(Double diametroMayor) {
		this.diametroMayor = diametroMayor;
	}

	public Double getDiametroMenor() {
		return diametroMenor;
	}

	public void setDiametroMenor(Double diametroMenor) {
		this.diametroMenor = diametroMenor;
	}

	public Double getRadioExterno() {
		return radioExterno;
	}

	public void setRadioExterno(Double diametroMayor, Double diametroMenor) {
		this.radioExterno = (diametroMayor + diametroMenor) / 2;
	}

	public Double getRadioInterno() {
		return radioInterno;
	}

	public void setRadioInterno(Double diametroMayor, Double diametroMenor) {
		this.radioInterno = (diametroMayor - diametroMenor) / 2;
	}

	public Double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Double diametroMayor, Double diametroMenor) {
		this.superficie = 3.14 * ((diametroMayor + diametroMenor) * (diametroMayor + diametroMenor));
	}

}
