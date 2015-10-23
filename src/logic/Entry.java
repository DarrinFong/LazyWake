package logic;

public class Entry {

	String entryTitle;
	int entryTime;
	int entryOrder;
	int entryPriority;
	
	Entry(int defineOrder){ //define Order
		entryTitle = "No Title";
		entryTime = 5;
		entryPriority = 5;
		entryOrder = defineOrder;
	}
	
	Entry(String defineTitle, int defineTime, int definePriority, int defineOrder){ // define title, time, priority, order
		entryTitle = defineTitle;
		entryTime = defineTime;
		entryPriority = definePriority;
		entryOrder = defineOrder;
	}
	
	String getTitle(){
		return entryTitle;
	}
	
	void setTitle(String newTitle){
		entryTitle = newTitle;
	}
	
	int getTime(){
		return entryTime;
	}
	
	void setTime(int newTime){
		entryTime = newTime;
	}
	
	int getPriority(){
		return entryPriority;
	}
	
	void setPriority(int newPriority){
		entryPriority = newPriority;
	}
	
	int getOrder(){
		return entryOrder;
	}
	
	void setOrder(int newOrder){
		entryOrder = newOrder;
	}
}
