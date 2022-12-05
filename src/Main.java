import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws Throwable {

       // partOne();
        partTwo();

    }

    private static void partTwo() throws Throwable {
        Scanner infile = new Scanner(new File("input.dat"));

      

        long totalScore = 0L;
        while(infile.hasNext()){
            String next = infile.nextLine();
            Scanner play = new Scanner(next);
            String opp = play.next();
            String me = play.next();
            int score = 0;

            if(me.equals("X")) {
                if (opp.equals("A"))
                    score = 3;
                else if (opp.equals("B"))
                    score = 1;
                else
                    score = 2;
            }
            else if(me.equals("Y")) {
                if (opp.equals("A"))
                    score = 4;
                else if (opp.equals("B"))
                    score = 5;
                else
                    score = 6;
            }
            else {
                if (opp.equals("A"))
                    score = 8;
                else if (opp.equals("B"))
                    score = 9;
                else
                    score = 7;
            }

            totalScore += (long)score;
        }

        out.println(totalScore);
    }

    private static void partOne() throws Throwable {
        Scanner infile = new Scanner(new File("test.dat"));

       

        long totalScore = 0L;
        while(infile.hasNext()){
            String next = infile.nextLine();
            Scanner play = new Scanner(next);
            String opp = play.next();
            String me = play.next();
            int score = (me.equals("X")?1:(me.equals("Y")?2:3));

            if(opp.equals("A")&&me.equals("Z")){
                score += 0;
            }
            else if(opp.equals("A")&&me.equals("Y")) {
                score += 6;
            }
            else if(opp.equals("B")&&me.equals("X")) {
                score += 0;
            }
            else if(opp.equals("B")&&me.equals("Z")) {
                score += 6;
            }
            else if(opp.equals("C")&&me.equals("Y")) {
                score += 0;
            }
            else if(opp.equals("C")&&me.equals("X")) {
                score += 6;
            }
            else {
                score += 3;
            }
            out.println(score);
            totalScore += (long)score;
    }

        out.println(totalScore);


    }
}
