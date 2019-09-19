package com.dragan;

import net.sf.jsqlparser.expression.AllComparisonExpression;
import net.sf.jsqlparser.expression.AnalyticExpression;
import net.sf.jsqlparser.expression.AnyComparisonExpression;
import net.sf.jsqlparser.expression.CaseExpression;
import net.sf.jsqlparser.expression.CastExpression;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import net.sf.jsqlparser.expression.DateValue;
import net.sf.jsqlparser.expression.DoubleValue;
import net.sf.jsqlparser.expression.ExpressionVisitor;
import net.sf.jsqlparser.expression.ExtractExpression;
import net.sf.jsqlparser.expression.Function;
import net.sf.jsqlparser.expression.HexValue;
import net.sf.jsqlparser.expression.IntervalExpression;
import net.sf.jsqlparser.expression.JdbcNamedParameter;
import net.sf.jsqlparser.expression.JdbcParameter;
import net.sf.jsqlparser.expression.JsonExpression;
import net.sf.jsqlparser.expression.KeepExpression;
import net.sf.jsqlparser.expression.LongValue;
import net.sf.jsqlparser.expression.MySQLGroupConcat;
import net.sf.jsqlparser.expression.NotExpression;
import net.sf.jsqlparser.expression.NullValue;
import net.sf.jsqlparser.expression.NumericBind;
import net.sf.jsqlparser.expression.OracleHierarchicalExpression;
import net.sf.jsqlparser.expression.OracleHint;
import net.sf.jsqlparser.expression.Parenthesis;
import net.sf.jsqlparser.expression.RowConstructor;
import net.sf.jsqlparser.expression.SignedExpression;
import net.sf.jsqlparser.expression.StringValue;
import net.sf.jsqlparser.expression.TimeKeyExpression;
import net.sf.jsqlparser.expression.TimeValue;
import net.sf.jsqlparser.expression.TimestampValue;
import net.sf.jsqlparser.expression.UserVariable;
import net.sf.jsqlparser.expression.WhenClause;
import net.sf.jsqlparser.expression.WithinGroupExpression;
import net.sf.jsqlparser.expression.operators.arithmetic.Addition;
import net.sf.jsqlparser.expression.operators.arithmetic.BitwiseAnd;
import net.sf.jsqlparser.expression.operators.arithmetic.BitwiseOr;
import net.sf.jsqlparser.expression.operators.arithmetic.BitwiseXor;
import net.sf.jsqlparser.expression.operators.arithmetic.Concat;
import net.sf.jsqlparser.expression.operators.arithmetic.Division;
import net.sf.jsqlparser.expression.operators.arithmetic.Modulo;
import net.sf.jsqlparser.expression.operators.arithmetic.Multiplication;
import net.sf.jsqlparser.expression.operators.arithmetic.Subtraction;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.conditional.OrExpression;
import net.sf.jsqlparser.expression.operators.relational.Between;
import net.sf.jsqlparser.expression.operators.relational.EqualsTo;
import net.sf.jsqlparser.expression.operators.relational.ExistsExpression;
import net.sf.jsqlparser.expression.operators.relational.GreaterThan;
import net.sf.jsqlparser.expression.operators.relational.GreaterThanEquals;
import net.sf.jsqlparser.expression.operators.relational.InExpression;
import net.sf.jsqlparser.expression.operators.relational.IsNullExpression;
import net.sf.jsqlparser.expression.operators.relational.JsonOperator;
import net.sf.jsqlparser.expression.operators.relational.LikeExpression;
import net.sf.jsqlparser.expression.operators.relational.Matches;
import net.sf.jsqlparser.expression.operators.relational.MinorThan;
import net.sf.jsqlparser.expression.operators.relational.MinorThanEquals;
import net.sf.jsqlparser.expression.operators.relational.NotEqualsTo;
import net.sf.jsqlparser.expression.operators.relational.RegExpMatchOperator;
import net.sf.jsqlparser.expression.operators.relational.RegExpMySQLOperator;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.select.SubSelect;

public class ExampleWhereVisitor implements ExpressionVisitor {

	public void visit(NullValue arg0) {
		System.out.println(arg0);

	}

	public void visit(Function arg0) {
		System.out.println(arg0);
	}

	public void visit(SignedExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(JdbcParameter arg0) {
		System.out.println(arg0);

	}

	public void visit(JdbcNamedParameter arg0) {
		System.out.println(arg0);

	}

	public void visit(DoubleValue arg0) {
		System.out.println(arg0);

	}

	public void visit(LongValue arg0) {
		System.out.println(arg0);

	}

	public void visit(HexValue arg0) {
		System.out.println(arg0);

	}

	public void visit(DateValue arg0) {
		// TODO Auto-generated method stub

	}

	public void visit(TimeValue arg0) {
		System.out.println(arg0);
	}

	public void visit(TimestampValue arg0) {
		System.out.println(arg0);

	}

	public void visit(Parenthesis arg0) {
		System.out.println(arg0);

	}

	public void visit(StringValue arg0) {
		System.out.println(arg0);

	}

	public void visit(Addition arg0) {
		System.out.println(arg0);

	}

	public void visit(Division arg0) {
		System.out.println(arg0);

	}

	public void visit(Multiplication arg0) {
		System.out.println(arg0);

	}

	public void visit(Subtraction arg0) {
		System.out.println(arg0);

	}

	public void visit(AndExpression arg0) {
		System.out.println(arg0);
		

	}

	public void visit(OrExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(Between arg0) {
		System.out.println(arg0);
	}

	public void visit(EqualsTo arg0) {
		System.out.println(arg0);
		

	}

	public void visit(GreaterThan arg0) {
		System.out.println(arg0);

	}

	public void visit(GreaterThanEquals arg0) {
		System.out.println(arg0);

	}

	public void visit(InExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(IsNullExpression arg0) {
		System.out.println(arg0);
	}

	public void visit(LikeExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(MinorThan arg0) {
		System.out.println(arg0);

	}

	public void visit(MinorThanEquals arg0) {
		System.out.println(arg0);

	}

	public void visit(NotEqualsTo arg0) {
		System.out.println(arg0);

	}

	public void visit(Column arg0) {
		System.out.println(arg0);

	}

	public void visit(SubSelect arg0) {
		System.out.println(arg0);

	}

	public void visit(CaseExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(WhenClause arg0) {
		System.out.println(arg0);

	}

	public void visit(ExistsExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(AllComparisonExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(AnyComparisonExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(Concat arg0) {
		System.out.println(arg0);

	}

	public void visit(Matches arg0) {
		System.out.println(arg0);

	}

	public void visit(BitwiseAnd arg0) {
		System.out.println(arg0);

	}

	public void visit(BitwiseOr arg0) {
		System.out.println(arg0);

	}

	public void visit(BitwiseXor arg0) {
		System.out.println(arg0);

	}

	public void visit(CastExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(Modulo arg0) {
		System.out.println(arg0);

	}

	public void visit(AnalyticExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(WithinGroupExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(ExtractExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(IntervalExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(OracleHierarchicalExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(RegExpMatchOperator arg0) {
		System.out.println(arg0);

	}

	public void visit(JsonExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(JsonOperator arg0) {
		System.out.println(arg0);

	}

	public void visit(RegExpMySQLOperator arg0) {
		System.out.println(arg0);

	}

	public void visit(UserVariable arg0) {
		System.out.println(arg0);

	}

	public void visit(NumericBind arg0) {
		System.out.println(arg0);

	}

	public void visit(KeepExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(MySQLGroupConcat arg0) {
		System.out.println(arg0);

	}

	public void visit(RowConstructor arg0) {
		System.out.println(arg0);

	}

	public void visit(OracleHint arg0) {
		System.out.println(arg0);

	}

	public void visit(TimeKeyExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(DateTimeLiteralExpression arg0) {
		System.out.println(arg0);

	}

	public void visit(NotExpression arg0) {
		System.out.println(arg0);

	}

}
