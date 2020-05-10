




public class TestConnection {

  public static void main(String[] args) {

    FirstFactory factory; // this is only factory needed for all connections

    factory = new FirstFactory("oracle");
    Connection connection = factory.createConnection();
    System.out.println("youre connecting with " + connection.description());
    // ... create a bunch more oracle connections, make Lawrence Ellison richer

    factory = new FirstFactory("sqlserver");
    Connection conn2 = factory.createConnection();
    System.out.println("youre connecting with " + conn2.description());
    // crank out a bajillion sql server conns, make Gates and Ballmer richer

    // this one should fail:
    factory = new FirstFactory("AmishLuddites"); // Amish Luddites tend not to make database connections
    Connection connAmish = factory.createConnection();
    System.out.println("youre connecting with " + connAmish.description());
    // this fails, so the Amish Luddites go back to Dutch Pennsylvania to milk cows and make
    // wicker chairs, which is what they wanted to do in the first place.
  }
}
