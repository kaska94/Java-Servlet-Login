package model.msqlDaoFactory;

import model.DAOFactoryDB;
import model.StudentDAO;

public class MySQLDAOFactory extends DAOFactoryDB{

	@Override
	public StudentDAO getUserDAO() {
		return new MySQLDAOStudent();
	}

}
