
package entities;

public class Course {
     private String c_code; // primary key
    private String name;
public Course(){

}
 public Course(String c_code, String name) {
        this.c_code = c_code;
        this.name = name;
    }

    // Getters and Setters
    public String getC_code() {
        return c_code;
    }

    public void setC_code(String c_code) {
        this.c_code = c_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

