import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeetingRoomController {
  
  // meetingRoomName, slots
  private Map<String, List<Pair<String, String>>> availableSlots;
  private Map<String, List<Pair<String, String>>> bookedSlots;

  MeetingRoomController() {
    availableSlots = new HashMap<>();
    bookedSlots = new HashMap<>();
  }

  protected List<Pair<String, String>> getAvailableSlots(String meetingRoomName) {
    return availableSlots.get(meetingRoomName);
  }

  protected String addMeetingRoom(MeetingRoom meetingRoom) {
    List<Pair<String, String>> allTimings = new ArrayList<>();
    allTimings.add(new Pair<String, String>("10", "11"));
    allTimings.add(new Pair<String, String>("11", "12"));
    allTimings.add(new Pair<String, String>("12", "13"));
    allTimings.add(new Pair<String, String>("13", "14"));
    allTimings.add(new Pair<String, String>("14", "15"));
    allTimings.add(new Pair<String, String>("15", "16"));
    allTimings.add(new Pair<String, String>("16", "17"));
    availableSlots.putIfAbsent(meetingRoom.getName(), allTimings);
    return "meetingRoom " + meetingRoom.getName() + " added";
  }

  protected String bookSlot(User user, Building building, Floor floor, MeetingRoom meetingRoom, String startTime, String endTime) {
    List<Pair<String, String>> availableSlot = availableSlots.get(meetingRoom.getName());
    availableSlot.remove(new Pair<String,String>(startTime, endTime));
    
    List<Pair<String, String>> bookedSlot = bookedSlots.get(meetingRoom.getName());
    bookedSlot.add(new Pair<String, String>(startTime, endTime));
    
    // create booking object
    Booking booking = new Booking(user, meetingRoom, startTime, endTime);

    // add booking in user list
    user.addBooking(booking);

    return "bookingDetails " + user.getName() + " " + building.getName() + " " + floor.getName() + " "
        + meetingRoom.getName() + " " + startTime + " " + endTime;
  }
  
}
