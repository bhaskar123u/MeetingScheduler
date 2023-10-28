public class MeetingRoom {
  
  private String name;
  private Building building;
  private Floor floor;
  private int capacity;

  MeetingRoom() {
  }

  public MeetingRoom(String name, Building building, Floor floor, int capacity) {
    this.name = name;
    this.building = building;
    this.floor = floor;
    this.capacity = capacity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Building getBuilding() {
    return building;
  }

  public void setBuilding(Building building) {
    this.building = building;
  }

  public Floor getFloor() {
    return floor;
  }

  public void setFloor(Floor floor) {
    this.floor = floor;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }
}
