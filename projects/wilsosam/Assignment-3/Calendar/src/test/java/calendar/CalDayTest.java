/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.*;

public class CalDayTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    CalDay cd0 = new CalDay();
    assertFalse(cd0.valid);

    // Constructor
    CalDay cd1 = new CalDay(new GregorianCalendar(2018,0,1));
    assertEquals(cd1.getYear(),2018);
    assertEquals(cd1.getMonth(),1);
    assertEquals(cd1.getDay(),1);
    LinkedList<Appt> lla = new LinkedList<Appt>();
    assertEquals(cd1.appts,lla);

    // addAppt


  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {

  }

}
