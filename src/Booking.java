public class Booking {

  private User user;
  private MeetingRoom meetingRoom;
  private String startTime;
  private String endTime;

  Booking() {
  }

  public Booking(User user, MeetingRoom meetingRoom, String startTime, String endTime) {
    this.user = user;
    this.meetingRoom = meetingRoom;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public MeetingRoom getMeetingRoom() {
    return meetingRoom;
  }

  public void setMeetingRoom(MeetingRoom meetingRoom) {
    this.meetingRoom = meetingRoom;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  
  
}
