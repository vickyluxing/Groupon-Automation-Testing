package com.myappiumtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Cin_text {
	 public String readFileByLines() {
	        File file = new File("/Users/LuXing/Documents/workspace/myappiumtest/searchItem.txt");
	        BufferedReader reader = null;
	        String res = null;
	        try {
	            reader = new BufferedReader(new FileReader(file));
	            String tempString = null;
	            int line = 0;
	            //count line
	            while ((tempString = reader.readLine()) != null) {
	                System.out.println("line " + line + ": " + tempString);
	                line++;
	            }
	            reader.close();
	            Random random = new Random();
	            int outLine = random.nextInt(line - 1) + 1;
	            line = 1;
	            reader = new BufferedReader(new FileReader(file));
	            res = reader.readLine();
	            while (line != outLine) {
	            	reader.readLine();
	                line++;
	            }
	            res = reader.readLine();
	            System.out.println(res);
	            reader.close();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        } 
	        finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e1) {
	                }
	            }
	        }
	        return res;
	    }
}
