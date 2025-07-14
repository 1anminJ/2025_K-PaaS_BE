package com.project.servicedeck.test.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TestRequestDTO {
    // 테스트용
    @NotBlank(message = "이름은 필수 입력값입니다.")
    private String name;
}
