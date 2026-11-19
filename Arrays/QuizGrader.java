public class QuizGrader {//class ng program
    public static void main(String[] args) {// main method
        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};// array ng tamang sagot
        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};// array ng sagot ng estudyante
        int correctCount = 0;//bilang ng tamang sagot
        System.out.println("--- Missed Questions ---");// prini-print ang "--- Missed Questions ---"
        for (int i = 0; i < answerKey.length; i++) {// loop ng haba ng answer key
            if (Character.toUpperCase(studentAnswers[i]) == Character.toUpperCase(answerKey[i])) {// gamit para tanggapin pain kahit na maliit na letra ang sinagot
                correctCount++;// kapag pareho yung answer ng student at ng answer key magdadagdag ng isa ang correctCount
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect. You answered '" + studentAnswers[i] + "', correct answer is '" + answerKey[i] + "'.");// kapag mali,prini-print kung aling tanong,at kung ano ang tama
            }
        }
        double scorePercentage = ((double) correctCount / answerKey.length) * 100;//kinukuha ang percentage ng score
        System.out.println("\nCorrect Answers: " + correctCount + "/" + answerKey.length);//prini-print kung ilan ang nakuha
        System.out.println("Score: " + scorePercentage + "%");//priniprint ang score
        if (scorePercentage >= 70.0) {
            System.out.println("Result: PASS");// mag priprint kung naka 70 pataas ang nakuha
        } else {
            System.out.println("Result: FAIL");// magpriprint kung mas mababa sa 70 ang nakuha
        }
    }
}



