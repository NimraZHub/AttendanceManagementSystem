package entities;
public class Section {
    private String name;
    private String day;
    private String room;
    
    public Section(){
        
    }

    public Section(String name, String day, String room) {
        this.name = name;
        this.day = day;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
   
}
