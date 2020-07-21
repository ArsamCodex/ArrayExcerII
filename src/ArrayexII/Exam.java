package ArrayexII;

import java.util.Scanner;

public class Exam {
    static Scanner console = new Scanner(System.in);
    private float [] scores;
    public void getExamData(){
        System.out.println("HOW MANNY STUDENTS TOOK EXAM ?!");
        scores = new float[console.nextInt()];
        for(int i = 0 ; i < scores.length ; i++){
            System.out.println("SCORE FOR STUDENT" + ( i + 1) + " : ");
            scores[i ] = console.nextFloat();
        }
    }

    public void showState(){
        if(scores.length > 0){
            System.out.println("----------------");
            System.out.println("STUDENTS" + "\t" + "SCORES");
            for(int i = 0 ; i<scores.length; i++){
                System.out.println((i+1) + "\t\t" + scores[i]);
                System.out.println("-------------------------");
                System.out.println("MINIMUM SCORE IS " + findMin());
                System.out.println("MINIMUM SCORE IS " + findMax());
                double mean = computeMean();
                System.out.println("MEAN SCORE IS " + mean);
                System.out.println("STANDAARD DEVISIONN IS " + computeStandardDev(mean));

            }

        }
        else
            System.out.println("NO STUDENTS , SO NO STATE");
    }

    private double computeMean() {
        double sum = 0 ;
        for(int i = 0 ; i <scores.length ; i++)
            sum = sum + scores[i];
        return sum / (double)scores.length;
    }

    private float findMax() {
        float maxScore = scores[0];
        for (int i = 0 ; i < scores.length ; i++)
            if(scores[i] < maxScore)
                maxScore = scores[i];
            return maxScore;
    }

    public double computeStandardDev(double mean) {
        float sumSquares = 0 ;
        for(int i = 0 ; i  < scores.length ; i++)
            sumSquares = sumSquares + scores[i] * scores[i];
        return  Math.sqrt(sumSquares / (double)scores.length - mean*mean);

    }

    private float findMin() {
        float minScore = scores[0];
        for(int i = 0 ; i <scores.length ; i++)
            if(scores[i] < minScore)
                minScore = scores[i];
            return minScore;
    }
}
