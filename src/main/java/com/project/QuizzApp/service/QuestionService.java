package com.project.QuizzApp.service;

import com.project.QuizzApp.dao.QuestionDao;
import com.project.QuizzApp.entities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class QuestionService
{
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }


    public List<Question> getQuestionsByCategory(String category)
    {
        System.out.println("inside the service");
        return questionDao.findByCategoryIgnoreCase(category);
    }


    public String addQuestions(Question question)
    {
        questionDao.save(question);
        return "Success";
    }

    public String updateQuestions(Integer id, Question question)
    {
        Question question1 = questionDao.findById(id).orElseThrow( () -> new RuntimeException("No question found on this Id"));

        question1.setQuestionTitle(question.getQuestionTitle());
        question1.setOption1(question.getOption1());
        question1.setOption2(question.getOption2());
        question1.setOption3(question.getOption3());
        question1.setOption4(question.getOption4());
        question1.setCategory(question.getCategory());
        question1.setDifficultyLevel(question.getDifficultyLevel());
        question1.setRightAnswer(question.getRightAnswer());
        questionDao.save(question1);

        return "Updated the Changes";
    }

    public String deleteQuestion(Integer id)
    {
        questionDao.deleteById(id);
        return "Delete Successful";
    }
}
