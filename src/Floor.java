import java.util.ArrayList;
import java.util.List;

public class Floor {
  
  private String name;
  List<MeetingRoom> allRooms;

  Floor() {
  }

  public Floor(String name) {
    this.name = name;
    allRooms = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<MeetingRoom> getAllRooms() {
    return allRooms;
  }

  public void setAllRooms(List<MeetingRoom> allRooms) {
    this.allRooms = allRooms;
  }

  
}
