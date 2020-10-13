class Student {
    String name;
    double gpa;
    String major;
    

    String getName() {
      return name;
    }

    double getGPA() {
      return gpa;
    }

    String getMajor() {
      return major;
    }

    
    void setName(String theName) {
      name = theName;
    }

    void setGPA(double theGPA) {
      gpa = theGPA;
    }

    void setMajor(String theMajor) {
      major = theMajor;
    }
    public static void print() {
      System.out.println("The students Name is" + getName());
      System.out.println("The students GPA is");
      System.out.println("The students Major is"); 
      
    }
  }
