import java.util.ArrayList;
import java.util.List;

public class Building {
  
  private String name;
  private List<Floor> allFloors;

  Building() {
  }

  public Building(String name) {
    this.name = name;
    allFloors = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Floor> getAllFloors() {
    return allFloors;
  }

  public void setAllFloors(List<Floor> allFloors) {
    this.allFloors = allFloors;
  }

  
}
