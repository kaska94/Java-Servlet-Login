package model;

import java.sql.SQLException;
import java.util.List;


// Working Methods here declaration 
// DAOStudent is for definition

public interface StudentDAO {
	public int addInDB(Student student) throws SQLException;
	public List<Student> getStudents()throws SQLException;
}
