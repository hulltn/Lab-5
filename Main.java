class Main {
  public static void main(String[] args) {
    
   
    Student student1 = new Student();
    
   
    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");
  
    Student.print();
    System.out.println(student1.getName());
    System.out.println(student1.getGPA());
    System.out.println(student1.getMajor());

    
    
    Student student2 = new Student();
    
    student2.setName("Tiernan Hull");
    student2.setGPA(4.3);
    student2.setMajor("Information Systems");

    Student.print();
    System.out.println(student1.getName());
    System.out.println(student1.getGPA());
    System.out.println(student1.getMajor());
    //literally every method I tried to get these to work in the student.java file failed. It kept telling me that it couldn't find the variable
    }
      
}
