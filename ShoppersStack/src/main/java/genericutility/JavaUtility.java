package genericutility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getRandomNum() {
		Random random=new Random();
		int randomNumber = random.nextInt(1000);
		return randomNumber;
	}
	
	public String getSystemDate() {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String formatedDate = sdf.format(date);
		return formatedDate;
	}
	
	
	
	public String getDateAndTime() {
		Date date=new Date();	
		String timeAndDate=date.toString().replace(" ", "_").replace(":", "_");
		return timeAndDate;	
	}
	
	
	
}
