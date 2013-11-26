/*
   Sam Gleske
   Mon Nov 25 21:27:13 EST 2013
   java version "1.7.0_45"
   Apache Ant(TM) version 1.8.2 compiled on December 3 2011
   */
import junit.framework.*;
import java.lang.Math;

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
  public void testReal() {
    Assert.assertEquals( 5, num1.real() );
    Assert.assertEquals( 2, num2.real() );
  }
  public void testImag() {
    Assert.assertEquals( 7, num1.imag() );
    Assert.assertEquals( 3, num2.imag() );
  }
  public void testAdd() {
    gInt result = num1.add( num2 );
    Assert.assertEquals( 7, result.real() );
    Assert.assertEquals( 10, result.imag() );
  }
  public void testMultiply() {
    gInt result = num1.multiply( num2 );
    Assert.assertEquals( -11, result.real() );
    Assert.assertEquals( 29, result.imag() );
  }
  public void testNorm() {
    float expected1 = (float)Math.sqrt((5*5)+(7*7));
    float expected2 = (float)Math.sqrt((2*2)+(3*3));
    Assert.assertEquals( expected1, num1.norm() );
    Assert.assertEquals( expected2, num2.norm() );
  }
  public static Test suite()
  {
    TestSuite suite = new TestSuite();
    suite.addTest( new gIntTest( "testReal" ));
    suite.addTest( new gIntTest( "testImag" ));
    suite.addTest( new gIntTest( "testAdd" ));
    suite.addTest( new gIntTest( "testMultiply" ));
    suite.addTest( new gIntTest( "testNorm" ));
    return suite;
  }
  public static void main(String[] args) {
    String[] caseName = { gIntTest.class.getName() };
    junit.textui.TestRunner.main( caseName );
  }
}
