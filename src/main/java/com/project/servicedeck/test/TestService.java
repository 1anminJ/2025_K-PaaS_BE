package com.project.servicedeck.test;


import org.springframework.stereotype.Service;
import com.project.servicedeck.test.dto.TestRequestDTO;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TestService {

    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public List<Test> getAllTests() {
        return testRepository.findAll();
    }
    public void addData(TestRequestDTO data){
        Test test = new Test();
        test.setName(data.getName());
        test.setCreatedAt(LocalDateTime.now());

        testRepository.save(test);
        System.out.println("데이터 추가 성공");}
}
