package UoK;

public class ModuleDescriptor {
    
    // Attributes
    
    private String code;
    private String name;
    private double[] continuousAssignmentWeights;
    
    // Constructor
    
    public ModuleDescriptor(String code,
            String name,
            double[] continuousAssignmentWeights){
        this.code = code;
        this.name = name;
        this.continuousAssignmentWeights = continuousAssignmentWeights;
    }

    // Methods

    public String getName() {
        return this.name;
    }

    public double[] getContinuousAssignmentWeights(){
        return this.continuousAssignmentWeights;
    }
}
