package stack;

public class Q1 {
	public String inverter(String invert){ 
		Stack<Character> stack = new ArrayStack<>();
		for (char letra : invert.toCharArray()) {
			stack.push(letra);
		}
		char[] inversao = new char[invert.length()];
		
		int i = 0;
		while(!stack.isEmpty()){
			char recCarac = stack.pop();
			inversao[i++] = recCarac;
		}
		return new String (inversao); 
	}

}
