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

!!!You may assume that the expressions you will process are error free.
