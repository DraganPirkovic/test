package com.dragan;

import net.sf.jsqlparser.expression.StringValue;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.SelectVisitor;
import net.sf.jsqlparser.statement.select.SetOperationList;
import net.sf.jsqlparser.statement.select.WithItem;

public class ExampleSelectVisitor implements SelectVisitor {

	public void visit(PlainSelect arg0) {
		arg0.getWhere().accept(new ExampleWhereVisitor());
		arg0.setWhere(new AndExpression(new StringValue("nick=3"),new StringValue(arg0.getWhere().toString())));
		System.out.println(arg0.getWhere().toString());

	}

	public void visit(SetOperationList arg0) {
		System.out.println(arg0);

	}

	public void visit(WithItem arg0) {
		System.out.println(arg0);
	}

}
