package com.sample.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sample.service.IManager;

/**
 * Annotate this class to indicate it is an auto scan component
 * If required, then register bean only for specific profile or qualifier
 * */
@Component
@Qualifier("Prod")
public class ProdManagerImpl implements IManager {

	@Override
	public String getManagerInfo() {
		return "Prod-Manager";
	}

}
