package Q3;
import Q1.Lab6.MyMethod;

public class DemoCourseGradeByJonathan {
    public static void main(String[] args) {
        MyMethod.myHeader("Jonathan Seo", 8, 3);
        CourseAndInstructor coursein = new CourseAndInstructor("Programming Fundamentals", "Quazi", "Rahman", "TEB 263"); // assigns all info for the course
        StudentInfo me = new StudentInfo("Jonathan", "Seo", 251239960, coursein); // creates my info
        System.out.println(me); //prints my info
        System.out.print("====================\n    Score Card     \n====================");
        //set marks
        double[] labG = {12.71, 12.71, 12.71, 12.71, 12.71, 12.71};
        double[] quizG = {20, 20, 20, 20, 20};
        double midtermG = 18;
        double finalG = 31;
        double[] bonusG = {4.04, 4.04, 4.04, 4.04, 4.04, 4.04, 4.04, 4.04, 4.04, 4.04, 4.04};


        GradeActivity labGrade = new GradeActivity(labG, 15);
        GradeActivity quizGrade = new GradeActivity(quizG, 15);
        GradeActivity midtermGrade = new GradeActivity(midtermG, 25);
        GradeActivity finalExamGrade = new GradeActivity(finalG, 40);

        System.out.print("\nLab Grade: " + labGrade);
        System.out.print("\nQuiz Grade: " + quizGrade);
        System.out.print("\nMidterm Grade: " + midtermGrade);
        System.out.print("\nFinal Exam Grade: " + finalExamGrade);

        double[] finalScore = {labGrade.getScore(), quizGrade.getScore(), midtermGrade.getScore(), finalExamGrade.getScore()};
        GradeActivity finalGrade = new GradeActivity(finalScore, 100);
        System.out.print("\n===============================================");
        System.out.print("\nFinal Score: " + finalGrade);
        System.out.print("\n===============================================");
        GradeActivity bonusGrade = new GradeActivity(bonusG, 5);
        System.out.print("\nBonus Quiz Grade: " + bonusGrade);

        double[] reportedFinalG = {finalGrade.getScore(), bonusGrade.getScore()};
        GradeActivity reportedFinalScore = new GradeActivity(reportedFinalG, 100);
        System.out.print("\nReported Final Grade (with bonus): " + reportedFinalScore);
        System.out.print("\n===============================================\n\n");


        MyMethod.myFooter("Goodbye from Jonathan Seo!");
    }
}
