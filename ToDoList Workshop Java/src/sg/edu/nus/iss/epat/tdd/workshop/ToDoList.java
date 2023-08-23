package sg.edu.nus.iss.epat.tdd.workshop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<String, Task>();
   
   public void addTask(Task task) {
      // Add code here
	   tasks.put(task.getDescription(),task);
   }

   public void completeTask(String description) {
      // Add code here
	  //tasks.get(description).isComplete();
	  
	   
	  tasks.get(description).setComplete(true);
	  
	  //solution
//	  Task task = null;
//	  task = tasks.get(description);
//	  if(task!=null) {
//		  task.setComplete(true);
//	  }
	  	  
   }

   public boolean getStatus(String description) {
      // Add code here
	  // find Task by key, then find it property
	   return tasks.get(description).isComplete();
	   
	   //solution
//	   Task task = null;
//	   task = tasks.get(description);
//	   if(task!=null)
//		   return task.isComplete();
//     
   }

   public Task getTask(String description) {
      // Add code here
      return tasks.get(description);
   }

   public Task removeTask(String description) {
      return tasks.remove(description);
      
   }

   public Collection<Task> getAllTasks() {
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
      // Add code here
	   ArrayList<Task> a = new ArrayList<Task>();
	   boolean b;
	  for(Task value:tasks.values()){
		  b = value.isComplete();
		  if (b == true) {
			  a.add(value);
		  }
	  }
	  return a;
	   
//	   Collection <Task> completeTasks = new ArrayList<Task>();
//	   for(Task task: getAllTasks()) {
//		   if(task.isComplete())
//			   completeTasks.add(task);
//	   }
//	   return completeTasks;
	
	  
   }
   
   
   //don't know how to test after add task.
   public boolean isEmpty() {
	   return tasks.isEmpty();
   }
}
