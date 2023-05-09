package HomeWork4;

public class AnswerOptions {
    private String[] options;
    private int correctAnswer;

    public AnswerOptions(String[] options, int correctAnswer) {
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public int getSize() {
        return options.length;
    }

    public boolean isCorrect(int answer) {
        return answer == correctAnswer;
    }
}
