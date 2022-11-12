
public class Main {
	public static void main(String[] args) {
		
		String infix = "A + B * (C + D ) - E / F * G + H";
		InfixAndPostfix infixToPostfix = new InfixAndPostfix(infix);
		infixToPostfix.convertToPostfix();
		infixToPostfix.showInfix();
		infixToPostfix.showPostfix();
		
		
	}

}
