class TestRentalMethods {
  RentalMethods rentalMethods;

  public TestRentalMethods () {
    rentalMethods = new RentalMethods( 4 );
    rentalMethods.getApplication();
    rentalMethods.checkApplication();
  }
}
