


public class FirstFactory {
  protected String type;
  public FirstFactory(String t) {
    System.out.println("Creating factory of type = " + t);
    type = t; }

  public Connection createConnection() {
    if (type.equals("oracle")) return new OracleConnection();
    if (type.equals("sqlserver")) return new SqlServerConnection();
  return null;
    }
}

/*
public class FactoryTest {
  FirstFactory factory = new FirstFactory("oracle");
}

*/
