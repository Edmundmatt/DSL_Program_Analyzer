
grammar MayanMath;

expression : expr EOF;
expr        : expr (addop | minusop | underscore) expr
            | openbracket expr closebracket
            | minusop expr
            | number;

addop       : '+';
minusop     : '-';
underscore  : '_';
openbracket : '(';
closebracket: ')';

number  : digit ('_'digit)*;


digit       : zero | one | two | three | four |
            five | six | seven | eight | nine |
            ten | eleven | twelve | thirteen | fourteen |
            fifteen | sixteen | seventeen | eighteen | nineteen;

zero        : '0';
one         : DOT;
two         : DOT DOT;
three       : DOT DOT DOT;
four        : DOT DOT DOT DOT;
five        : PIPE;
six         : DOT PIPE;
seven       : DOT DOT PIPE;
eight       : DOT DOT DOT PIPE;
nine        : DOT DOT DOT DOT PIPE;
ten         : PIPE PIPE;
eleven      : DOT PIPE PIPE;
twelve      : DOT DOT PIPE PIPE;
thirteen    : DOT DOT DOT PIPE PIPE;
fourteen    : DOT DOT DOT DOT PIPE PIPE;
fifteen     : PIPE PIPE PIPE;
sixteen     : DOT PIPE PIPE PIPE;
seventeen   : DOT DOT PIPE PIPE PIPE;
eighteen    : DOT DOT DOT PIPE PIPE PIPE;
nineteen    : DOT DOT DOT DOT PIPE PIPE PIPE;

DOT         : '*';
PIPE        : '|';

// Whitespace - skip
WS          : [\t\n\r]+ -> skip;