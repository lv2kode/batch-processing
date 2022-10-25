package com.lv2code.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lv2code.batch.model.Student;
import com.lv2code.batch.repository.StudentRepository;

@Component
public class DBWriter implements ItemWriter<Student> {
	
	private StudentRepository userRepository;

    @Autowired
    public DBWriter (StudentRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void write(List<? extends Student> users) throws Exception{
        System.out.println("Data Saved for Users: " + users);
        userRepository.saveAll(users);
    }
}
