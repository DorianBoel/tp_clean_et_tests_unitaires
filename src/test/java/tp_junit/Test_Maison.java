package tp_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import tp_junit.immobilier.entites.Maison;
import tp_junit.immobilier.entites.Piece;
import tp_junit.immobilier.entites.SalleDeBain;
import tp_junit.immobilier.entites.WC;

public class Test_Maison {

	@Test
	public void test_constructor() {
		
		Maison instance = new Maison();
		
		assertInstanceOf(Maison.class, instance);
		assertInstanceOf(Piece[].class, instance.getPieces());
		assertTrue(instance.getPieces().length == 0);
		
	}
	
	@Test
	public void test_ajouterPiece1() {
		
		Maison maison = new Maison();
		Piece piece1 = new SalleDeBain(1, 6);
		Piece piece2 = new WC(1, 4);
		int nbPieces = maison.getPieces().length;
		
		maison.ajouterPiece(piece1);
		
		assertEquals(maison.getPieces().length, nbPieces + 1);
		assertSame(maison.getPieces()[maison.getPieces().length - 1], piece1);
		
		maison.ajouterPiece(piece2);
		
		assertEquals(maison.getPieces().length, nbPieces + 2);
		assertSame(maison.getPieces()[maison.getPieces().length - 1], piece2);
		
	}
	
	@Test
	public void test_ajouterPiece2() {
		
		Maison maison = new Maison();
		
		Executable exec = () -> maison.ajouterPiece(null);
		
		assertThrows(NullPointerException.class, exec);
		
	}
	
	@Test
	public void test_nbPieces() {
		
		Maison maison = new Maison();
		
		assertEquals(maison.nbPieces(), 0);
		
		Piece piece = new SalleDeBain(1, 6);
		maison.ajouterPiece(piece);
		
		assertEquals(maison.nbPieces(), 1);
		
	}
	
	@Test
	public void test_superficieEtage() {
		
		Maison maison = new Maison();
		
		assertEquals(maison.superficieEtage(0), 0);
		
		Piece piece1 = new SalleDeBain(1, 6);
		Piece piece2 = new WC(1, 4);
		maison.ajouterPiece(piece1);
		maison.ajouterPiece(piece2);
		
		assertEquals(maison.superficieEtage(1), 10);
		
	}
	
	@Test
	public void test_superficieTypePiece1() {
		
		Maison maison = new Maison();
		
		assertEquals(maison.superficieTypePiece(Piece.TYPE_CHAMBRE), 0);
		
		Piece piece1 = new SalleDeBain(1, 6);
		Piece piece2 = new SalleDeBain(0, 5);
		maison.ajouterPiece(piece2);
		maison.ajouterPiece(piece1);
		
		assertEquals(maison.superficieTypePiece(Piece.TYPE_SDB), 11);

		
		Piece piece3 = new WC(1, 4);
		maison.ajouterPiece(piece3);
		
		assertEquals(maison.superficieTypePiece(Piece.TYPE_WC), 4);
		
	}
	
	@Test
	public void test_superficieTypePiece2() {
		
		Maison maison = new Maison();
		
		Executable exec = () -> maison.ajouterPiece(null);
		
		assertThrows(NullPointerException.class, exec);
		
	}
	
	@Test
	public void test_calculerSurface() {
		
		Maison maison = new Maison();
		
		assertEquals(maison.calculerSurface(), 0);
		
		Piece piece1 = new SalleDeBain(1, 6);
		Piece piece2 = new SalleDeBain(0, 5);
		Piece piece3 = new WC(1, 4);
		maison.ajouterPiece(piece1);
		maison.ajouterPiece(piece2);
		maison.ajouterPiece(piece3);
		
		assertEquals(maison.calculerSurface(), 15);
		
	}
	
}
