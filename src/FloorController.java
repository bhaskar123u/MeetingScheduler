import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FloorController {
  
  private Map<String, List<MeetingRoom>> floorMeetingRoomMap;

  FloorController() {
    floorMeetingRoomMap = new HashMap<>();
  }

  protected String addFloor(Floor floor) {
    floorMeetingRoomMap.putIfAbsent(floor.getName(), new ArrayList<>());
    return "new floor " + floor.getName() + " added";
  }

  protected List<MeetingRoom> getAllMeetingRooms(String floorName, int capacity) {
    List<MeetingRoom> allMeetingRooms = floorMeetingRoomMap.get(floorName);

    return allMeetingRooms.stream().filter(room -> room.getCapacity() >= capacity)
        .collect(Collectors.toList());
  }
}
