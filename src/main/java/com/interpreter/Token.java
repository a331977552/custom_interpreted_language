package com.interpreter;

public class Token {
    TokenType tokenType;
    String lexeme;
    Object literal;
    int line;

    Token(TokenType tokenType,String lexeme,Object literal,int line){
        this.tokenType =tokenType;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }
    public String toString() {
        return "["+tokenType + " " + lexeme + " " + literal+"]";
    }
}
