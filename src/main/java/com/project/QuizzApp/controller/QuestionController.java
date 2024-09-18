package com.project.QuizzApp.controller;


import com.project.QuizzApp.entities.Question;
import com.project.QuizzApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController
{
    @Autowired
    QuestionService questionService;


    //Fetch the all questions
    @GetMapping("/allquestions")
    public List<Question> getAllQuestions()
    {
        return questionService.getAllQuestions();
    }

    //Fetch the questions by category
    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category)
    {
        System.out.println("start of by category");
        return questionService.getQuestionsByCategory(category);
    }
    //Add the question
    @PostMapping("/add")
    public String addQuestion(@RequestBody Question question)
    {
        return questionService.addQuestions(question);
    }

    //Update the question
    @PatchMapping("/update/{id}")
    public String updateQuestion(@PathVariable Integer id, @RequestBody Question question)
    {
        return questionService.updateQuestions(id,question);
    }

    //Delete the question
    @DeleteMapping("/delete/{id}")
    public String deleteQuestion(@PathVariable Integer id)
    {
        return questionService.deleteQuestion(id);
    }

}
