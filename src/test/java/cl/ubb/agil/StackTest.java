package cl.ubb.agil;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class StackTest {

	@Test
	public void StackEstaVacia() {
		StackTdd st= new StackTdd();
		boolean valor=st.isEmpty();
		assertEquals(true,valor);
	}

}
