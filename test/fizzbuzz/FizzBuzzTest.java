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

}
