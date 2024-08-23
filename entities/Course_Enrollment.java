package entities;
public class Course_Enrollment {
    private String date;
    private String time;
    private String c_code;
    private String sid;
    private String status;
    
    public Course_Enrollment(){
        
    }

    public Course_Enrollment(String date, String time, String c_code, String sid, String status) {
        this.date = date;
        this.time = time;
        this.c_code = c_code;
        this.sid = sid;
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getC_code() {
        return c_code;
    }

    public void setC_code(String c_code) {
        this.c_code = c_code;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
}
