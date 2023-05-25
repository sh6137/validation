package com.example.validation.dto;

import com.example.validation.annotation.YearMonth;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Getter
@Setter
@ToString
public class User {

    @NotBlank
    private String name;
    @Max(value = 90)
    private int age;
//    @Email
//    private String email;
//
//    @YearMonth(pattern = "yyyyMMdd", message = "yyyyMM 패턴과 맞지 않습니다.")
//    private String reqYearMonth; //yyyyMM
//
//    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호의 양식과 맞지 않습니다.")
//    private String phoneNumber;

    @Valid
    private List<Car> cars;
}
