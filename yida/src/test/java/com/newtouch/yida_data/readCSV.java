package com.newtouch.yida_data;

import java.nio.charset.Charset;
import com.csvreader.CsvReader;
import java.util.ArrayList;




public class readCSV {
	public static String readCsvFile(){
	try {
		String filePath = "E:\\javaproject\\project1\\yida\\user.csv";
		ArrayList<String[]> csvList = new ArrayList<String[]>(); //用来保存数据
		//一般用这编码读就可以了
		CsvReader reader = new CsvReader(filePath,',',Charset.forName("SJIS"));
		reader.readHeaders(); // 跳过表头如果需要表头的话，不要写这句。
		while(reader.readRecord()){ //逐行读入除表头的数据
			csvList.add(reader.getValues());
		}
		reader.close();
		for(int row=0;row<csvList.size();row++){
			System.out.println(csvList.get(row)[0]); //用户名
			System.out.println(csvList.get(row)[1]); //密码
			System.out.println("------------"); //分割线
			String username = csvList.get(row)[0];   //返回用户名
			String password = csvList.get(row)[1];   //返回密码
			String login = username+","+password;
			return login;
		}
		
	} catch (Exception ex){
		System.out.println(ex);
		}
	return null;
	}
	
//	public static void main(String[] args){
//		String filePath = "E:\\javaproject\\project1\\yida\\user.csv";
//		readCsvFile(filePath);
//		}
}