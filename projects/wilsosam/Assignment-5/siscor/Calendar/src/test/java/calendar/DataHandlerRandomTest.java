package calendar;

import java.util.*;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for DataHandler class.
 */

public class DataHandlerRandomTest {

	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;


    /**
     * Generate Random Tests that tests DataHandler Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {

			 long startTime = Calendar.getInstance().getTimeInMillis();
			 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


			 System.out.println("Start testing...");

			 try{
				 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
					 long randomseed =System.currentTimeMillis(); //10
					 //			System.out.println(" Seed:"+randomseed );
					 Random random = new Random(randomseed);

					 DataHandler dh = new DataHandler("TestXML",ValuesGenerator.getBoolean(0.5f,random));

					Appt savedAppt = null;



					 for (int i = 0; i < NUM_TESTS; i++) {
						 int startHour = ValuesGenerator.getRandomIntBetween(random, 1, 23);
						 int startMinute = ValuesGenerator.getRandomIntBetween(random, 1, 59);
						 int startDay = ValuesGenerator.getRandomIntBetween(random, 1, 28);
						 int startMonth = ValuesGenerator.getRandomIntBetween(random, 1, 11);
						 int startYear = ValuesGenerator.getRandomIntBetween(random, 1, 10);
						 String title = "Birthday Party";
						 String description = "This is my birthday party.";
						 String emailAddress = "xyz@gmail.com";

						 //Construct a new Appointment object with the initial data
						 Appt appt = new Appt(startHour,
								 startMinute,
								 startDay,
								 startMonth,
								 startYear,
								 title,
								 description,
								 emailAddress);

						 if(i == 0){
						 	savedAppt = appt;
						 }
						 dh.saveAppt(appt);
					 }


					dh.getApptRange(new GregorianCalendar(1, 1, 1), new GregorianCalendar(6, 6, 6));
					 dh.deleteAppt(savedAppt);
					dh.deleteAppt(new Appt(2,2,2,2,2,"","",""));
					Appt appt2 = new Appt(-10,2,2,"","","");
					appt2.setValid();
					dh.deleteAppt(appt2);



					 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
					 if((iteration%10000)==0 && iteration!=0 )
						 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

					 }
			 }catch(NullPointerException e){

			 }

			 System.out.println("Done testing...");
		 
	 }


	
}
