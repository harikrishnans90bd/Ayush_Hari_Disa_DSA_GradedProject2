package com.org.graded.group.skyscraper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Skyscraper {

	
	public void skyDriver() {
		Scanner in =new Scanner(System.in);
		Scanner in1 =new Scanner(System.in);
		
		try {
			System.out.println("enter the total number of floors in building.");
			int totalNoOfBuilding =in.nextInt();
			int floor[]=new int[totalNoOfBuilding];
			
			for(int i=0;i<totalNoOfBuilding;i++) {
				System.out.println("enter the floor size given on a day");
				int floorsize=in1.nextInt();
				floor[i]=floorsize;
			}
			
			int sum=0,dayCount=0;
			List<Integer> li = new ArrayList<Integer>();	
			for(int j=0;j<totalNoOfBuilding;j++) {
				dayCount++;
				sum=sum+floor[j];
				li.add(floor[j]);
				if(sum>=totalNoOfBuilding) {
					System.out.println("Day :"+dayCount);
					Collections.reverse(li);
					System.out.println(li);
					li.clear();
					sum=0;
				}else {
					System.out.println("Day : "+dayCount);
				}
			}
			
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			in.close();
			in1.close();
		}
	}
	
}
