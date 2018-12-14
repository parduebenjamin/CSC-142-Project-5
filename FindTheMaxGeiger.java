import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;


public class FindTheMaxGeiger {
	
	public static void main (String[] args) {
		
		
		//String [] radiation = getRadiation("C:/Users/u23s57/Documents/4_22_18_radiation.txt");
		String [] dateStamp = getDate("4_22_18_dates.txt");
		String [] timeStamp = getTime("4_22_18_times.txt");
					
			try {
			Scanner scanner1 = new Scanner(new File("4_22_18_radiation.txt"));
			
			int radCtr = 0;	
			while (scanner1.hasNextLine()) {
				radCtr++;
				scanner1.nextLine();
				}
			Scanner scanner2 = new Scanner(new File("4_22_18_radiation.txt"));
			int [] radiation = new int [radCtr]; //create the radiation array
			int i = 0;
			while(scanner2.hasNextLine()){
			   radiation[i++] = scanner2.nextInt();
			}
			
			/*
			for (int y = 0; y < radiation.length; y++) {
				System.out.println(radiation[y]);
				}*/
			
			int max = getMax(radiation);
			//System.out.println("Maximum Value is:  "+radiation[max]);
			System.out.println("Date		Counts per Minute");
			System.out.println("-------------------------------");
			System.out.println(dateStamp[max-5]+ " " + timeStamp[max-5] + "        " + radiation[max-5]);
			System.out.println(dateStamp[max-4]+ " " + timeStamp[max-4] + "        " + radiation[max-4]);
			System.out.println(dateStamp[max-3]+ " " + timeStamp[max-3] + "        " + radiation[max-3]);
			System.out.println(dateStamp[max-2]+ " " + timeStamp[max-2] + "        " + radiation[max-2]);
			System.out.println(dateStamp[max-1]+ " " + timeStamp[max-1] + "        " + radiation[max-1]);
			System.out.println(dateStamp[max]+ " " + timeStamp[max] + "        " + radiation[max] + "(This is the max)");
			System.out.println(dateStamp[max+1]+ " " + timeStamp[max+1] + "        " + radiation[max+1]);
			System.out.println(dateStamp[max+2]+ " " + timeStamp[max+2] + "        " + radiation[max+2]);
			System.out.println(dateStamp[max+3]+ " " + timeStamp[max+3] + "        " + radiation[max+3]);
			System.out.println(dateStamp[max+4]+ " " + timeStamp[max+4] + "        " + radiation[max+4]);
			System.out.println(dateStamp[max+5]+ " " + timeStamp[max+5] + "        " + radiation[max+5]);
			
			}
		
				catch (FileNotFoundException e){
					System.out.println();
				}
		
		
		
	}
		
	//get date
	public static String[] getDate(String file) {
		//step 1:
		// count the number of lines in the file
		//step 2 - create the array and copy the elements in
		int ctr = 0;
		try {
			
			Scanner s3 = new Scanner(new File(file));
			while (s3.hasNextLine()) {
				ctr++;
				s3.nextLine();
				
			}
			String[] dateStamp = new String[ctr]; //creation
			
			Scanner s4 = new Scanner(new File(file));
			for (int i = 0; i < ctr; i++) {
				dateStamp[i] = s4.next();
						
			}
			
			return dateStamp;
		}
		catch (FileNotFoundException e){
			
		}
		return null;
	}
	
	
	//get time
		public static String[] getTime(String file) {

			int ctr = 0;
			try {
				
				Scanner s5 = new Scanner(new File(file));
				while (s5.hasNextLine()) {
					ctr++;
					s5.nextLine();
					
				}
				String[] timeStamp = new String[ctr]; //creation
				
				Scanner s6 = new Scanner(new File(file));
				for (int i = 0; i < ctr; i++) {
					timeStamp[i] = s6.next();
							
				}
				
				return timeStamp;
			}
			catch (FileNotFoundException e){
				
			}
			return null;
}

		public static int getMax(int[] inputArray){ 
		    int maxValue = inputArray[0]; 
		    int maxLoc = 0;
		    for(int i=1;i < inputArray.length;i++){ 
		      if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i]; 
		         maxLoc = i;
		      } 
		    } 
		    return maxLoc; 
		  }






}
		