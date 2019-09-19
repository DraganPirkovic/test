package com.dragan;

import java.io.Serializable;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;



public class CustomInterceptor extends EmptyInterceptor{
	
	@Override
	public String onPrepareStatement(String sql) {
		
		return sql;//q.toQueryString();
		
		
	}
	
	@Override
	public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		System.out.println();
		getEntityName(entity);
		return super.onLoad(entity, id, state, propertyNames, types);
	}
	
	

}
