package ar.edu.unlam.pb2.testDisco;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.tp1Disco.Disco;

public class TestDisco {
	@Test
	public void conocerRadiosInteriorYExterior(){
		//DMayor Dmenor
		Disco miDisco = new Disco(0.00, 0.00);
		//Reciben Diámetros may y men
		miDisco.setRadioExterno(12.00, 1.50);
		miDisco.setRadioInterno(12.00, 1.50);
		
		Double valorEsperado1 = 6.00;
		Double valorObtenido1 = miDisco.getRadioExterno();
		
		Double valorEsperado2 = 0.75;
		Double valorObtenido2 = miDisco.getRadioInterno();
		
		Assert.assertEquals(valorEsperado1, valorObtenido1);
		Assert.assertEquals(valorEsperado2, valorObtenido2);
		
		System.out.println("El radio interior es : ");
		System.out.println(miDisco.getRadioInterno());
		
		System.out.println("El radio exterior es : ");
		System.out.println(miDisco.getRadioExterno());
		
		
	}

	@Test
	public void conocerPerimetrosInteriorYExterior(){
		//DMayor Dmenor
				Disco miDisco = new Disco(12.00, 1.50);
				//Reciben Diámetros may y men
				
				miDisco.setRadioExterno(12.00, 1.50);
				miDisco.setRadioInterno(12.00, 1.50);
				
				miDisco.setPerimetroExterno(miDisco.getRadioExterno());
				miDisco.setPerimetroInterno(miDisco.getRadioInterno());
				
				Double valorEsperado1=6.00;
				Double valorObtenido1=miDisco.getRadioExterno();
				Double valorEsperado2=0.75;
				Double valorObtenido2=miDisco.getRadioInterno();
				
				Assert.assertEquals(valorEsperado1, valorObtenido1);
				Assert.assertEquals(valorEsperado2, valorObtenido2);
				
				System.out.println("El perímetro exterior es : ");
				System.out.println((miDisco.getPerimetroExterno()));
				System.out.println("El perímetro interior es : ");
				System.out.println((miDisco.getPerimetroInterno()));
				
	}
	
	@Test
	public void testConocerSuperficieDeDisco(){
		
		Disco miDisco = new Disco(12.00, 1.50);
		//Reciben Diámetros may y men
		miDisco.setSuperficie(12.00, 1.50);
		Double valorEsperado=33.04;
		Double valorObtenido=miDisco.getSuperficie();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		System.out.println("La superficie total es : ");
		System.out.println((miDisco.getSuperficie()));		
		
	}

	
}
