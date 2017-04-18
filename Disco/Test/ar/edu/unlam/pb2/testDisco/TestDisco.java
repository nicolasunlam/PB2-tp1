package ar.edu.unlam.pb2.testDisco;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.tp1Disco.Disco;

public class TestDisco {
	@Test
	public void queSeCreeUnDisco(){
		//Diametro de 8
		Disco miDisco = new Disco(0.00);
		//Ingresar Diametro
		miDisco.setDiametro(8.00);
		
		Double valorEsperado=8.00;
		Double valorObtenido=miDisco.getDiametro();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
		System.out.println("Se creó un disco de diametro: ");
		System.out.println(miDisco.getDiametro());
	}

	@Test
	public void testConocerRadioInteriorDeDiscoSegunDiametro(){
		//Diametro de 8
		Disco miDisco = new Disco(8.00);
		//Ingresar Diametro
		miDisco.setRadio(8.00);
		
		Double valorEsperado=4.00;
		Double valorObtenido=miDisco.getRadio();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
		System.out.println("Se creó un disco de radio Interior: ");
		System.out.println(miDisco.getRadio());
	}
	
	@Test
	public void testConocerSuperficieDeDiscoSegunDiametro(){
		//Diametro de 8
		Disco miDisco = new Disco(0.00);
		//Ingresar Diametro!
		miDisco.setSuperficie(8.00);
		
		Double valorEsperado=50.24;
		Double valorObtenido=miDisco.getSuperficie();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
		System.out.println("Se creó un disco con superficie de: ");
		System.out.println(miDisco.getSuperficie());
	}

	@Test
	public void testConocerPerimetroDeDiscoSegunDiametro(){
		//Diametro de 8
		Disco miDisco = new Disco(0.00);
		//Ingresar Diametro!
		miDisco.setPerimetro(8.00);
		
		Double valorEsperado=25.12;
		Double valorObtenido=miDisco.getPerimetro();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
		System.out.println("Se creó un disco con perímetro de: ");
		System.out.println(miDisco.getPerimetro());
	}
}
