import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Differences extends StudentInfo{
    double markAI;
    double markNonAI;
    double average;
    boolean success;
    double percentage;
    double verification;
    double functionality;
    String studentType;
    double designUnderstanding;
    double explanation;


    public double getMScMark(double finalPercentage,String Type){
        if(studentType.equals("Msc")){
            return(finalPercentage=0.5*designUnderstanding+0.5*explanation);
        }
        else{
            return(0);
        }
    }

    public double getMarkNonAI(double independentMark){
        if(success){
            return (markAI);
        }
        else{
            return(percentage=40);
        }
    }
    public double getMarkAI(double finalMark){
        return (percentage=0.4*functionality+0.6*verification);
    }
    public double getTotal(double finalMark, double independentMark,double Viva){
        if(studentType.equals("Msc")){
            return(finalMark=0.25*independentMark+0.45*markAI+0.3*Viva);
        }
        else{
            return(finalMark=0.3*independentMark+0.7*markAI);
        }
    }
}
