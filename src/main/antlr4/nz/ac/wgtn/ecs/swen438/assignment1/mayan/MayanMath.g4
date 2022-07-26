
grammar MayanMath;

//expression : 'foo' EOF ;
start       : expr EOF;
expr        : expr (addop | minusop | underscore) expr
            | '(' expr ')'
            | minusop expr
            | units;

addop       : '+';
minusop     : '-';
underscore  : '_';
//units       : zero | (one)* ((one)* | (five)*) | (five)*;
units       : zero | one ((one)* | (five)*) | five (five)*;

// Terminal expressions
zero        : '0';
one         : '*';
five        : '|';

// Whitespace - skip
WS          : [\t\n\r]+ -> skip;