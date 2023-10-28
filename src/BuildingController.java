import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildingController {

  private Map<String, List<Floor>> buildingFloorMap;

  BuildingController() {
    buildingFloorMap = new HashMap<>();
  }

  protected String addFloor() {
    return "new floor added";
  }

  protected List<Floor> getAllFloor(String buildingName) {
    return buildingFloorMap.get(buildingName);
  }
}
