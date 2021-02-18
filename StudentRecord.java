package UoK;

import java.util.*;

public class StudentRecord {
    
    // Attributes
    
    private Student student;
    private Module module;
    private double[] marks;
    private double finalScore;
    private Boolean isAboveAverage;
    
    // Constructor
    
    public StudentRecord(Student student,
            Module module,
            double[] marks){
        this.student = student;
        this.module = module;
        this.marks = marks;
        this.finalScore = calcFinalScore();
        this.isAboveAverage = calcIfAverage();
    }

    // Methods

    public String getMarks(){
        String markString = Arrays.toString(this.marks);
        return markString;
    }

    public double calcFinalScore(){
        int i = 0;
        double[] weights = module.getContinuousAssignmentWeights();
        double weightedGrade = 0;
        for (double weight : weights) {
            weightedGrade += (weight*marks[i]);
            i++;
        }
        return weightedGrade;
    }

    public Module getModule() {
        return module;
    }

    public boolean calcIfAverage(){
        double moduleAverage = this.module.getFinalAverageGrade();
        if(this.finalScore >= moduleAverage){
            return true;
        } else{
            return false;
        }
    }
	
}
