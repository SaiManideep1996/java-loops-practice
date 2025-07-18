public class ScoreCardGenerator {
    public static void main(String[] args) {
        int[][] scores = {
            {85, 92, 78},
            {76, 88, 90},
            {90, 91, 89}
        };

        System.out.println("Student\tMath\tScience\tEnglish");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("S" + (i + 1) + "\t");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
