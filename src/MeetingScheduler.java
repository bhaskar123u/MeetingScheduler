import java.util.ArrayList;
import java.util.List;

public class MeetingScheduler {
  
  private BuildingController buildingController;
  private FloorController floorController;
  private MeetingRoomController meetingRoomController;
  private List<Building> allBuildings;

  MeetingScheduler() {
    buildingController = new BuildingController();
    floorController = new FloorController();
    meetingRoomController = new MeetingRoomController();
    allBuildings = new ArrayList<>();
  }

  // add building
  protected void addBuilding(Building building) {
    allBuildings.add(building);
  }

  // add floor
  protected String addFloor(Floor floor) {
    return floorController.addFloor(floor);
  }

  // add meetingRoom
  protected String addMeetingRoom(MeetingRoom meetingRoom) {
    return meetingRoomController.addMeetingRoom(meetingRoom);
  }

  // get all building
  protected List<Building> getAllBuildings() {
    return allBuildings;
  }

  // get all floors
  protected List<Floor> getAllFloors(Building building) {
    return buildingController.getAllFloor(building.getName());
  }

  // get all meetingRooms
  protected List<MeetingRoom> getAllMeetingRooms(Floor floor, int capacity) {
    return floorController.getAllMeetingRooms(floor.getName(), capacity);
  }

  // get slots for a meetingRoom
  protected List<Pair<String, String>> getAvailableSlots(MeetingRoom meetingRoom) {
    return meetingRoomController.getAvailableSlots(meetingRoom.getName());
  }

  // book meetingRoom
  protected String bookMeetingRoom(User user, Building building, Floor floor, MeetingRoom meetingRoom, String startTime, String endTime) {
    return meetingRoomController.bookSlot(user, building, floor, meetingRoom, startTime, endTime);
  }

  // cancel booking
  protected void cancelBooking(Booking booking) {
    
  }
}
