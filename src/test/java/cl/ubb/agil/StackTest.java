package cl.ubb.agil;

import static org.junit.Assert.*;


import org.junit.Test;

public class StackTest {

	@Test
	public void StackEstaVacia() {
		StackTdd st= new StackTdd();
		boolean valor=st.isEmpty();
		assertEquals(true,valor);
	}
	@Test
	public void AgrgarNumeroUnoStackNoEstaVacia() {
		StackTdd st= new StackTdd();
		st.ingresar(1);
		boolean valor=st.isEmpty();
		assertEquals(false,valor);
	}
	@Test
	public void AgrgarNumeroUnoyDosStackNoEstaVacia() {
		StackTdd st= new StackTdd();
		st.ingresar(1);
		st.ingresar(2);
		boolean valor=st.isEmpty();
		assertEquals(false,valor);
	}

}
