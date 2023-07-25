package com.interpreter;

import java.util.List;

public class Interpreter {

    public static void main(String[] args) {
//        if (args.length!=1){
//            throw new RuntimeException("only source code file path is needed");
//        }
        String sourceCode = """
                   class HAHa{
                        var  test = "123";
                        
                        fun (){
                           test = "456";
                           if (test == "456" or test =="aaa" ){
                                print test
                           }
                        }
                   }
                
                """;
        CodeScanner codeScanner = new CodeScanner(sourceCode);
        List<Token> tokens = codeScanner.scanTokens();
        System.out.println(tokens);
    }
}
