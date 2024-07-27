package com.example.controller;
import com.example.model.*;
import com.example.service.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController         //RestController임을 명시한다.
@RequestMapping("/api") // 리소스
public class ApiController {

    private final ApiService apiService;
    
    @GetMapping
    public List<Question> getAllQuestions() {
        return apiService.getAllQuestions();
    }

    @GetMapping("/{id}")
    public Optional<Question> getQuestionById(@PathVariable Integer id) {
        return apiService.getQuestionById(id);
    }

}
