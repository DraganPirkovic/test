package com.dragan;

import java.io.StringReader;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserManager;
import net.sf.jsqlparser.statement.Statement;

public class App2 {
	
	
	public static void main(String[] args) throws JSQLParserException  {
		CCJSqlParserManager a = new  CCJSqlParserManager();
		
		Statement s = a.parse(new StringReader("select a.name from table a where a.name = 3 and a.last = 2"));
		Statement s1 = a.parse(new StringReader("where a.name = 3 and a.last = 2"));
		s.accept(new ExampleStatementVisitor());
		System.out.println(s.toString());
		
	}
}
