package logic;

import java.sql.Array;
import java.time.*;
import java.util.Date;

public class EntryList{
	
	Entry[] oldList = new Entry[0];
	Entry[] sortList;
	Entry[] list;
	Entry tempEntry;
	ArrivalTime arrivalTime = new ArrivalTime();
	Date currentDate = new Date();
	int sortIndex = 0;
	int i = 0;
	
	EntryList(){
	
		list = new Entry[]{new Entry("Transit", 30, 10, 1)};
		renewList();
	}
	
	void renewList(){
		oldList = list.clone();
	}
	
	void addEntry(Entry newEntry){
		list = new Entry[oldList.clone().length + 1];
		for(int i = 0; i < list.length - 1; i++){
			list[i] = oldList[i];
		}
		list[list.length - 1] = newEntry;
		renewList();
	}
	
	int getTotalTime(){ //remember time is in minutes
		int totalTime = 0;
		for(int i = 0; i < list.length; i++){
			totalTime += list[i].getTime();
		}
		return totalTime;
	}
	
	int getRemainingTime(){ //remember time is in minute
		int remainingHours = 0;
		int remainingMinutes = 0;
				
		remainingHours = currentDate.getHours() - arrivalTime.getArrivalHour();		
		remainingMinutes = currentDate.getMinutes() - arrivalTime.getArrivalMinute();
		
		if(remainingHours*60 + remainingMinutes <= 0){
			eliminateEntry();
		}
		
		return remainingHours*60 + remainingMinutes;
	}
	
	void eliminateEntry(){
		//if one remaining task, don't eliminate
		int removeOrder;
		int checkPriority = 0;
		int checkTime = 0;
		
		for(int i = 0; i < list.length; i++){
			if(list[i].getPriority() < checkPriority){
				removeOrder = list[i].getOrder();
			}
			
			else if(list[i].getPriority() == checkPriority){
				if(list[i].getTime() > checkTime){
					
				}
			}
		}
	}
	
	void setArrivalTime(int newArrivalHour, int newArrivalMinute){
		arrivalTime.setArrivalHour(newArrivalHour);
		arrivalTime.setArrivalMinute(newArrivalMinute);
	}
	
	void removeEntry(int removeOrder){
		for(int i = 0; i < list.length; i++){
			if(list[i].getOrder() == removeOrder){
				
			}
		}
		renewList();
	}
	
	void sortList(){
		for(; i < list.length; i++){
			Entry temp;
			int lastSorted = 0;
			
			for(int i = 0; i < (list.length - 1 - sortIndex); i++){
				if(list[i].getOrder() > list[i+1].getOrder())
				{
					temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					lastSorted = i;
				}
			}
		}
	}
}
