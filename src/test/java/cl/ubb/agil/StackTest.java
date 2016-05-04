package cl.ubb.agil;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	private StackTdd st;
	@Before
	public void setup(){
		st= new StackTdd();
	}

	@Test
	public void StackEstaVacia() {
		assertEquals(true,st.isEmpty());
	}
	@Test
	public void AgrgarNumeroUnoStackNoEstaVacia() {
		st.ingresar(1);
		assertEquals(false,st.isEmpty());
	}
	@Test
	public void AgrgarNumeroUnoyDosStackNoEstaVacia() {
		st.ingresar(1);
		st.ingresar(2);
		assertEquals(false,st.isEmpty());
	}
	@Test
	public void AgrgarNumeroUnoyDosStackTamanoDos() {
		st.ingresar(1);
		st.ingresar(2);
		assertEquals(2,st.tamano());
	}
	@Test
	public void AgrgarNumeroUnoStackPopDevuelveUno() {
		st.ingresar(1);
		st.sacar(1);
		assertEquals(1,st.elementoSacado());
	}

}
