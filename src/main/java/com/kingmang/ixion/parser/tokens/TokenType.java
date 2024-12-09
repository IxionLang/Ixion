package com.kingmang.ixion.parser.tokens;


public enum TokenType {

	IDENTIFIER,
	UNITTEST,
	EXT,
	USING,
	OVERRIDE,
	PACKAGE,
	FUNCTION,
	VAR,
	CONST,
	CLASS,
	ENUM,
	TO,
	RETURN,
	CONTINUE,
	BREAK,
	FOR,
	WHILE,
	IF,
	ELSE,
	NEW,
	TRUE,
	FALSE,
	NULL,
	THIS,
	SUPER,
	VOID,
	INT,
	DOUBLE,
	BOOLEAN,
	CHAR,
	FLOAT,
	LONG,
	BYTE,
	SHORT,
	PUBLIC,
	PRIVATE,
	STATIC,
	THROW,
	THROWS,
	TRY,
	CATCH,
	FINALLY,
	IS,
	GETTER,
	SETTER,

	LBRACE, RBRACE,
	LPAREN, RPAREN,
	LSQBR, RSQBR,
	SEMI,
	COLON,
	COMMA, DOT,
	PLUS, MINUS,
	STAR, SLASH, PERCENT,
	EQUALS,
	EXCLAIM,
	LESS, GREATER,
	BITWISE_AND,
	BITWISE_OR,
	BITWISE_XOR,
	BITWISE_NOT,
	QUESTION,

	ARROW,
	EQEQ, TRI_EQ,
	EXEQ, TRI_EXEQ,
	LESS_EQ, GREATER_EQ,
	LOGICAL_AND,
	LOGICAL_OR,
	BITWISE_SHL,
	BITWISE_SHR,
	BITWISE_USHR,
	QUESTION_DOT,
	QUESTION_LSQBR,
	QUESTION_QUESTION,
	INCREMENT,
	DECREMENT,

	IN_PLUS,
	IN_MINUS,
	IN_MUL,
	IN_DIV,
	IN_MOD,
	IN_BITWISE_SHL,
	IN_BITWISE_SHR,
	IN_BITWISE_USHR,
	IN_BITWISE_AND,
	IN_BITWISE_OR,
	IN_BITWISE_XOR,
	LAMBDA,




	NUMBER,
	STRING,
	CHAR_LITERAL,

	ERROR,
	EOF
}
