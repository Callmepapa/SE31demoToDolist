package sg.edu.nus.iss.epat.tdd.workshop;

import static org.junit.Assert.assertFalse;

import java.util.Collection;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ToDoListTest extends TestCase {
   // Define Test Fixtures 
	private Task t1, t2;
	private ToDoList todolist;
	
	//private HashMap<String, Task> task1 = new HashMap<String, Task>();
	//private HashMap<String, Task> task2 = new HashMap<String, Task>();

   public ToDoListTest() {
      super();
   }

   @Before
   public void setUp() throws Exception {
	// Initialise Test Fixtures
	 t1 = new Task("t1 goes for swimming pool",true); 
	 t2 = new Task("t2 goes for playing golf",false);
	 todolist = new ToDoList();
	 //test
   }

   @After
   public void tearDown() throws Exception {
      // Uninitialise test Fixtures
	  //System.out.println("tear down");
   }

   @Test
   public void testAddTask() { 
//      HashMap<String, Task> Map = new HashMap<String, Task>();

	   todolist.addTask(t1);
	   todolist.addTask(t2);
      //how to test alr add t1,t2
      assertTrue(todolist.getStatus(t1.getDescription()));
      assertSame(2,todolist.getAllTasks().size());
//      System.out.println(a.getAllTasks());
//      System.out.println("["+t1+"]");
//      
   }

   @Test
   public void testGetStatus() {
     // fail("Not implemented yet");
	   todolist.addTask(t1);
	   Boolean b = todolist.getStatus(t1.getDescription());
	   assertTrue(b);
	   
	   assertEquals(true,todolist.getStatus("t1 goes for swimming pool"));

   }
   

   @Test
   public void testRemoveTask() {
      //fail("Not implemented yet");
	   todolist.addTask(t1);
	   todolist.addTask(t2);
	   todolist.removeTask(t1.getDescription());
	      //assertTrue(todolist.isEmpty());
	      assertEquals(t2,todolist.getTask("t2 goes for playing golf"));
   }

   @Test
   public void testGetCompletedTasks() {
      //fail("Not implemented yet");
	   todolist.addTask(t1);
	   todolist.addTask(t2);
	   todolist.completeTask("t2 goes for playing golf");
	
//	      System.out.println(t1);
//	      System.out.println(t2);
//	      System.out.println(a.getCompletedTasks());
	   	Collection<Task> tasks = todolist.getCompletedTasks();
	   	assertEquals(2,tasks.size());
	   	assertTrue(tasks.contains(t1));
	   	assertTrue(tasks.contains(t2));
   }
}
