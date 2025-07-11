package com.project.servicedeck.test;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.project.servicedeck.test.dto.TestRequestDTO;

import java.util.List;

@RestController
@Validated
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/api/test")
    @Operation(summary = "테스트 데이터 조회", description = "DB에 저장된 테스트 데이터를 조회합니다.")
    public List<Test> getAllTests() {
        return testService.getAllTests();
    }

    @PostMapping("/api/test")
    @Operation(summary = "테스트 데이터 삽입",  description = "사용자로 부터 테스트 데이터를 받아 DB에 저장합니다.")
    public  void insertTests(@Valid @RequestBody TestRequestDTO testDto ) { System.out.println("DTO name = " + testDto.getName()); testService.addData(testDto); }
}

