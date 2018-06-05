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
      appt0.setStartHour(1);
      string0 = appt0.toString();
      assertEquals("\t14/9/2018 at 1:30am ,Birthday Party, This is my birthday party\n", string0);


  }
@Test(timeout = 4000)
 public void test01()  throws Throwable  {


    // Test Constructor
    /*
    public Appt(int startHour, int startMinute,
            int startDay, int startMonth, int startYear,
             String title, String description, String emailAddress )
     */
    Appt appt2 = new Appt(1,1,1,1,1,"Test","Test2","Test@test.com");
    assertEquals(appt2.getStartHour(),1);
    assertEquals(appt2.getStartMinute(),1);
    assertEquals(appt2.getStartDay(),1);
    assertEquals(appt2.getStartMonth(),1);
    assertEquals(appt2.getStartYear(),1);
    assertEquals(appt2.getTitle(),"Test");
    assertEquals(appt2.getDescription(),"Test2");
    assertEquals(appt2.getEmailAddress(),"Test@test.com");

    // Test setValid

    Appt appt1 = new Appt(0,0,1,1,1,"Title","Desc","Email");
    appt1.setValid();
    assertTrue(appt1.getValid());
    appt1.setStartMonth(12);
    appt1.setStartHour(23);
    appt1.setStartMinute(59);
    appt1.setStartYear(2018);
    appt1.setStartDay(31);
    appt1.setValid();
    assertTrue(appt1.getValid());
    appt1.setStartDay(1);
    // Month
    appt1.setStartMonth(0);
    assertEquals(appt1.getStartMonth(), 0);
    appt1.setValid();
    assertFalse(appt1.getValid());
    appt1.setStartMonth(13);
    appt1.setValid();
    assertFalse(appt1.getValid());
    appt1.setStartMonth(6); // Reset
    appt1.setValid();
    assertTrue(appt1.getValid());

    // Hour
    appt1.setStartHour(-1);
    assertEquals(appt1.getStartHour(), -1);
    appt1.setValid();
    assertFalse(appt1.getValid());
    appt1.setStartHour(24);
    appt1.setValid();
    assertFalse(appt1.getValid());
    appt1.setStartHour(0); // Reset

    // Minute
    appt1.setStartMinute(-1);
    assertEquals(appt1.getStartMinute(), -1);
    appt1.setValid();
    assertFalse(appt1.getValid());
    appt1.setStartMinute(60);
    appt1.setValid();
    assertFalse(appt1.getValid());
    appt1.setStartMinute(0);

    // Year
    appt1.setStartYear(-1);
    assertEquals(appt1.getStartYear(), -1);
    appt1.setValid();
    assertFalse(appt1.getValid());
    appt1.setStartYear(1); // Reset

    // Day
    appt1.setStartDay(-1);
    assertEquals(appt1.getStartDay(), -1);
    appt1.setValid();
    assertFalse(appt1.getValid());
    appt1.setStartDay(32);
    appt1.setValid();
    assertFalse(appt1.getValid());

    // hasTimeSet
    assertTrue(appt1.hasTimeSet());
    appt1.setStartHour(-1);
    assertFalse(appt1.hasTimeSet());
    appt1.setStartHour(0); // Reset

    // setRecurrence
    /*
        public void setRecurrence(int[] recurDays, int recurBy, int recurIncrement, int recurNumber)
     */
    int[] testInt = {1,2,3};
    appt1.setRecurrence(testInt, 1, 2, 3);
    assertEquals(appt1.getRecurDays(),testInt);
    assertEquals(appt1.getRecurBy(),1);
    assertEquals(appt1.getRecurIncrement(),2);
    assertEquals(appt1.getRecurNumber(),3);



}

}
