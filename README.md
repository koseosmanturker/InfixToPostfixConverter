# InfixToPostfixConverter
The rules to convert infx into pfx are as follows:
⦁	Initialize pfx to an empty expression and also initialize the stack.
⦁	While there are symbols in the infx expression, Get the next symbol, sym, from infx.
⦁	If sym is an operand, append sym to pfx.
⦁	If sym is (, push sym into the stack.
⦁	If sym is ), pop and append all the symbols from the stack until the most recent left parenthesis. Pop and discard the left parenthesis.
⦁	If sym is an operator:
⦁	If s is not empty ,Pop and append all the operators from the stack to pfx that are above the most recent left parenthesis and have precedence greater than or equal to sym.
⦁	Push sym onto the stack.
⦁	After processing infx, some operators might be left in the stack. Pop and append to pfx everything from the stack.
In this program, you will consider the (binary) arithmetic operators: +, -, *, and /, operands are single letters. In valid infix expression operands and operators are delimited with one or more white space.
You may assume that the expressions you will process are error free.
Design a class that stores the infix and postfix strings. The class must include the following operations:
-infix: string
-postfix: string
+getInfix—Stores the infix expression
+showInfix—Outputs the infix expression
+showPostfix—Outputs the postfix expression
Some other operations that you might need are the following:
+convertToPostfix—Converts the infix expression into a postfix expression. The resulting postfix expression is stored in pfx. 
-precedence—Determines the precedence between two operators. If the first operator is higher or equal precedence than the second operator, it returns the value true; otherwise, it returns the value false. 
Include the constructors and destructors for automatic initialization and dynamic memory deallocation.
