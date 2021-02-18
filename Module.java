package UoK;

public class Module {
    
    // Attributes
    
    private int year;
    private byte term;
    private ModuleDescriptor module;
    private StudentRecord[] records;
    private double finalAverageGrade;
    
    // Constructor
    
    public Module(int year, 
            byte term, 
            ModuleDescriptor module, 
            StudentRecord[] records){
        this.year = year;
        this.term = term;
        this.module = module;
        this.records = records;
        this.finalAverageGrade = getFinalAverageGrade();
        }

    // Methods

    /**
     * @return The average grade for a module.
     */
    public double getFinalAverageGrade() {
        double[] weights = this.module.getContinuousAssignmentWeights();
        int i = 0;
        double totalScore = 0;
        for (StudentRecord record : records) {
            totalScore += record.calcFinalScore();
            i++;
        }
        double averageGrade = totalScore/i;
        this.finalAverageGrade = averageGrade;
        return finalAverageGrade;
    }

    /**
     * Get/Set attributes.
     */
    public String getName(){
        return this.module.getName();
    }

    public double[] getContinuousAssignmentWeights(){
        return this.module.getContinuousAssignmentWeights();
    }

    public int getYear(){
        return this.year;
    }

    public byte getTerm() {
        return term;
    }

    public void setRecords(StudentRecord[] records){
        this.records = records;
    }

}
