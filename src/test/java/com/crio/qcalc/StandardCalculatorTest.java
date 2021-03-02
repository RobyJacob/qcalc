package com.crio.qcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class StandardCalculatorTest {

	@Test
	void testAdd() {
		StandardCalculator calc = new StandardCalculator();
		calc.add(1, 1);
		assertEquals(2, calc.getResult());
	}

	@Test
	void testResult() {
		StandardCalculator calc = new StandardCalculator();
		calc.add(2, 2);
		calc.subtract(1, 1);
		assertEquals(0, calc.getResult());
	}

	@Test
	void testAdditionOverflow() {
		StandardCalculator calc = new StandardCalculator();
		assertThrows(ArithmeticException.class, new Executable(){
			@Override
			public void execute() throws Throwable {
				calc.add(Integer.MAX_VALUE, 1);
			}
		});
	}

	@Test
	void testSubtractionUnderflow() {
		StandardCalculator calc = new StandardCalculator();
		assertThrows(ArithmeticException.class, new Executable(){
			@Override
			public void execute() throws Throwable {
				calc.subtract(Integer.MIN_VALUE, 1);
			}
		});
	}

}

