package UoK;

public class University {

    // Attributes
    
    private ModuleDescriptor[] moduleDescriptors;
    private Student[] students;
    private Module[] modules;

    // Constructor
    
    public University(ModuleDescriptor[] moduleDescriptors,
            Student[] students,
            Module[] modules){
        this.moduleDescriptors = moduleDescriptors;
        this.students = students;
        this.modules = modules;
    }

    // Methods

    /**
     * @return The number of students registered in the system.
     */
    public int getTotalNumberStudents() {
        int count = 0;
        count = this.students.length;
        count = count++;
        return count;
    }

    /**
     * @return The student with the highest GPA.
     */
    public Student getBestStudent() {
        double topGPA = 0;
        Student topStudent = this.students[0];
        for (Student student : this.students) {
            double gpa = student.getGPA();
            if(gpa > topGPA){
                topGPA = gpa;
                topStudent = student;
            }
        }
        return topStudent;
    }

    /**
     * @return The module with the highest average score.
     */
    public String getBestModule() {
        double topAverage = 0;
        Module topModule = this.modules[0];
        for (Module module : this.modules) {
            double average = module.getFinalAverageGrade();
            if(average > topAverage){
                topAverage = average;
                topModule = module;
            }
        }
        return topModule.getName();
    }

    public static void main(String[] args) {

        /**
         * Creating objects from provided data.
         */

        // ModuleDescriptor objects

        ModuleDescriptor[] moduleDescriptors = new ModuleDescriptor[6];

        double weightsECM0002[] = {0.1,0.3,0.6};
        ModuleDescriptor ECM0002Descriptor = new ModuleDescriptor("ECM0002", "Real World Mathematics", weightsECM0002);
        moduleDescriptors[0] = ECM0002Descriptor;
        double weightsECM1400[] = {0.1,0.3,0.6};
        ModuleDescriptor ECM1400Descriptor = new ModuleDescriptor("ECM1400", "Programming", weightsECM1400);
        moduleDescriptors[1] = ECM1400Descriptor;
        double weightsECM1406[] = {0.25,0.25,0.5};
        ModuleDescriptor ECM1406Descriptor = new ModuleDescriptor("ECM1406", "Data Structures", weightsECM1406);
        moduleDescriptors[2] = ECM1406Descriptor;
        double weightsECM1410[] = {0.25,0.25,0.5};
        ModuleDescriptor ECM1410Descriptor = new ModuleDescriptor("ECM1410", "Object-Oriented Programming", weightsECM1410);
        moduleDescriptors[3] = ECM1410Descriptor;
        double weightsBEM2027[] = {0.1,0.3,0.3,0.3};
        ModuleDescriptor BEM2027Descriptor = new ModuleDescriptor("BEM2027", "Information Systems", weightsBEM2027);
        moduleDescriptors[4] = BEM2027Descriptor;
        double weightsPHY2023[] = {0.4,0.6};
        ModuleDescriptor PHY2023Descriptor = new ModuleDescriptor("PHY2023", "Thermal Physics", weightsPHY2023);
        moduleDescriptors[5] = PHY2023Descriptor;

        // Student Objects
        // Using 'temp' StudentRecord array as the actual records haven't been created yet
        StudentRecord[] temp = new StudentRecord[0];

        char f = 'F';
        char m = 'M';
        char x = 'x';
        Student S1000 = new Student(1000, "Ana", f, temp);
        Student S1001 = new Student(1001, "Oliver", m, temp);
        Student S1002 = new Student(1002, "Mary", f,temp);
        Student S1003 = new Student(1003, "John", m, temp);
        Student S1004 = new Student(1004, "Noah", m, temp);
        Student S1005 = new Student(1005, "Chico", m, temp);
        Student S1006 = new Student(1006, "Maria", f, temp);
        Student S1007 = new Student(1007, "Mark", x, temp);
        Student S1008 = new Student(1008, "Lia", f, temp);
        Student S1009 = new Student(1009, "Rachel", f, temp);


        // Module Objects

        byte term = 1;
        // Temp records array as they haven't been created yet
        Module ECM1400_2019T1 = new Module(2019, term, ECM1400Descriptor, temp);
        Module PHY2023_2019T1 = new Module(2019, term, PHY2023Descriptor, temp);
        Module ECM1406_2020T1 = new Module(2020, term, ECM1406Descriptor, temp);
        Module ECM1410_2020T1 = new Module(2020, term, ECM1410Descriptor, temp);
        term = 2;
        Module BEM2027_2019T2 = new Module(2019, term, BEM2027Descriptor, temp);
        Module ECM1400_2019T2 = new Module(2019, term, ECM1400Descriptor, temp);
        Module ECM0002_2020T2 = new Module(2020, term, ECM0002Descriptor, temp);

        // StudentRecord Objects

        double ECM1400_2019T1_1000[] = {9 ,10, 10, 10};
        double BEM2027_2019T2_1000[] = {10 ,10, 9.5, 10};
        double ECM1406_2020T1_1000[] = {10 ,10, 10};
        double ECM1410_2020T1_1000[] = {10 ,9, 10};

        StudentRecord ECM1400_1000 = new StudentRecord(S1000, ECM1400_2019T1, ECM1400_2019T1_1000);
        StudentRecord BEM2027_1000 = new StudentRecord(S1000, BEM2027_2019T2, BEM2027_2019T2_1000);
        StudentRecord ECM1406_1000 = new StudentRecord(S1000, ECM1406_2020T1, ECM1406_2020T1_1000);
        StudentRecord ECM1410_1000 = new StudentRecord(S1000, ECM1410_2020T1, ECM1410_2020T1_1000);

        StudentRecord[] Records_1000 = {ECM1400_1000, BEM2027_1000, ECM1406_1000,ECM1410_1000};
        S1000.setRecords(Records_1000);

        double ECM1400_2019T1_1001[] = {8, 8, 8, 9};
        double BEM2027_2019T2_1001[] = {7, 8.5, 8.2, 8};
        double ECM1406_2020T1_1001[] = {8, 7.5, 7.5};
        double ECM1410_2020T1_1001[] = {8.5,9,7.5};

        StudentRecord ECM1400_1001 = new StudentRecord(S1001, ECM1400_2019T1, ECM1400_2019T1_1001);
        StudentRecord BEM2027_1001 = new StudentRecord(S1001, BEM2027_2019T2, BEM2027_2019T2_1001);
        StudentRecord ECM1406_1001 = new StudentRecord(S1001, ECM1406_2020T1, ECM1406_2020T1_1001);
        StudentRecord ECM1410_1001 = new StudentRecord(S1001, ECM1410_2020T1, ECM1410_2020T1_1001);

        StudentRecord[] Records_1001 = {ECM1400_1001, BEM2027_1001, ECM1406_1001, ECM1410_1001};
        S1001.setRecords(Records_1001);

        double ECM1400_2019T1_1002[] = {5,5,6,5};
        double BEM2027_2019T2_1002[] = {6.5,7.0,5.5,8.5};
        double ECM1406_2020T1_1002[] = {9,7,7};
        double ECM1410_2020T1_1002[] = {10,10,5.5};

        StudentRecord ECM1400_1002 = new StudentRecord(S1002, ECM1400_2019T1, ECM1400_2019T1_1002);
        StudentRecord BEM2027_1002 = new StudentRecord(S1002, BEM2027_2019T2, BEM2027_2019T2_1002);
        StudentRecord ECM1406_1002 = new StudentRecord(S1002, ECM1406_2020T1, ECM1406_2020T1_1002);
        StudentRecord ECM1410_1002 = new StudentRecord(S1002, ECM1410_2020T1, ECM1410_2020T1_1002);

        StudentRecord[] Records_1002 = {ECM1400_1002, BEM2027_1002, ECM1406_1002, ECM1410_1002};
        S1002.setRecords(Records_1002);

        double ECM1400_2019T1_1003[] = {6,4,7,9};
        double BEM2027_2019T2_1003[] = {5.5,5,6.5,7};
        double ECM1406_2020T1_1003[] = {9,8,7};
        double ECM1410_2020T1_1003[] = {7,7,7};

        StudentRecord ECM1400_1003 = new StudentRecord(S1003, ECM1400_2019T1, ECM1400_2019T1_1003);
        StudentRecord BEM2027_1003 = new StudentRecord(S1003, BEM2027_2019T2, BEM2027_2019T2_1003);
        StudentRecord ECM1406_1003 = new StudentRecord(S1003, ECM1406_2020T1, ECM1406_2020T1_1003);
        StudentRecord ECM1410_1003 = new StudentRecord(S1003, ECM1410_2020T1, ECM1410_2020T1_1003);

        StudentRecord[] Records_1003 = {ECM1400_1003, BEM2027_1003, ECM1406_1003, ECM1410_1003};
        S1003.setRecords(Records_1003);

        double ECM1400_2019T1_1004[] = {10,9,10,9};
        double BEM2027_2019T2_1004[] = {7,5,8,6};
        double ECM1406_2020T1_1004[] = {2,7,7};
        double ECM1410_2020T1_1004[] = {5,6,10};

        StudentRecord ECM1400_1004 = new StudentRecord(S1004, ECM1400_2019T1, ECM1400_2019T1_1004);
        StudentRecord BEM2027_1004 = new StudentRecord(S1004, BEM2027_2019T2, BEM2027_2019T2_1004);
        StudentRecord ECM1406_1004 = new StudentRecord(S1004, ECM1406_2020T1, ECM1406_2020T1_1004);
        StudentRecord ECM1410_1004 = new StudentRecord(S1004, ECM1410_2020T1, ECM1410_2020T1_1004);

        StudentRecord[] Records_1004 = {ECM1400_1004, BEM2027_1004, ECM1406_1004, ECM1410_1004};
        S1004.setRecords(Records_1004);

        double PHY2023_2019T1_1005[] = {9,9};
        double ECM1400_2019T2_1005[] = {9 ,10, 10, 10};
        double ECM1406_2020T1_1005[] = {10 ,10, 10};
        double ECM0002_2020T2_1005[] = {8 ,9, 8};

        StudentRecord PHY2023_1005 = new StudentRecord(S1005, PHY2023_2019T1, PHY2023_2019T1_1005);
        StudentRecord ECM1400_1005 = new StudentRecord(S1005, ECM1400_2019T2, ECM1400_2019T2_1005);
        StudentRecord ECM1406_1005 = new StudentRecord(S1005, ECM1406_2020T1, ECM1406_2020T1_1005);
        StudentRecord ECM0002_1005 = new StudentRecord(S1005, ECM0002_2020T2, ECM0002_2020T2_1005);

        StudentRecord[] Records_1005 = {PHY2023_1005, ECM1400_1005, ECM1406_1005, ECM0002_1005};
        S1005.setRecords(Records_1005);

        double PHY2023_2019T1_1006[] = {6, 9};
        double ECM1400_2019T2_1006[] = {8, 8, 8, 9};
        double ECM1406_2020T1_1006[] = {8, 7.5, 7.5};
        double ECM0002_2020T2_1006[] = {6.5,9,9.5};

        StudentRecord PHY2023_1006 = new StudentRecord(S1006, PHY2023_2019T1, PHY2023_2019T1_1006);
        StudentRecord ECM1400_1006 = new StudentRecord(S1006, ECM1400_2019T2, ECM1400_2019T2_1006);
        StudentRecord ECM1406_1006 = new StudentRecord(S1006, ECM1406_2020T1, ECM1406_2020T1_1006);
        StudentRecord ECM0002_1006 = new StudentRecord(S1006, ECM0002_2020T2, ECM0002_2020T2_1006);

        StudentRecord[] Records_1006 = {ECM1400_1006, ECM1406_1006, ECM0002_1006};
        S1006.setRecords(Records_1006);

        double PHY2023_2019T1_1007[] = {5, 6};
        double ECM1400_2019T2_1007[] = {5,5,6,5};
        double ECM1406_2020T1_1007[] = {10,10,10};
        double ECM0002_2020T2_1007[] = {8.5,10,8.5};

        StudentRecord PHY2023_1007 = new StudentRecord(S1007, PHY2023_2019T1, PHY2023_2019T1_1007);
        StudentRecord ECM1400_1007 = new StudentRecord(S1007, ECM1400_2019T2, ECM1400_2019T2_1007);
        StudentRecord ECM1406_1007 = new StudentRecord(S1007, ECM1406_2020T1, ECM1406_2020T1_1007);
        StudentRecord ECM0002_1007 = new StudentRecord(S1007, ECM0002_2020T2, ECM0002_2020T2_1007);

        StudentRecord[] Records_1007 = {PHY2023_1007, ECM1400_1007, ECM1406_1007, ECM0002_1007};
        S1007.setRecords(Records_1007);

        double PHY2023_2019T1_1008[] = {9, 7};
        double ECM1400_2019T2_1008[] = {6,4,7,9};
        double ECM1406_2020T1_1008[] = {9,8,7};
        double ECM0002_2020T2_1008[] = {7.5,8,10};

        StudentRecord PHY2023_1008 = new StudentRecord(S1008, PHY2023_2019T1, PHY2023_2019T1_1008);
        StudentRecord ECM1400_1008 = new StudentRecord(S1008, ECM1400_2019T2, ECM1400_2019T2_1008);
        StudentRecord ECM1406_1008 = new StudentRecord(S1008, ECM1406_2020T1, ECM1406_2020T1_1008);
        StudentRecord ECM0002_1008 = new StudentRecord(S1008, ECM0002_2020T2, ECM0002_2020T2_1008);

        StudentRecord[] Records_1008 = {PHY2023_1008, ECM1400_1008, ECM1406_1008, ECM0002_1008};
        S1008.setRecords(Records_1008);

        double PHY2023_2019T1_1009[] = {8, 5};
        double ECM1400_2019T2_1009[] = {10,9,8,9};
        double ECM1406_2020T1_1009[] = {8,9,10};
        double ECM0002_2020T2_1009[] = {10, 6, 10};

        StudentRecord PHY2023_1009 = new StudentRecord(S1009, PHY2023_2019T1, PHY2023_2019T1_1009);
        StudentRecord ECM1400_1009 = new StudentRecord(S1009, ECM1400_2019T2, ECM1400_2019T2_1009);
        StudentRecord ECM1406_1009 = new StudentRecord(S1009, ECM1406_2020T1, ECM1406_2020T1_1009);
        StudentRecord ECM0002_1009 = new StudentRecord(S1009, ECM0002_2020T2, ECM0002_2020T2_1009);

        StudentRecord[] Records_1009 = {PHY2023_1009, ECM1400_1009, ECM1406_1009, ECM0002_1009};
        S1009.setRecords(Records_1009);

        Student[] students = {S1000, S1001, S1002, S1003, S1004, S1005, S1006, S1007, S1008, S1009};

        // Adding student records to module objects

        StudentRecord[] ECM1400_2019T1Records = {ECM1400_1000, ECM1400_1001, ECM1400_1002, ECM1400_1003, ECM1400_1004};
        StudentRecord[] PHY2023_2019T1Records = {PHY2023_1005, PHY2023_1006, PHY2023_1007, PHY2023_1008, PHY2023_1009};
        StudentRecord[] BEM2027_2019T2Records = {BEM2027_1000, BEM2027_1001, BEM2027_1002, BEM2027_1003, BEM2027_1004};
        StudentRecord[] ECM1400_2019T2Records = {ECM1400_1005, ECM1400_1006, ECM1400_1007, ECM1400_1008, ECM1400_1009};
        StudentRecord[] ECM1406_2020T1Records = {ECM1406_1000, ECM1400_1001, ECM1406_1002, ECM1406_1003, ECM1406_1004
                ,ECM1406_1005, ECM1406_1006, ECM1406_1007, ECM1406_1008, ECM1406_1009};
        StudentRecord[] ECM1410_2020T1Records = {ECM1410_1000, ECM1410_1001, ECM1410_1002, ECM1410_1003, ECM1410_1004};
        StudentRecord[] ECM0002_2020T2Records = {ECM0002_1005, ECM0002_1006, ECM0002_1007, ECM0002_1008, ECM0002_1009};

        ECM1400_2019T1.setRecords(ECM1400_2019T1Records);
        PHY2023_2019T1.setRecords(PHY2023_2019T1Records);
        BEM2027_2019T2.setRecords(BEM2027_2019T2Records);
        ECM1400_2019T2.setRecords(ECM1400_2019T2Records);
        ECM1406_2020T1.setRecords(ECM1406_2020T1Records);
        ECM1410_2020T1.setRecords(ECM1410_2020T1Records);
        ECM0002_2020T2.setRecords(ECM0002_2020T2Records);

        Module[] modules = {ECM1400_2019T1, PHY2023_2019T1, BEM2027_2019T2, ECM1400_2019T2, ECM1406_2020T1
                , ECM1410_2020T1, ECM0002_2020T2};

        // Creating university object

        University university;
        university = new University(moduleDescriptors, students, modules);

        /**
        *Testing main methods
         */

        /*// Print Reports
        System.out.println("The UoK has " + university.getTotalNumberStudents() + " students.");

        // best module
        System.out.println("The best module is:");
        System.out.println(university.getBestModule());

        // best student
        System.out.println("The best student is:");
        System.out.println(university.getBestStudent().printTranscript());*/
    }
}
