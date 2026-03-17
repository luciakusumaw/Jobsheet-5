package week5;

public class StudentMain13 {
    public static void main(String[] args) {
        Student13[] std = new Student13[8];
        std[0] = new Student13("Ahmad", "220101001", 2022, 78, 82);
        std[1] = new Student13("Budi", "220101002", 2022, 85, 88);
        std[2] = new Student13("Cindy", "220101003", 2021, 90, 87);
        std[3] = new Student13("Dian", "220101004", 2021, 76, 79);
        std[4] = new Student13("Eko", "220101005", 2023, 92, 95);
        std[5] = new Student13("Fajar", "220101006", 2020, 88, 85);
        std[6] = new Student13("Gina", "220101007", 2023, 80, 83);
        std[7] = new Student13("Hadi", "220101008", 2020, 82, 84);

        double[] utsScores = new double[8];
        double[] uasScores = new double[8];

        for (int i = 0; i < 8; i++) {
            utsScores[i] = std[i].uts;
            uasScores[i] = std[i].uas;
        }

        System.out.println("Highest Midterm Score (DC): " + std[0].findMaxUTS(utsScores, 0, 7));
        System.out.println("Lowest Midterm Score (DC): " + std[0].findMinUTS(utsScores, 0, 7));
        System.out.println("Average Final Score (BF): " + std[0].averageUASBF(uasScores));
    }
}