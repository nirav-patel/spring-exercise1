package com.sample.service.impl;

import com.sample.service.IManager;

/**
 * Annotate this class to indicate it is an auto scan component
 * If required, then register bean only for specific profile or qualifier
 * */
public class QAManagerImpl implements IManager {

	@Override
	public String getManagerInfo() {
		return "QA-Manager";
	}

}
