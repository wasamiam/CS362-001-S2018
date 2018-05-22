package calendar;


import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;


/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {

	private static final long TestTimeout = 30 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 CalDay cal = new CalDay(new GregorianCalendar(2,2,2));

		 System.out.println("Start testing...");

		 try{
			 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				 long randomseed =System.currentTimeMillis(); //10
				 //			System.out.println(" Seed:"+randomseed );
				 Random random = new Random(randomseed);

				 int startHour=ValuesGenerator.getRandomIntBetween(random, 1, 23);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 59);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, -5, 28);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, 1, 200);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 String emailAddress="xyz@gmail.com";

				 //Construct a new Appointment object with the initial data
				 //Construct a new Appointment object with the initial data
				 Appt appt = new Appt(startHour,
						 startMinute ,
						 startDay ,
						 startMonth ,
						 startYear ,
						 title,
						 description,
						 emailAddress);

				appt.setValid();
				 cal.addAppt(appt);

				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				 if((iteration%10000)==0 && iteration!=0 )
					 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

			 }
		 }catch(NullPointerException e){

		 }

		 System.out.println("Done testing...");
		 
		 
	 }


	
}
