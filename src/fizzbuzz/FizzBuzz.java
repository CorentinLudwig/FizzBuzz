package fizzbuzz;

public class FizzBuzz {
	private static final int[] numSpeciaux = {3,5};
	private static final String[] trad = {"fizz","buzz"};
	

	public String fizzBuzz(int num) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<numSpeciaux.length; i++) {
			if(num % numSpeciaux[i] == 0) 
				sb.append(trad[i]);
		}
		if(sb.isEmpty())
			return Integer.toString(num);
		return sb.toString();
	}

}
