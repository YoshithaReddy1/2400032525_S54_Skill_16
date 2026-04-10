package com.klu.SwaggerAPI.service;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.klu.SwaggerAPI.Repository.StudentRepository;
import com.klu.SwaggerAPI.entity.Student;

import java.util.List;

	@Service
	public class StudentService {

	    @Autowired
	    private StudentRepository repo;

	    public List<Student> getAll() {
	        return repo.findAll();
	    }

	    public Student save(Student s) {
	        return repo.save(s);
	    }

	    public Student update(Long id, Student s) {
	        s.setId(id);
	        return repo.save(s);
	    }

	    public void delete(Long id) {
	        repo.deleteById(id);
	    }
	}

