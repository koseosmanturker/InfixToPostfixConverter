
public class InfixAndPostfix {
	
	private String postfix;
	private String infix;
	
	public InfixAndPostfix(String infix) {
		postfix = "";
		this.infix = infix;
	}
	
	public InfixAndPostfix() {
		postfix = "";
		infix = "A+B-C";
	}
	
	public String getInfix() {
		return infix;
	}
	
	public void showInfix() {
		System.out.println("Infix Exp: " + infix);
	}
	
	public void showPostfix() {
		System.out.println("Postfix exp: " + postfix);
	}
	
	public void convertToPostfix() {
		
		Stack<String> s = new LinkedBasedStack<String>();
		
		for(int i = 0; i < infix.length(); i++) {
			
			char ch = infix.charAt(i);
			
			if(ch == 32) {// if ch is a white space continue to next i
				continue;
			}
			
			if((ch > 64 && ch < 91) || (ch > 96 && ch < 123)) {// if ch is an operand
				postfix += ch;
			}
			else if(ch == '(') {
				s.push(ch + "");
			}
			else if(ch == ')') {
				while(!s.isEmpty() && !(s.peek().equals("(")) ) {
					postfix += s.pop();
				}
				s.pop();//pop the '('
			}
			else {// operator process
				
				if(s.isEmpty()) {
					s.push(ch + "");
					continue;
				}
				
				while( !s.isEmpty() && getPrecedence(ch + "") <= getPrecedence(s.peek())) {// pop the operator until ( and empty
					postfix += s.pop();
				}
				s.push(ch + "");
	
			}
			
		}//for end
		
		while (!s.isEmpty()) {	
			postfix += s.pop();
        }
		
		
	}// method end
	
	public static int getPrecedence(String operator) {
		
		switch(operator) {
		case "+":
		case "-":
			return 1;
		case "*":
		case "/":
			return 2;
		default:
			return 0;
		
		}

	}

}
