package UoK;

public class Student {
    
    // Attributes
    
    private int id;
    private String name;
    private char gender;
    private double gpa;
    private StudentRecord[] records;

    // Constructor
    
    public Student(int id, 
            String name, 
            char gender, 
            StudentRecord[] records){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.gpa = calculateGPA(records);
        this.records = records;
    }
    
    // Methods

    public void setRecords(StudentRecord[] records){
        this.records = records;
        this.gpa = calculateGPA(records);
    }

    public double getGPA(){
        return this.gpa;
    }

    public double calculateGPA(StudentRecord[] records){
        int countModules = 0;
        int total = 0;
        for (StudentRecord module : records) {
            total += module.calcFinalScore();
            countModules++;
        }
        if (countModules < 1){
            this.gpa = 0;
        } else{
            this.gpa = total/countModules;
        }
        return gpa;
    }

    public int getID(){
        return this.id;
    }

    public String printTranscript() {
        String formattedString = "University of Knowledge - Official Transcript" +
                "\n" +
                "\n" +
                "ID: " + this.getID() + "\n" +
                "Name: " + this.name + "\n" +
                "GPA: " + this.gpa + "\n" +
                "\n";
        formattedString += String.format("|%-5s|", "Year") +
                String.format("%-5s|", "Term") +
                String.format("%-30s|", "Module Name") +
                String.format("%-25s|", "Module Marks") +
                "\n";

        for (int i = 0; i < records.length; i++){
            formattedString += String.format("|%-5s|", records[i].getModule().getYear()) +
                    String.format("%-5s|", records[i].getModule().getTerm()) +
                    String.format("%-30s|", records[i].getModule().getName()) +
                    String.format("%-25s|", records[i].getMarks()) +
                    "\n";
        }

        return formattedString;
    }

}
