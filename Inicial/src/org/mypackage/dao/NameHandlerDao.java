package org.mypackage.dao;

import org.mypackage.dao.exception.DaoException;
import org.mypackage.hello.NameHandler;

public interface NameHandlerDao {
	public NameHandler create(NameHandler nameBean) throws DaoException;
}
