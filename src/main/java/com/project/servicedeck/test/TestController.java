package com.project.servicedeck.test;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.project.servicedeck.test.dto.TestRequestDTO;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @Operation(summary = "테스트 데이터 조회", description = "DB에 저장된 테스트 데이터를 조회합니다.")
    public List<Test> getAllTests() {
        return testService.getAllTests();
    }

    @PostMapping
    @Operation(summary = "테스트 데이터 삽입", description = "사용자로부터 테스트 데이터를 받아 DB에 저장합니다.")
    public void insertTests(@Valid @RequestBody TestRequestDTO testDto) {
        testService.addData(testDto);
    }
}

