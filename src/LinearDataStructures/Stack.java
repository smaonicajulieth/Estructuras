package LinearDataStructures;

import java.io.*;

/*
# Stack Functions.

#
# Created by Msc. Carlos Andres Sierra on April 2018.
# Copyright (c) 2018  Msc. Carlos Andres Sierra. Research Group on Artificial Life - ALIFE. All rights reserved.
#
# This file is part of DataStructuresTemplates.
#
# DataStructuresTemplates is free software: you can redistribute it and/or modify it under the terms of the
# GNU General Public License as published by the Free Software Foundation, version 3.
 */

/**
 * This class represents the behavior of Stacks
 * @author MSc. Carlos Andres Sierra, PhD. student
 */
public class Stack {

	public Node top = null; //top

	public Stack() {}

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return top == null ? true : false;
	}


	/**
	 * Add node at last stack
	 * @param newNode
	 */
	public void push(Node newNode)
	{
		newNode.setNext(top);	
		top=newNode;
	}


	/**
	 * Take node at last stack
	 * @return
	 */
	public Node pop()
	{
		Node temp=top;
		top=temp.getNext();
		temp.setNext(null);
		return temp;		

	}


	/**
	 * Show last Node
	 * @return Last Node at Stack
	 */
	public String peek()
	{
		return top.toString();

	}


	/**
	 * Print Stack
	 */
	public void printStack()
	{
		BufferedWriter bw = new BufferedWriter(	new OutputStreamWriter( System.out ));

		try
		{
			while(!isEmpty())
				bw.write(pop().toString());

			bw.flush();
		}
		catch(Exception ex) { ex.printStackTrace(); }
	}
}