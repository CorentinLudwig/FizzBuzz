package fizzbuzz;

public class FizzBuzz {
	private static final int[] numSpeciaux = {3,5};
	private static final String[] trad = {"fizz","buzz"};


	public String fizzBuzz(int num) {
		for (int i = 0; i<numSpeciaux.length; i++) {
			if(num % numSpeciaux[i] == 0) 
				return trad[i];
		}
		return Integer.toString(num);
	}

}
