package org.mypackage.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.mypackage.dao.DBConnect;
import org.mypackage.dao.NameHandlerDao;
import org.mypackage.dao.exception.DaoException;
import org.mypackage.hello.NameHandler;

public class NameHandlerDaoImpl implements NameHandlerDao {

	@Override
	public NameHandler create(NameHandler nameBean) throws DaoException {
		Connection conexaoBD = DBConnect.getConnection();
		String comandoSql = "insert into usuario (nome, cpf) values (?, ?)";
		try {
			PreparedStatement comandoJdbc = conexaoBD.prepareStatement(comandoSql);
			comandoJdbc.setString(1, nameBean.getName());
			comandoJdbc.setString(2, nameBean.getCpf());
			comandoJdbc.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException("Inclusão do nameBean falhou.", e); 
		} finally {
			try {
				conexaoBD.close();
			} catch (SQLException e) {
				throw new DaoException("Close da conexão com o banco de dados falhou.", e); 
			}
		}
		return nameBean;
	}
}
