grammar TimeTable;

specification:
    'Specification' COLON ID LBRACE resource (schedule)* RBRACE; //start rule: A specification for the cs department / college etc

resource:
    'Struct' COLON ID LBRACE (resource_declaration)* RBRACE ; // resources are  decalred here 

resource_declaration:
    (ID EQUAL) ? list ('as' ID) ? //make a list of resources eg. studnet names, locations, times etc
    |ID EQUAL concat ('as' ID) // add resources together to make a bigger list eg. post + under = all demonstrators 
    |(ID EQUAL) ? LBRACK (relation RARROW relation COMMA)* relation RARROW relation RBRACK //relations between modules and location etc
    |component_decl RARROW ID
    ;

relation:
    LBRACK STRING RBRACK
    |component_decl
    |(LBRACE (STRING COMMA)* STRING RBRACE)
    |(LBRACE (component_decl COMMA)* component_decl RBRACE)
    ;

list:
	LBRACK ((STRING COMMA)* STRING)* RBRACK; // a list [string,string]

concat:
    ID concat_more // id of a concatentation of 2 or more objects
	| list concat_more //concatenation of a list
    ;

concat_more: 
    PLUS concat // + concatenation, depending on how many objects you want concatenated
    | // null if no more objects are to be concatenated 
    ;

schedule:
    'Schedule' COLON ID LBRACE (constraint)* RBRACE; // The schedule/timetable itself with constraints 

constraint:
    ((type)? 'rule' ID COLON) declaration; //define the constraint/rule with an ID 

type:
    'hard' //a rule that needs to be met, high priority
    |'soft'//a rule that does not need to be met, but contributes to the optimal solution
    ; 

declaration:
    quant_decl // 1) some number of object with ID
    |component_decl //2) an accesor into a resource eg. head.demo
    |in_decl //3) some object in some other object, sometimes with a quantity eg. 4 demos in timetable
    |with_decl //4) some resource with some other resource/object eg. demo[ME] with 4 (hours)
    |not_same //5) no two timetables/schedules for a demo or module can be the same 
    |hours
    ;

component_decl://2)
    (accessor) ? component 
    ;

quant_decl: //1)
    quantity 'of' (accessor)? ID 
    ;

in_decl: //3)
    quant_decl 'in' component_decl ('and' component_decl)*
    | component_decl 'in' component_decl
    | component 'in' component ('or' component)*
    ;

with_decl: //4)
    component_decl 'with' component_decl 'for' quantity
    |ID 'with' component_decl NEQUAL component_decl
    |'no' component_decl 'with' comparison INT ID 'in' component_decl
    ;

not_same: //5)
    component NEQUAL component
    |(component_decl COMMA)* component_decl NEQUAL (component_decl COMMA)* component_decl
    ;

hours:
    ID 'hours' LESS INT
    |ID 'hours' GREATER INT
    |ID 'hours' EQUAL INT;

quantity: // a quantity, an integer, any number, one of, +, none, zero
    |INT
    |STAR
    |QUESTION
    |PLUS
    |'none'
    |'zero'
    ;

comparison:
    LESS
    |GREATER
    |LESS_EQUAL
    |GREATER_EQUAL
    |EQUAL
    |NEQUAL;

accessor: //access resources ID.something
    ID DOT
    ;

component: //for the rules
    ID LBRACK STAR RBRACK // 
    |ID LBRACK STRING RBRACK
    |ID LBRACK COLON RBRACK
    |ID LBRACK LBRACE STRING RBRACE RBRACK
    |ID LBRACK (LBRACE (STRING COMMA)* STRING RBRACE) RBRACK
    |ID LBRACK (LBRACE (component_decl COMMA)* component_decl RBRACE) RBRACK
    ;






/*
--------- lexer rules -------------------- 
*/

// Whitespace -- ignored
WS:
    ( ' '
    | '\t'
    | '\f'
    | NEWLINE
    )
	-> skip
    ;

// Single-line comments
SL_COMMENT:
    ('//' | '--')
    (~('\n'|'\r'))* NEWLINE
	-> skip
    ;

// multiple-line comments
ML_COMMENT:
    '/*' .*? '*/'
	-> skip
;

fragment
NEWLINE	:	
    '\r\n' | '\r' | '\n' ;
    
// Use paraphrases for nice error messages
ARROW 		 : '->';
AT     		 : '@';
BAR 		 : '|';
COLON 		 : ':';
COLON_COLON	 : '::';
COLON_EQUAL	 : ':=';
COMMA 		 : ',';
DOT 		 : '.';
DOTDOT 		 : '..';
EQUAL 		 : '=';
GREATER 	 : '>';
GREATER_EQUAL : '>=';
HASH 		 : '#';
LBRACE 		 : '{';
LBRACK 		 : '[';
LESS 		 : '<';
LESS_EQUAL 	 : '<=';
LPAREN 		 : '(';
MINUS 		 : '-';
NOT_EQUAL 	 : '<>';
PLUS 		 : '+';
RBRACE 		 : '}';
RBRACK 		 : ']';
RPAREN		 : ')';
SEMI		 : ';';
SLASH 		 : '/';
STAR 		 : '*';
QUESTION     : '?';	
RARROW       : '=>';
NEQUAL       : '!=';


INT:
	('0'..'9')+
    ;

fragment
REAL:
    INT ('.' INT (('e' | 'E') ('+' | '-')? INT)? | ('e' | 'E') ('+' | '-')? INT)
    ;

// String literals
STRING:	
    '\'' ( ~('\''|'\\') | ESC)* '\'';

// escape sequence -- note that this is protected; it can only be called
//   from another lexer rule -- it will not ever directly return a token to
//   the parser
// There are various ambiguities hushed in this rule.  The optional
// '0'...'7' digit matches should be matched here rather than letting
// them go back to STRING_LITERAL to be matched.  ANTLR does the
// right thing by matching immediately; hence, it's ok to shut off
// the FOLLOW ambig warnings.
fragment
ESC
:
    '\\'
     ( 'n'
     | 'r'
     | 't'
     | 'b'
     | 'f'
     | '"'
     | '\''
     | '\\'
     | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
     | '0'..'3' ('0'..'7' ('0'..'7')? )?  | '4'..'7' ('0'..'7')?
     )
     ;

// hexadecimal digit (again, note it's protected!)
fragment
HEX_DIGIT:
    ( '0'..'9' | 'A'..'F' | 'a'..'f' );


// An identifier.  Note that testLiterals is set to true!  This means
// that after we match the rule, we look in the literals table to see
// if it's a literal or really an identifer.

ID:
    ('$' | 'a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
    ;

// A dummy rule to force vocabulary to be all characters (except
// special ones that ANTLR uses internally (0 to 2)

fragment
VOCAB:	
    '\u0003'..'\u0377'
    ;

