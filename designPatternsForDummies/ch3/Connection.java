
public abstract class Connection   {
  public  Connection() {  }
  public String description() { return "generic"; }
}

class OracleConnection extends Connection {
  public OracleConnection () {
  }
  public String description() {
    return "ORACLE";
  }
}

 class SqlServerConnection extends Connection {
  public SqlServerConnection () {}

  @Override
  public String description() {
    return "SQL SERV";
  }
}
