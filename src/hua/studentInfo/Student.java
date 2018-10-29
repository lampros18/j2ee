package hua.studentInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

//Αναπαράσταση φοιτητή με μια κλαση
@Component
@Entity
@Table(name="students")
public class Student {
	
	@Size(min=5,max=50)
	@Column(name="name")
	private String name;
	@Column(name="surname")
	@Size(min=5,max=50)
	private String surname;
	@Column(name="email")
	@Size(min=1,max=50)
	private String email;
	
	
	
	public Student() {
		super();
	}
	
	public Student(String name, String surname, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		
		Student compareStudent=(Student) obj;
		
		if(this.name.equals(compareStudent.name) && this.surname.equals(compareStudent.surname)
				&& this.email.equals(compareStudent.email)){
			
			return true;
		}
		
		return false;
	}
	
	

}
