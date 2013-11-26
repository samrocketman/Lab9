import junit.framework.*;

public class gIntTest extends TestCase
{
  private gInt num1;
  private gInt num2;
  public gIntTest( String name ) {
    super( name );
  }
  protected void setUp() {
    num1 = new gInt(5,7);
    num2 = new gInt(2,3);
  }
  public void testAdd() {
    gInt result = num1.add( num2 );
    Assert.assertEquals( 7, result.real() );
    Assert.assertEquals( 10, result.imag() );
  }
  public static Test suite()
  {
    TestSuite suite = new TestSuite();
    suite.addTest( new gIntTest( "testAdd" ));
    return suite;
  }
  public static void main(String[] args) {
    String[] caseName = { gIntTest.class.getName() };
    junit.textui.TestRunner.main( caseName );
  }
}



  /*
  public void testMultiply()
  {
  gInt expected= new gInt( -37, 84 );
  gInt result = gInt1.multiply( gInt2 );
  Assert.assertEquals( expected, result );
  }

  public void testNorm()
  {
  float expected = 5;
  float result = gInt1.norm();
  Assert.assertEquals( expected, result );
  }
  public static Test suite()
  {
  TestSuite suite= new TestSuite();
  suite.addTest( new gIntTest( "testAdd" ));
  //suite.addTest( new gIntTest( "testMultiply" ));
  //suite.addTest( new gIntTest( "testNorm" ));
  return suite;
  }
  */
