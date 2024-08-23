package entities;
public class Attendance {
    private String attendance_mark; // present or absent
    private String date;
    private String time;
    
    public Attendance(){
        
    }

    public Attendance(String attendance_mark, String date, String time) {
        this.attendance_mark = attendance_mark;
        this.date = date;
        this.time = time;
    }

    public String getAttendance_mark() {
        return attendance_mark;
    }

    public void setAttendance_mark(String attendance_mark) {
        this.attendance_mark = attendance_mark;
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
   
}
