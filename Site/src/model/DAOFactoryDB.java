package model;

import model.msqlDaoFactory.MySQLDAOFactory;

public abstract class DAOFactoryDB {
	public static final int MYSQL = 0;
	
	public abstract StudentDAO getUserDAO();
	
	public static DAOFactoryDB DaoCreateDB(int type)
	{
		switch(type){
		case 0:
			return new MySQLDAOFactory();
		}
		return null;
	}
}
