package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}