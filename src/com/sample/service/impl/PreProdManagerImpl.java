package com.sample.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import com.sample.service.IManager;
import com.sample.util.TestCondition;

/**
 * Annotate this class to indicate it is an auto scan component
 * If required, then register bean only for specific profile or qualifier
 * */
@Component
@Qualifier("Prod")
@Conditional(TestCondition.class)
public class PreProdManagerImpl implements IManager {

	@Override
	public String getManagerInfo() {
		return "Pre-Prod-QA-Manager";
	}

}
