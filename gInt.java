/*
   Sam Gleske
   Mon Nov 25 21:27:13 EST 2013
   java version "1.7.0_45"
   Apache Ant(TM) version 1.8.2 compiled on December 3 2011
   */

import java.lang.Math;

public class gInt {
  private int real = 0;
  private int imag = 0;
  public gInt(int r) {
    real = r;
  }
  public gInt( int r, int i ) {
    real = r;
    imag = i;
  }
  public int real() {
    return real;
  }
  public int imag() {
    return imag;
  }
  public gInt add( gInt rhs ) {
    //add the value of this and another gInt instance
    gInt result = new gInt(
        real+rhs.real(),
        imag+rhs.imag()
        );
    return result;
  }
  public gInt multiply( gInt rhs ) {
    //multiply the value of this and another gInt instance
    gInt result = new gInt(
        real*rhs.real()-imag*rhs.imag(),
        real*rhs.imag()+imag*rhs.real()
        );
    return result;
  }
  public float norm() {
    return (float)Math.sqrt(real*real+imag*imag);
  }
}
