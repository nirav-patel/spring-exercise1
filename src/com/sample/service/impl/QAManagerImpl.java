package com.sample.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sample.service.IManager;

/**
 * Annotate this class to indicate it is an auto scan component
 * If required, then register bean only for specific profile or qualifier
 * */
@Component
@Profile("Ora")
@Qualifier("QA")
public class QAManagerImpl implements IManager {

	@Override
	public String getManagerInfo() {
		return "QA-Manager";
	}

}
