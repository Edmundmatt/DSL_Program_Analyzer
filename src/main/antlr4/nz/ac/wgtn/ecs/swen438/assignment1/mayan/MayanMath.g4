
grammar MayanMath;

expression : expr EOF;
expr        : expr (addop | minusop) expr
            | '(' expr ')'
            | minusop expr
            | digit
            | number;

addop       : '+';
minusop     : '-';

//number : digit + '_' + (digit)*;
//number    : digit + ('_'digit)('_'digit)*;
number  : digit+('_'digit)+;

//digit : ZERO | ONE | TWO | THREE | FOUR |
//        FIVE | SIX | SEVEN | EIGHT | NINE |
//        TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN |
//        FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN;
//
//// Terminal expressions
//ZERO        : '0';
//ONE         : '*';
//TWO         : '**';
//THREE       : '***';
//FOUR        : '****';
//FIVE        : '|';
//SIX         : '*|';
//SEVEN       : '**|';
//EIGHT       : '***|';
//NINE        : '****|';
//TEN         : '||';
//ELEVEN      : '*||';
//TWELVE      : '**||';
//THIRTEEN    : '***||';
//FOURTEEN    : '****||';
//FIFTEEN     : '|||';
//SIXTEEN     : '*|||';
//SEVENTEEN   : '**|||';
//EIGHTEEN    : '***|||';
//NINETEEN    : '****|||';

digit       : ZERO | one | two | three | four |
            five | six | seven | eight | nine |
            ten | eleven | twelve | thirteen | fourteen |
            fifteen | sixteen | seventeen | eighteen | nineteen;

ZERO        : '0';
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