package com.sample.util;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class TestCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		boolean flag = false;
		Environment env = context.getEnvironment();
		for(String profile : env.getActiveProfiles()){
			if("SS".equals(profile)){
				flag= true;
				break;
			}
		}
		return flag;
	}

}
