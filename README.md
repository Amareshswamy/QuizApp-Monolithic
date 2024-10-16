# QuizApp-Monolithic

## Overview

**Quizzapp** is a web-based quiz management application built using **Java 21** and **Spring Boot**. It enables users to perform CRUD operations on quiz questions, create randomized quizzes, and calculate quiz scores. The app uses **PostgreSQL** as its database and is fully integrated with **Lombok** for cleaner Java code and **Postman** for API testing.

## Features

- **CRUD Operations for Questions:** Create, update, retrieve, and delete questions from the database.
- **Random Quiz Creation:** Automatically generate a quiz by randomly selecting available questions.
- **Score Calculation:** Evaluate quiz submissions and compute the final score.

## Tech Stack

- **Backend:** Java 21, Spring Boot
- **Database:** PostgreSQL
- **Dependencies:** Lombok
- **Testing:** Postman

## API Endpoints

### Question Management

- `PATCH /question/update/{id}`  
  Update a question by its ID.

- `POST /question/add`  
  Add a new question to the database.

- `DELETE /question/delete/{id}`  
  Delete a question by its ID.

- `GET /question/allquestions`  
  Retrieve all questions from the database.

- `GET /question/category/{category}`  
  Retrieve questions by their category.

### Quiz Management

- `POST /quiz/create`  
  Create a quiz with randomly selected questions.

- `POST /quiz/submit/{id}`  
  Submit a quiz and calculate the score based on user responses.

- `GET /quiz/get/{id}`  
  Retrieve a quiz by its ID.

## Usage

- Use the `/question/add` endpoint to add new questions.
- To generate a quiz, use the `/quiz/create` endpoint, which selects random questions.
- After completing the quiz, submit answers using `/quiz/submit/{id}` to calculate the score.

