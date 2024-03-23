package com.avhiinfotech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahviinfotech.dto.StudentInfoDTO;
import com.avhiinfotech.model.StudentInfo;
import com.avhiinfotech.repository.StudentInfoRepository;

@Service
public class StudentInfoService {

	@Autowired
	StudentInfoRepository studentinforepo;

    //UPSERT --> Update if already data exist in database, if not exist then create new record
	public StudentInfoDTO createStudentInfo(StudentInfoDTO request) {
		//Step-1: Understand Request Object = studentInfoDto

		//Step-2: Copy all properties data of StudentInfoDTO to StudentInfo
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setName(request.getName());
		studentInfo.setMarksScored(request.getMarksScored());

		//Step-3: Save entity into Database and returns the saved object
		StudentInfo studentInfoSaved  = studentinforepo.save(studentInfo);

		//Step-4: Saved entity object convert to response DTO
		StudentInfoDTO response = new StudentInfoDTO();
		response.setId(studentInfoSaved.getId());
		response.setName(studentInfoSaved.getName());
		response.setMarksScored(studentInfoSaved.getMarksScored());
		return response;

	}

	public static StudentInfo save(StudentInfo studentinfo) {

		return null;
	}
}