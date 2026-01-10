public class PercentageCalculation {
    public static void main(String[] args) {
        double totalMarks = 500.0;
        double marksObtained = 425.0;

        double percentage = (marksObtained / totalMarks) * 100;

        System.out.printf("Percentage: %.2f%%\n", percentage);
    }
}
