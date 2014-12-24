package encryptionPackage;

import java.util.*;
import java.io.*;

public class Hash_Maps 
{
	//Hash maps relates 2 items to each other maps them together like String to Integers
	//ideal for Encoding
	
	//Hash maps are not sorted in any way
	public static void main(String args[]) 
	{
		
		String Allwords = "";
		int codeNumbers=10000;
		int codeNumberLenght=0;
		int i=0;
		int numOfWords=1;
		int increment=0;
		int msg = 9;
		String  Line="";
		String newLine="";
		String the="the";
		String getValue="";
		int x =0;
		int tenEelements =0;
		String intToString;
		int codeNumbercounter=0;
		
		
		
		
		String[] myStringArray = new String[1000];
		
		int[] ranNumArray = new int [75000];
		int[] encodedMsg = new int [100];
		
		
		HashMap<Integer,String> map = new HashMap<Integer,String> ();
		
		Map<String,List<Integer>> CodeBook = new HashMap <String ,List<Integer>>();
		
		Map<Integer,String> DecodeBook = new HashMap<Integer,String>();
		
		//ArrayList<Integer> list1 = new ArrayList<Integer>();
		//CodeBook.put(1, "FirstWord");
		/////////////////////////////////////Try to put this in loop ///
		//CodeBook.put(Allwords, new ArrayList<Integer>());
		
		/////////////////////////////////////
		//CodeBook.put("Word", new ArrayList<Integer>()); 
		//CodeBook.put("Tree", new ArrayList<Integer>()); 
		//CodeBook.get("Word").add(16);
		//CodeBook.get("Word").add(17);
		//CodeBook.get("Tree").add(18);
		//CodeBook.get("Tree").add(19);
		//System.out.println(CodeBook);
		//////////////////////////////////////////////////////////////////////////////////////////
		for (i = 0; i < ranNumArray .length; i++)
		{
			
			ranNumArray [i] = i+10000;	
		}
		//ArrayList<Integer> list = new ArrayList<Integer>();
		shuffleArray(ranNumArray);
		/////////////////////////////////////////////////////////////////////////////////////////////

		    //Define and initialize the ArrayList
		 ArrayList<String> commonWords = new ArrayList<String>();
		 ArrayList<String> mesaageReadin = new ArrayList<String>();
		 ArrayList<Integer> encodedMessage = new ArrayList<Integer>();
		 //int[] myIntArray = new int[20];
		 
		 /////////////////////////////////////////////////////////////////////////////////////////////////////////
		 //Encode
		 try
		 		  
		 {
			 BufferedWriter out = new BufferedWriter(new FileWriter("codedCommonWords.txt"));
			 
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
				
				for (int y=0; y<codeNumberLenght ; y++)  //Can use for loop to print out one thing with brackets 
				{ 
					 codeNumbercounter++;
					 tenEelements++;
					 CodeBook.get(strLine).add(ranNumArray[codeNumbers]); 
					 intToString = Integer.toString(ranNumArray[codeNumbers]);//Need to be same as Decodebook
					 out.write(intToString+" ");
					 if(tenEelements == 10)
					 {
						 out.write("\n");
						 tenEelements=0;
					 }
					 
					 DecodeBook.put(ranNumArray[codeNumbers],strLine); //Need to be the same as CodeBook
					 codeNumbers++;
					 
				 }
		 	 }
		 		 
		 	 }
		 	 catch(Exception e)
		 	 {
		 		   System.out.println(e);
		 	 }
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////    
		 
			 System.out.println("Common Words"+commonWords);
			 System.out.println( numOfWords);
		   //Can use for loop to print out one thing with brackets 
		  //for first 25 words 1000 values (Integer)
			 
			     // But if you print out more than one need curly brace 
			 //System.out.println(commonWords.get(i)); 
			 //for (int y=0; y <codeNumberLenght ; y++)  //Can use for loop to print out one thing with brackets 
			 //{ 
				 
				 //CodeBook.get("the").add(codeNumbers); 
				 //codeNumbers++;
			 //}
			
		 
		 
		 //System.out.println(CodeBook);
		 
		 
		 //List<Integer> value9 = CodeBook.get("the");//If Value the exists it will return [] brackets it does exist
		 ////List<Integer> value8 = CodeBook.get("of");
		 //List<Integer> value7 = CodeBook.get("and");
		 //List<Integer> value6 = CodeBook.get("a");
		 List<Integer> value5 = CodeBook.get("to");
		 List<Integer> value4 = CodeBook.get("Karobasas");//If value dosnt exist it will return null
		 
		String numvalue1 = DecodeBook.get(10000);
		String numvalue2 = DecodeBook.get(10999);
		String numvalue3 = DecodeBook.get(11000);
		System.out.println("The Key:"+numvalue1);
		System.out.println("The Key:"+numvalue2);
		System.out.println("Next Key:"+numvalue3);
		 
		 System.out.println(value5);
		 System.out.println(value4);
		 
		
		//map.put(5, "Five");
		//map.put(1, "Five");
		//map.put(3, "Five");
		
		//map.put(8, "Eight");
		//map.put(6, "Six");
		//map.put(4, "Four");
		//map.put(2, "Two");
		
		//String text = map.get("Five");
		//String text1 = map.get("Five");
		//String text2 = map.get("Five");
		//String text3 = map.get(8);
		
		//System.out.println(text);
		//System.out.println(text1);
		//System.out.println(text2);
		//System.out.println(text3);
		////////////////////////////////////////////////////////////////////////////////////////////////////
		 //READS IN THE MESSAGE/////////
		//MessageToEncode
		try 
		{//Try
		BufferedReader in = new BufferedReader(new FileReader("MessageToEncode.txt"));
		
		while((Line = in.readLine()) != null)
		{//While
			
			 numOfWords++;
			 
			 commonWords.add(Line);//Display purposes only
			 myStringArray[numOfWords]=Line;
			 //System.out.println("Array Element:"+myStringArray[numOfWords]);
			 
			 mesaageReadin.add(Line);
			 
			 
			 increment++;
			 Line = newLine;
			 //System.out.println("My message:"+newLine);
			 //for(Map.Entry<String,List<Integer>> entry : CodeBook.entrySet())
			  //{
				  //System.out.printf("Key : %s %n", entry.getKey());
				  //if(CodeBook.containsKey("the"))
			 //getValue = CodeBook.get(Line);
		            
		  }//While
					 //encodedMessage.add("Works");
					 //System.out.println("Works");
					 //myIntArray[increment]=msg;
			
		// }
		 }//Try
		 catch(Exception e)
	 	 {//Catch
	 		   System.out.println(e);
	 	 }//Catch
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//CODES THE MESSAGE
		for(int a =0;a<myStringArray.length;a++)
		{
			
			boolean exists = CodeBook.containsKey(myStringArray[a]);
		      if (exists == true)
			  {
		    	  //System.out.println("My message:"+Line);
				  //System.out.println("My message:"+newLine+" "+Line);
		    	  Random ran = new Random();
		  		  int gen = ran.nextInt(30) + 1;
				  int num =CodeBook.get(myStringArray[a]).get(gen);
				  int counter =0;
				  counter++;
				  
				  encodedMessage.add(num);  
				  encodedMsg[counter]=num;
				  
			  }
		}
		////////////////////////////////////////////////////////////////////////////////////////////////
		//int print =0;print<encodedMsg.length;print++
		
		
		
		 System.out.println("Array Population:"+i);
		 System.out.println("Number of encoded words:"+codeNumbercounter);
		 System.out.println("Read in msg:"+mesaageReadin);
		 System.out.println("My Encoded msg:"+encodedMessage);
		 System.out.println("My number:"+increment);
		 boolean exists = CodeBook.containsKey("hpppl");
		 //System.out.println("Word:"+exists);
		 if( exists== true)
		 {
			 System.out.println("Works");
		 }
		 
		 boolean exist = CodeBook.containsKey(myStringArray[0]);
		 System.out.println("Word:"+exist);
		 
		
		//This Loop gets the  Integer and String part and prints them out together
		//for(Map.Entry<Integer, String> entry: map.entrySet())
		//{
			//int key = entry.getKey();
			//String value = entry.getValue();
			
			//System.out.println(key + ":  " + value);
		//}
/////////////////////////////////////////////////////////////////////////////////////////////
//DECODES THE MESSAGE	
		 System.out.println("Decoded message");
		 //String decode1 =DecodeBook.get(20000);
		 //System.out.println(decode1);
		 //encodedMsg
		 for (int intValue: encodedMessage)
		 {   
			 //System.out.println("Decode:"+intValue);
			 boolean existMsg = DecodeBook.containsKey(intValue);
			 if(existMsg == true)
			 {
				 String decode = DecodeBook.get(intValue);
				 System.out.println("Decode:"+decode);
			 }	 
		 }
/////////////////////////////////////////////////////////////////////////////////////////////
		
	}
	
	static void shuffleArray(int[] ar)
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

}
