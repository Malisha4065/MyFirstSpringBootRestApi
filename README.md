# MyFirstSpringBootRestApi

![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

Welcome to my First Spring Boot REST API!
The SpringBoot Survey API is a RESTful web service that allows users to manage questions and surveys. Built using Spring Boot framework, it provides endpoints for creating, reading, updating, and deleting questions and surveys. This API is designed to be scalable, easy-to-use, and can be integrated into any application that requires survey-related functionality.

## FEATURES
* Create new surveys with multiple questions
* Add, retrieve, update, and delete individual questions
* Retrieve surveys and their corresponding questions
* Lightweight and easy-to-use API

## PREREQUISITES
Before running the API, ensure you have the following installed:

* Java Development Kit (JDK) 8 or above
* Apache Maven

## INSTALLATION

To run the SpringBoot Survey API on your local machine, follow these steps:

1. Clone this repository to your local machine.
2. Build the project using Maven: `mvn clean install`.
3. Run the application: `mvn spring-boot:run`.
The API will be accessible at `http://localhost:8080`.

## USAGE

Once the API is up and running, you can interact with it using HTTP requests. The API follows RESTful principles, and all endpoints can be accessed via HTTP methods such as `GET`, `POST`, `PUT`, and `DELETE`. 

## API ENDPOINTS

The following are the main API endpoints provided:

* `POST /surveys`: Create a new survey.

* `GET /surveys`: Get a list of all surveys.

* `GET /surveys/{surveyId}`: Get details of a specific survey.

* `PUT /surveys/{surveyId}`: Update a survey's information.

* `DELETE /surveys/{surveyId}`: Delete a survey.

* `POST /surveys/{surveyId}/questions`: Create a new question within a survey.

* `GET /surveys/{surveyId}/questions`: Get a list of all questions for a specific survey.

* `GET /surveys/{surveyId}/questions/{questionId}`: Get details of a specific question.

* `PUT /surveys/{surveyId}/questions/{questionId}`: Update a question's information.

* `DELETE /surveys/{surveyId}/questions/{questionId}`: Delete a question.

## ERROR HANDLING

The API provides detailed error responses to help you identify and fix any issues. If an error occurs, the API will return an appropriate status code along with an error message in the response body.

## LICENSE

The SpringBoot Survey API is open-source and is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code as per the terms of this license.
