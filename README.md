# InfixToPostfixConverter
The rules to convert infx into pfx are as follows: <br/>
⦁	Initialize pfx to an empty expression and also initialize the stack. <br/>
⦁	While there are symbols in the infx expression, Get the next symbol, sym, from infx. <br/>
⦁	If sym is an operand, append sym to pfx. <br/>
⦁	If sym is (, push sym into the stack. <br/>
⦁	If sym is ), pop and append all the symbols from the stack until the most recent left parenthesis. Pop and discard the left parenthesis. <br/>
⦁	If sym is an operator: <br/>
⦁	If s is not empty ,Pop and append all the operators from the stack to pfx that are above the most recent left parenthesis and have precedence greater than or equal to sym. <br/>
⦁	Push sym onto the stack. <br/>
⦁	After processing infx, some operators might be left in the stack. Pop and append to pfx everything from the stack. <br/>

!!!You may assume that the expressions you will process are error free.
