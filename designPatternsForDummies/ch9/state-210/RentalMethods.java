import java.util.*;
import java.lang.Math;

public class RentalMethods {
  final static int FULLY_RENTED = 0;
  final static int WAITING = 1;
  final static int GOT_APPLICATION = 2;
  final static int APARTMENT_RENTED = 3;
  Random random;
  int numberApartments;
  int state = WAITING;

  public RentalMethods(int n) {
    numberApartments = n;
    random = new Random(System.currentTimeMillis());
  }

   public void getApplication() {
     switch (state) {
      case FULLY_RENTED:
       System.out.println("FULLY_RENTED");
       break;
      case WAITING:
       state = GOT_APPLICATION;
       System.out.println("thanks for the app brah");
       break;
      case GOT_APPLICATION:
       System.out.println("already got it mate");
       break;
      case APARTMENT_RENTED:
        System.out.println("hang on chachi, were rentin");
  	    break;
      }
    } // getApplication method

    public void rentApartment() {
      switch (state) {
        case FULLY_RENTED:
          System.out.println("FULLY_RENTED");break;
        case WAITING:
          System.out.println("submt an app");break;
        case GOT_APPLICATION:
          System.out.println("you must have application checked");break;
      }
    }

    public void checkApplication() {
      int yesno = random.nextInt() % 10;

      switch (state) {
        case FULLY_RENTED:
          System.out.println("ITs FULLY_RENTED");break;
        case WAITING:
          System.out.println("Since waiting, submit an getApplication");
          break;
        case GOT_APPLICATION:
          if (yesno > 4 && numberApartments > 0 ) {
            System.out.println("congrats approved");
            state = APARTMENT_RENTED;
            rentApartment();
          } else {
            System.out.println("sorry not approved");
            state = WAITING;
          }
          break;
          case APARTMENT_RENTED:
            System.out.println("hang on, reinting");break;
      }
    } // end method-checkApplication

    public static void main(String[] args) {
      TestRentalMethods t = new TestRentalMethods();
    }
} // RentalMethods EOF

class TestRentalMethods {
  RentalMethods rentalMethods;

  public TestRentalMethods () {
    rentalMethods = new RentalMethods( 4 );
    rentalMethods.getApplication();
    rentalMethods.checkApplication();
  }
}
