package com.klu.SwaggerAPI.Repository;


	import org.springframework.data.jpa.repository.JpaRepository;

import com.klu.SwaggerAPI.entity.Student;

	public interface StudentRepository extends JpaRepository<Student, Long> {
	}

