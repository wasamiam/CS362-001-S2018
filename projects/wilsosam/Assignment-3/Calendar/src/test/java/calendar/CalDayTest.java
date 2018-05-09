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
    assertEquals(cd1.getAppts(),lla);

    // toString
    assertEquals(cd1.toString(), "\t --- 2/1/2018 --- \n --- -------- Appointments ------------ --- \n\n");



    // Iterator
    assertEquals(cd0.iterator(), null);
    assertTrue(cd1.iterator()!= null);

    // isValid
    assertTrue(cd1.isValid());

    // addAppt
    Appt appt1 = new Appt(12,10,1,1,1,"Title","Desc","Email");
    Appt appt2 = new Appt(11,9,1,1,1,"Title","Desc","Email");
    Appt appt3 = new Appt(11,30,1,1,1,"Title","Desc","Email");
    cd1.addAppt(appt1);
    assertTrue(cd1.getAppts().contains(appt1));
    cd1.addAppt(appt2);
    assertEquals(cd1.getAppts().indexOf(appt2),0);
    cd1.addAppt(appt3);
    assertEquals(cd1.getAppts().indexOf(appt3),1);
    cd1.getAppts().remove(appt3);

    // getSizeAppts
    assertEquals(cd1.getSizeAppts(),cd1.getAppts().size());

    //
    assertEquals(cd1.getFullInfomrationApp(cd1), "1-1-2018 \n\t11:09AM Title Desc \n\t0:10AM Title Desc ");


  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {

  }

}
