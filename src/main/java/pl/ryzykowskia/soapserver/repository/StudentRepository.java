package pl.ryzykowskia.soapserver.repository;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.concretepage.soap.Student;

@Component
public class StudentRepository {
	
	private Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
	
	public StudentRepository(){
		Student s1 = new Student();
		s1.setStudentId(1);
		s1.setName("Ariel");
		s1.setAge(36);
		s1.setClazz("ABC");
		studentMap.put(1, s1);
		
		Student s2 = new Student();
		s2.setStudentId(2);
		s2.setName("Anna");
		s2.setAge(33);
		s2.setClazz("EFG");
		studentMap.put(2, s2);
	}
	
	public Student getStudent(int studentId){
		return studentMap.get(studentId);
	}
} 
