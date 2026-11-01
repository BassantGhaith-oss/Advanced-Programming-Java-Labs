class Student{
    private String name;
    private int[] grades;
    Student(String name,int[] grades){
        this.name=name;
        this.grades=grades;
        double average = calculateAverage();
        if(average > TopStudentGrade){
            TopStudentGrade = average;
            TopStudentName = name;
        }
    }
    double calculateAverage(){
        int sum = 0;
        for(int i=0 ; i<grades.length ; i++){
            sum += grades[i] ;
        }
        return (double)sum/(grades.length);
    }
    String determineGrade(){
        double X = calculateAverage();
        if(X>=97){
            return "A+";
        }
        else if(X>=93){
            return "A";
        }
        else if(X>=89){
            return "A-";
        }
        else if(X>=85){
            return "B+";
        }
        else if(X>=80){
            return "B";
        }
        else if(X>=75){
            return "B-";
        }
        else if(X>=71){
            return "C+";
        }
        else if(X>=68){
            return "C";
        }
        else if(X>=65){
            return "C-";
        }
        else if(X>=63){
            return "D+";
        }
        else if(X>=60){
            return "D";
        }
        else{
            return "F";
        }
    }
    String getName(){
        return name;
    }
    static double TopStudentGrade =-1;
    static String TopStudentName;

    static String getTopStudentName(){
        return TopStudentName;
    }
}
public class Main{
    public static void main(String[] args){  
        Student s1 = new Student("Ahmed",new int[]{78,86,88,79,67});
        Student s2 = new Student("Essam",new int[]{70,80,80,70,60});
        Student s3 = new Student("Tariq",new int[]{85,95,95,85,75});

        System.out.println(s1.calculateAverage());
        System.out.println(s2.calculateAverage());
        System.out.println(s3.calculateAverage());

        System.out.println(s1.determineGrade());
        System.out.println(s2.determineGrade());
        System.out.println(s3.determineGrade());

        System.out.println(Student.getTopStudentName());
    }
}
