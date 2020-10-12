package laboratory3;

public class TextManipulation {
    private String text;
    private int numberOfSentences;
    private int numberOfWords;
    private int numberOfLetters;
    private int numberOfVowels;
    private int numberOfConsonants;

    TextManipulation(String text) {
        this.text = text;
        sentenceCount();

        //remove special characters from the String text except dash and a to z, A to Z, 0 to 9
        this.text = this.text.replaceAll("[^a-zA-Z0-9 ]", "");
        wordsCount();
        lettersCount();
        vowelsCount();
        consonantsCount();
    }

    private void sentenceCount()
    {
        numberOfSentences = text.split("[!?.:]").length;
    }

    private void wordsCount()
    {
        numberOfWords = text.split("\\s").length; // "\\s+" one or more whitespace character
    }

    private void lettersCount() {
        numberOfLetters = text.split("[a-zA-Z]").length;
    }

    private void vowelsCount() {
        numberOfVowels = text.split("[aeiouAEIOU]").length;
    }

    private void consonantsCount() {
        numberOfConsonants = text.split("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPRSTVWXYZ]").length;
    }

    String getLongestWord() {
        String[] words = text.toLowerCase().split("[ !?.:,]+");  //convert text to lowercase characters and put them in an array
        String maxWord = words[0];
        int maxLength = maxWord.length();

        for(int i = 0; i < words.length; i++ ) {
            String word = words[i];
            int currentLength = word.length();

            if(currentLength > maxLength) {
                maxLength = currentLength;
                maxWord = word;
            }
        }

        return maxWord;
    }

    public void showDataAboutText() {
        System.out.println("Number of sentences: " + numberOfSentences);
        System.out.println("Number of words: " + numberOfWords);
        System.out.println("Number of letters: " + numberOfLetters);
        System.out.println("Number of vowels: " + numberOfVowels);
        System.out.println("Number of consonants: " + numberOfConsonants);
        System.out.println("The longest word: " + getLongestWord());
    }
}
