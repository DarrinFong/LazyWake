package logic;

import java.util.Date;

public class ArrivalTime {
	
	int arrivalHour;
	int arrivalMinute;
	
	ArrivalTime(){
		arrivalHour = 10;
		arrivalMinute = 0;
	}
	
	ArrivalTime(int defineArrivalHour, int defineArrivalMinute){
		arrivalHour = defineArrivalHour;
		arrivalMinute = defineArrivalMinute;
	}
	
	int getArrivalHour(){
		return arrivalHour;
	}
	
	void setArrivalHour(int newArrivalHour){
		arrivalHour = newArrivalHour;
	}
	
	int getArrivalMinute(){
		return arrivalMinute;
	}
	
	void setArrivalMinute(int newArrivalMinute){
		arrivalMinute = newArrivalMinute;
	}
}
