package com.avhiinfotech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahviinfotech.dto.StudentInfoDTO;
import com.avhiinfotech.service.StudentInfoService;

@RestController
@RequestMapping("/")
public class StudentInfoController {

	@Autowired
	StudentInfoService studentInfoService;

	@PostMapping("/students")
	public StudentInfoDTO createStudent(@RequestBody StudentInfoDTO request) {
		return studentInfoService.createStudentInfo(request);
	}
}
