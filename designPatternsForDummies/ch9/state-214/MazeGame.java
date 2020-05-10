import java.util.ArrayList;

public abstract class MazeGame {
  private final ArrayList<Room> listOfRooms = new ArrayList<>();
  public MazeGame() {}
  abstract protected Room makeRoom(); // FACTORY_METHOD
}

class MazeGame1 extends MazeGame {
  @Override
  protected Room makeRoom() { return new MagicRoom(); }
}



abstract class Room {}

class MagicRoom extends Room {}
