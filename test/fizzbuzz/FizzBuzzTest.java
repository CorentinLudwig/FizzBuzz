package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	private FizzBuzz fb;
	
	
	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	void fizzbuzz_repond1_pour1() {
		assertEquals("1",fb.fizzBuzz(1) );
	}
	
	@Test
	void fizzbuzz_repond2_pour2() {
		assertEquals("2",fb.fizzBuzz(2) );
	}

	@Test
	void fizzbuzz_repond3_pour3() {
		assertEquals("fizz",fb.fizzBuzz(3) );
	}

	@Test
	void fizzbuzz_repond_un_entier() {
		assertEquals("4",fb.fizzBuzz(4) );
		assertEquals("7",fb.fizzBuzz(7) );
		assertEquals("13",fb.fizzBuzz(13) );
	}

	@Test
	void fizzbuzz_repond_buzz() {
		assertEquals("buzz",fb.fizzBuzz(5) );		
		assertEquals("buzz",fb.fizzBuzz(400) );

	}
	
	@Test
	void fizzbuzz_repond_fizz_pour_6() {
		assertEquals("fizz",fb.fizzBuzz(6) );
	}
	
	@Test
	void fizzbuzz_repond_fizzbuzz() {
		assertEquals("fizzbuzz",fb.fizzBuzz(15) );
	}
}
