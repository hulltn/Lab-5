import java.util.ArrayList;


class Main {
  public static void main(String[] args) {
    
   
    Student student1 = new Student();
    
   
    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");
    student1.getName();
  
    Student.print();
    System.out.println(student1.getName());
    System.out.println(student1.getGPA());
    System.out.println(student1.getMajor());

    
    
    Student student2 = new Student();
    
    student2.setName("Tiernan Hull");
    student2.setGPA(4.3);
    student2.setMajor("Information Systems");

    Student.print();
    System.out.println(student2.getName());
    System.out.println(student2.getGPA());
    System.out.println(student2.getMajor());
    //literally every method I tried to get these to work in the student.java file failed. It kept telling me that it couldn't find the variable
    ArrayList<Double> gpas = new ArrayList<Double>();
    gpas.add(4.0);
    gpas.add(4.3);
    double sum = 0;
    
    for (Double i : gpas) {
      sum += i;
      
      
    }
    double average = sum; 
      average = sum/gpas.size();
      System.out.println("The average GPA is " + average);
    }
      
}
