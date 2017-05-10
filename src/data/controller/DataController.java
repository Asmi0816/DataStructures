package data.controller;

import data.model.Customer;
import data.model.Logs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataController
{
	private Queue<Customer> myCustomer;
	private Stack<Logs> logPile;
	public DataController()
	{
		this.myCustomer = new LinkedList<Customer>();
		this.logPile = new Stack<Logs>();
	}
	public void start()
	{
		testQueues();
		testStacks();
	}
	
	public void testQueues()
	{
		myCustomer.add(new Customer("Rocky", 4, true));
		myCustomer.add(new Customer("Rock", 5, false));
		myCustomer.add(new Customer("Roc", 90, true));
		myCustomer.add(new Customer("Ro", 6, false));
		myCustomer.add(new Customer("R", 46, true));
		
		myCustomer.remove();
		
		
	}
	
	public void testStacks()
	{
		logPile.push(new Logs(true, "blue", 74));
		logPile.push(new Logs(true, "blue", 74));
		logPile.push(new Logs(true, "blue", 74));
		logPile.push(new Logs(true, "blue", 74));
		logPile.pop();
		logPile.peek();
	}
}
