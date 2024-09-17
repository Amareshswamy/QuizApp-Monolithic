package com.project.QuizzApp.dao;

import com.project.QuizzApp.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer>
{
   List<Question> findByCategoryIgnoreCase(String category);


   @Query(value = "Select * from question q where q.category=:category ORDER BY RANDOM() LIMIT :numQ",nativeQuery = true)
   List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
