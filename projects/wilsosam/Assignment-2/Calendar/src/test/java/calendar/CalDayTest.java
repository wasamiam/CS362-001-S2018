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
    CalDay cd0 = new CalDay(new GregorianCalendar());
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {

  }

}
