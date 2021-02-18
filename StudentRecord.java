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

    /**
     * @return The final, weighted overall score for a module.
     */
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

    /**
     * @return boolean value for if the student's score is above the module's average score.
     */

    public boolean calcIfAverage(){
        double moduleAverage = this.module.getFinalAverageGrade();
        if(this.finalScore >= moduleAverage){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Get/Set attributes.
     */
    public String getMarks(){
        String markString = Arrays.toString(this.marks);
        return markString;
    }
    public Module getModule() {
        return module;
    }
}
