
import static java.lang.System.out;

public class Vehicles {
  public Vehicles() {}
  private StreetRacer sr = new StreetRacer();
  private Jet jet = new Jet();

  public static void main(String[] args) {

    Vehicles v = new Vehicles();
    v.sr.go();
    v.jet.go();
    v.jet.setGoAlgorithm(new GoByDrivingAlgorithm());
    v.jet.go();



  }

// ***Go_ALGORITHM
  public interface GoAlgorithm {
    public void go();
  }

  public static class GoByDrivingAlgorithm implements GoAlgorithm {
    @Override
    public void go() { out.println("now Im drivin"); }
  }

  public class GoByFlyingAlgorithm implements GoAlgorithm {
    public void go() { out.println("now Im FLYing"); }
  }

  public class GoByFlyingFastAlgorithm implements GoAlgorithm {
    public void go() { out.println("now Im FLYing FAST"); }
  }

// CLASSES
  private abstract class Vehicle {
    //
    private GoAlgorithm goAlgorithm;
    public Vehicle() {}
    public void setGoAlgorithm (GoAlgorithm algorithm) { goAlgorithm = algorithm; }

    public void go() { goAlgorithm.go(); }
  }

  private class StreetRacer extends Vehicle {
    public StreetRacer() {
      setGoAlgorithm(new GoByDrivingAlgorithm());
    }
  }

  private class Jet extends Vehicle {
    public Jet() {
      setGoAlgorithm(new GoByFlyingFastAlgorithm());
    }
  }
}
