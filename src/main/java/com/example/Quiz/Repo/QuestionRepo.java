package com.example.Quiz.Repo;

import com.example.Quiz.Entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<QuizQuestion, Long> {
    List<QuizQuestion> findByCategory(String category);
}
