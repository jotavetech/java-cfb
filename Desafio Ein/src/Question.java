public class Question {
    private String text;
    private char answer;
    private String[] alternatives;

    public Question(String text, char answer, String[] alternatives) {
        this.text = text;
        this.answer = answer;
        this.alternatives = alternatives;
    }

    public String getText() {
        return this.text;
    }

    public boolean checkAnswer(char answer) {
        return this.answer == answer;
    }

    public void showAlternatives() {
        char[] letters = {'a', 'b', 'c'};
        int i = 0;

        for(String alternative: alternatives) {
            System.out.println(letters[i]+ ": " + alternative);
            i++;
        }
    }
}
