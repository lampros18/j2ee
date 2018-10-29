package hua.studentInfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Component;

//DAO = Data Access Object. Ουσιαστικά θα κάνει την αντιστοίχιση ανάμεσα σε έναν πίνακα στην βάση
//και σε ένα αντικείμενο τύπου Student
@Component("studentDAO")
public class StudentDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	
	
	
	public StudentDAO() {
		super();
		System.out.println("Successfuly loaded");
	}


	@Autowired
	public void setDataSource(DataSource jdbc) {
		
		this.jdbcTemplate=new JdbcTemplate(jdbc);
		
	}
	
	
	public boolean insertStudent(Student student) {
		
		BeanPropertySqlParameterSource params=new BeanPropertySqlParameterSource(student);
		
		return this.jdbcTemplate.update("insert into students (name,surname,email) "
				+ "values(:name,:surname,:email",params)==1;
		
	}
	
	public List<Student> getStudents(){
		
		
		return jdbcTemplate.query("select * from students", new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Student student=new Student();
				
				student.setName(rs.getString("name"));
				student.setSurname(rs.getString("surname"));
				student.setEmail(rs.getString("email"));
				
				return student;
			}
			
			
		});
		
		
	}
	
	

}
