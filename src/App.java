import java.util.List;

public class App {
    static MeetingScheduler meetingScheduler;

    App() {
        meetingScheduler = new MeetingScheduler();
    }

    public static void main(String[] args) throws Exception {
        App newApp = new App();
        System.out.println(newApp.bookMeetingRoom());
    }

    public void init() {
        Building newbBuilding = new Building("b1");
        meetingScheduler.addBuilding(newbBuilding);

        Floor newFloor = new Floor("f1");
        meetingScheduler.addFloor(newFloor);

        MeetingRoom newMeetingRoom = new MeetingRoom("m1", newbBuilding, newFloor, 8);
        meetingScheduler.addMeetingRoom(newMeetingRoom);
    }

    public String bookMeetingRoom() {
        User newUser = new User("BS", "bs@gmail.com");
        List<Building> allbuildings = meetingScheduler.getAllBuildings();
        // selected a building b1
        Building newBuilding = new Building("b1");
        List<Floor> allFloors = meetingScheduler.getAllFloors(newBuilding);
        Floor newFloor = new Floor("f1");
        List<MeetingRoom> allMeetingRooms = meetingScheduler.getAllMeetingRooms(newFloor, 5);

        // if there is any room with desired capacity
        if (allMeetingRooms.size() > 0) {
            MeetingRoom newMeetingRoom = new MeetingRoom("m1", newBuilding, newFloor, 5);
            List<Pair<String, String>> allAvailableSlots = meetingScheduler.getAvailableSlots(newMeetingRoom);

            // we can select one slot out of all avalable slots
            Pair<String, String> newSlot = new Pair<String, String>("11", "2");
            return meetingScheduler.bookMeetingRoom(newUser, newBuilding, newFloor, newMeetingRoom, newSlot.getKey(),
                    newSlot.getValue());
        }
        
        return "Sorry no rooms available with desired capacity";
    }
}
