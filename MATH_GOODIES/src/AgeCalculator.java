
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
class AgeCalculator {
    private int current_date,current_month,current_year;
    private int birth_date,birth_month,birth_year;
    private int years = 0;
    private int months = 0;
    private int days = 0;
    private String Age;
    private long Age_In_Days=0;
    private long Age_In_Hours=0;
    private long Age_In_Minutes=0;

    AgeCalculator(int c_date, int c_month, int c_year, int b_date, int b_month, int b_year) {
        current_date=c_date;
        current_month=c_month;
        current_year=c_year;
        birth_date=b_date;
        birth_month=b_month;
        birth_year=b_year;
    }
    String computeAge() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      int day, month, year;
      day=birth_date;
      month=birth_month;
      year=birth_year;
      String dob=day+"/"+month+"/"+year;
      Date birthDate = sdf.parse(dob);
      Age age = calculateAge(birthDate);
      Age=String.valueOf(age);
      return Age;
    }

    private Age calculateAge(Date birthDate) {
      
      
      Calendar birthDay = Calendar.getInstance();
      birthDay.setTimeInMillis(birthDate.getTime());

      //create calendar object for current day
      long currentTime = System.currentTimeMillis();
      Calendar now = Calendar.getInstance();
      now.setTimeInMillis(currentTime);

      //Get difference between years
      
      years = current_year - birthDay.get(Calendar.YEAR);
      int currMonth = current_month;int s=current_date;
      int birthMonth = birthDay.get(Calendar.MONTH) + 1 ;
	
      //Get difference between months
      months = currMonth - birthMonth;
	
      //if month difference is in negative then reduce years by one and calculate the number of months.
      if (months < 0)
      {
         years--;
         months = 12 - birthMonth + currMonth;
         if (s< birthDay.get(Calendar.DATE)) {
              months--;
          }
      } 

      else if (s < birthDay.get(Calendar.DATE))
      {
         
         months--;
      }
	
      else if (months == 0 && s < birthDay.get(Calendar.DATE))
      {
         years--;
         months = 11;
      }

	

      //Calculate the days
      if (s > birthDay.get(Calendar.DATE)) {
            days = s - birthDay.get(Calendar.DATE);
        }
      else if (s < birthDay.get(Calendar.DATE)){
          int cflag=0;int len=0;
	 
	 if(current_year % 400 == 0){cflag = 1;}
         else if (current_year % 100 == 0){cflag = 0;}
         else if (current_year % 4 == 0){cflag = 1;}
	 else{cflag = 0;}

	if(cflag==1){
            if(birthMonth==1){len=31;}if(birthMonth==2){len=29;}if(birthMonth==3){len=31;}if(birthMonth==4){len=30;}if(birthMonth==5){len=31;}if(birthMonth==6){len=30;}
            if(birthMonth==7){len=31;}if(birthMonth==8){len=31;}if(birthMonth==9){len=30;}if(birthMonth==10){len=31;}if(birthMonth==11){len=30;}if(birthMonth==12){len=31;}
        }
	if(cflag==0){
            if(birthMonth==1){len=31;}if(birthMonth==2){len=28;}if(birthMonth==3){len=31;}if(birthMonth==4){len=30;}if(birthMonth==5){len=31;}if(birthMonth==6){len=30;}
            if(birthMonth==7){len=31;}if(birthMonth==8){len=31;}if(birthMonth==9){len=30;}if(birthMonth==10){len=31;}if(birthMonth==11){len=30;}if(birthMonth==12){len=31;}
        }

         int today = s;
	System.out.println(birthDay.get(Calendar.DAY_OF_MONTH));
         days = len - birthDay.get(Calendar.DAY_OF_MONTH) + today;
      }
	 else
      {
         days = 0;
         if (months == 12)
         {
            years++;
            months = 0;
         }
      }
      return new Age(days, months, years);
    }

    long days() {
        int bflag=0,p=years,q=months,r=days;
        int i=birth_year;
        for (int j=0;j<=years;j++) {
            if(p>0){
                
                if(i % 400 == 0){bflag = 1;}
                else if (i % 100 == 0){bflag = 0;}
                else if (i % 4 == 0){bflag = 1;}
                else{bflag = 0;}
                
                if(bflag==1){Age_In_Days=Age_In_Days+366;p--;i++;}
                else{Age_In_Days=Age_In_Days+365;p--;i++;}
            }
            else{
                Age_In_Days=Age_In_Days+30*q+r;
            }
        }
        return Age_In_Days;
    }

    long hours() {
        Age_In_Hours=Age_In_Days*24;
        return Age_In_Hours;
    }

    long minutes() {
        Age_In_Minutes=Age_In_Hours*24;
        return Age_In_Minutes;
    }
    
    class Age
{
   private int days;
   private int months;
   private int years;
 
   private Age()
   {
      //Prevent default constructor
   }
 
   public Age(int days, int months, int years)
   {
      this.days = days;
      this.months = months;
      this.years = years;
   }
 
   public int getDays()
   {
      return this.days;
   }
 
   public int getMonths()
   {
      return this.months;
   }
 
   public int getYears()
   {
      return this.years;
   }
 
   
        @Override
   public String toString()
   {
      return years + " Years, " + months + " Months, " + days + " Days";
   }
	
}
}
