
grammar MayanMath;

expression : expr EOF ;
expr        : expr (addop | minusop) expr
            | '(' expr ')'
            | minusop expr
            | NUMBER;

addop       : '+';
minusop     : '-';

DIGIT : ZERO | ONE | TWO | THREE | FOUR |
        FIVE | SIX | SEVEN | EIGHT | NINE |
        TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN |
        FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN;

NUMBER : DIGIT + ('_'DIGIT)*;

// Terminal expressions
ZERO        : '0';
ONE         : '*';
TWO         : '**';
THREE       : '***';
FOUR        : '****';
FIVE        : '|';
SIX         : '*|';
SEVEN       : '**|';
EIGHT       : '***|';
NINE        : '****|';
TEN         : '||';
ELEVEN      : '*||';
TWELVE      : '**||';
THIRTEEN    : '***||';
FOURTEEN    : '****||';
FIFTEEN     : '|||';
SIXTEEN     : '*|||';
SEVENTEEN   : '**|||';
EIGHTEEN    : '***|||';
NINETEEN    : '****|||';

// Whitespace - skip
WS          : [\t\n\r]+ -> skip;