
grammar MayanMath;

expression : 'foo' EOF ;

// Terminal expressions
zero    : '0';  // Zero
dot     : '*';  // One
bar     : '|';  // Five
newRow  : '_';  // New row - probably not a terminal expression