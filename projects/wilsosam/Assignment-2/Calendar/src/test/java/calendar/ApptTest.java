/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
      assertFalse(appt0.getValid());
      assertTrue(appt0.isOn(9,14,2018));

  }
@Test(timeout = 4000)
 public void test01()  throws Throwable  {
    Appt appt1 = new Appt(0,0,0,0,0,null,null,null);
    appt1.setValid();
    assertFalse(appt1.getValid());
    appt1.setStartMonth(9);
    assertEquals(appt1.getStartMonth(), 9);
    appt1.setValid();
    assertFalse(appt1.getValid());

    appt1.setStartHour(15);
    assertEquals(appt1.getStartHour(), 15);
    appt1.setValid();
    assertFalse(appt1.getValid());

    appt1.setStartMinute(30);
    assertEquals(appt1.getStartMinute(), 30);
    appt1.setValid();
    assertFalse(appt1.getValid());

    appt1.setStartYear(2018);
    assertEquals(appt1.getStartYear(), 2018);
    appt1.setValid();
    assertFalse(appt1.getValid());

    appt1.setStartDay(14);
    assertEquals(appt1.getStartDay(), 14);
    appt1.setValid();

    assertTrue(appt1.getValid());
}

}
