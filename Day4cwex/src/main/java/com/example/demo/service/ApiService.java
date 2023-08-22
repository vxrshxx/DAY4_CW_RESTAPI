package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;


@Service

public class ApiService {

	@Autowired
	StudentRepo sr;
	
	public Student saveinfo(Student ss)
	{
		return sr.save(ss);  //saving the data from repository into the database
		
	}
	public List<Student> showinfo()
	{
		return sr.findAll(); //retrieving the data that has been store in the database
	}
	
	public Student changeinfo(Student ss)
	{
		return sr.saveAndFlush(ss);
	}
	
	public void deleteinfo(Student ss)
	{
		sr.delete(ss);
	}
}
