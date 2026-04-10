package com.klu.SwaggerAPI.Controller;
import org.springframework.web.bind.annotation.*;

import com.klu.SwaggerAPI.entity.Student;
import com.klu.SwaggerAPI.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import java.util.List;

	@RestController
	@RequestMapping("/students")
	@CrossOrigin("*")
	public class StudentController {

	    private final StudentService service;

	    public StudentController(StudentService service) {
	        this.service = service;
	    }

	    @Operation(summary = "Get all students")
	    @GetMapping
	    public List<Student> getAll() {
	        return service.getAll();
	    }

	    @Operation(summary = "Add student")
	    @ApiResponse(responseCode = "200", description = "Student added")
	    @PostMapping
	    public Student add(@RequestBody Student s) {
	        return service.save(s);
	    }

	    @Operation(summary = "Update student")
	    @PutMapping("/{id}")
	    public Student update(@PathVariable Long id, @RequestBody Student s) {
	        return service.update(id, s);
	    }

	    @Operation(summary = "Delete student")
	    @DeleteMapping("/{id}")
	    public String delete(@PathVariable Long id) {
	        service.delete(id);
	        return "Deleted";
	    }
	}

