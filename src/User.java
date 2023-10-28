import java.util.ArrayList;
import java.util.List;

public class User {

  private String name;
  private String email;
  private List<Booking> allBooking;

  User() {
  }

  public User(String name, String email) {
    this.name = name;
    this.email = email;
    this.allBooking = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Booking> getAllBooking() {
    return allBooking;
  }

  public void setAllBooking(List<Booking> allBooking) {
    this.allBooking = allBooking;
  }

  protected void addBooking(Booking booking) {
    allBooking.add(booking);
  }

  protected void removeBooking(Booking booking) {
    allBooking.remove(booking);
  }

  protected List<Booking> viewAllBookings() {
    return allBooking;
  }
  
}
