package encryptionPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Encryption 
{
	private String Allwords = "";
	private static int codeNumbers=10000;
	private static int codeNumberLenght=0;
	private int i=0;
	private static int numOfWords=1;
	private int increment=0;
	private int msg = 9;
	private String  Line="";
	private String newLine="";
	private String the="the";
	private String getValue="";
	private int x =0;
	private static int tenEelements =0;
	private static String intToString;
	private static int codeNumbercounter=0;
	
	
	
	ArrayList<String> mesaageReadin = new ArrayList<String>();
	ArrayList<Integer> encodedMessage = new ArrayList<Integer>();
	
	HashMap<Integer,String> map = new HashMap<Integer,String> ();
		
	
		
	
	
	
	static void shuffleArray(int[] ar) //Shuffles Elements of the array
	{ 
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	      Random rnd = new Random();
	      int index = rnd.nextInt(i + 1);
	   
	      int a = ar[index];
	      ar[index] = ar[i];
	      ar[i] = a;
	    }
	 }
	
	static void populateArray(int[] ar) //Populates the array
	{

		for (int i = 0; i < ar.length; i++)
		{
			ar[i] = i+10000;	
		}
	}
	
	public static void coding()
	{
		Map<Integer,String> DecodeBook = new HashMap<Integer,String>();
		Map<String,List<Integer>> CodeBook = new HashMap <String ,List<Integer>>();
		ArrayList<String> commonWords = new ArrayList<String>();
		
		int[] ranNumArray = new int [75000];
		
		populateArray(ranNumArray);
		shuffleArray(ranNumArray);
		
		
		
		try
		  
		 {
			 BufferedWriter out = new BufferedWriter(new FileWriter("codedWords.txt"));
			 
			 FileInputStream in = new FileInputStream("commonEnglishWords.txt");
			 BufferedReader br = new BufferedReader(new InputStreamReader(in));
			 String strLine;
			 
			 
			 while((strLine = br.readLine())!= null)
			 {
				 
				 numOfWords++;
				 
				 commonWords.add(strLine);//Display purposes only
				 // myStringArray[numOfWords]=strLine;
				 //System.out.println(myStringArray[numOfWords]);
				 CodeBook.put(strLine ,new ArrayList<Integer>());
				 
				 if(numOfWords<25)
				 {
					 codeNumberLenght = 899; //900
				 }
				 if(numOfWords>=25)
				 {
					 codeNumberLenght = 199; //200
				 } 
				 if(numOfWords>=100)
				 {
					 codeNumberLenght = 49; //50
				 } 
				 if(numOfWords>300)
				 {
					 codeNumberLenght = 39; //40
				 }
				
				for (int y=0; y <codeNumberLenght ; y++)  //Can use for loop to print out one thing with brackets 
				{ 
					 codeNumbercounter++;
					 tenEelements++;
					 CodeBook.get(strLine).add(ranNumArray[codeNumbers]); 
					 intToString = Integer.toString(ranNumArray[codeNumbers]);
					 out.write(intToString+" ");
					 if(tenEelements == 10)
					 {
						 out.write("\n");
						 tenEelements=0;
					 }
					 
					 DecodeBook.put(codeNumbers,strLine);
					 codeNumbers++;
					 
				 }
		 	 }
		 		 
		 	 }
		 	 catch(Exception e)
		 	 {
		 		   System.out.println(e);
		 	 }
		  
		 
			 System.out.println("Common Words"+commonWords);
			 System.out.println( numOfWords);
	}

}
