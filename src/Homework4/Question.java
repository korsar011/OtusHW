package Homework4;

public class Question {
    private String questionText;
    private String [] answerOptions;
    private int correctAnswer;

    public Question(String questionText, String[] answerOptions, int correctAnswer) {
        this.questionText = questionText;
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String [] getAnswerOptions() {
        return answerOptions;
    }

    public int getCorrectAnswers() {
        return correctAnswer;
    }
    }