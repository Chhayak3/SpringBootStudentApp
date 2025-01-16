package com.chhaya.serviceimpl;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhaya.entity.Student;
import com.chhaya.repository.Studentrepository;
import com.chhaya.service.StudentService;


@Service
public class ServiceImpl  implements StudentService{

	@Autowired
	Studentrepository Studentrepository;
	
	
	
@Override
	public List<Student>  getAllStudents() {
		
		
		List<Student> list=Studentrepository.findAll();
		
		return list;
	}



@Override
public Student saveStudent(Student student) {
	// TODO Auto-generated method stub
	return Studentrepository.save(student);
}



@Override
public Student getById(int id) {
	
	return  Studentrepository.findById(id).get();
}



@Override
public void deleteById(int id) {
	
	Studentrepository.deleteById(id);
}

}
