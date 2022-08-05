
grammar MayanMath;

expression : expr EOF ;
expr        : expr (addop | minusop) expr
            | '(' expr ')'
            | minusop expr
            | number;

addop       : '+';
minusop     : '-';

number : digit + ('_'digit)*;

digit : ZERO | ONE | TWO | THREE | FOUR |
        FIVE | SIX | SEVEN | EIGHT | NINE |
        TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN |
        FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN;

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