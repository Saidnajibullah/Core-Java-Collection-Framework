package efficientAndIndfficientStringConcats;

public class StringConcatenation {

	public static void main(String[] args) {
		//inefficient concatenation
		String inefficient = "I'm inefficient.";
		inefficient += " ";
		inefficient += "Because with each concatenation a new string is created in the memory";
		System.out.println(inefficient);
		
		//efficient concatenation
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		sb.append("I'm efficient.");
		sb.append(" ");
		sb.append("Because the same string is modified in the memory each time we append a new string");
		System.out.println(sb);
		
		//chaining
		
		System.out.println("Appending new string with chaining");
		sb1.append("I'm efficient.")
		.append(" ")
		.append("Because the same string is modified in the memory each time we append a new string");
		System.out.println(sb1);

	}

}
