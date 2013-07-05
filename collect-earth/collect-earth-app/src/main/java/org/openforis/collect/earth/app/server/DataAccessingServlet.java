package org.openforis.collect.earth.app.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class DataAccessingServlet {

	@Autowired
	private DataAccessor dataAccessor;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public DataAccessingServlet() {
		super();

	}

	public DataAccessor getDataAccessor() {
		return dataAccessor;
	}

	public Logger getLogger() {
		return logger;
	}

}