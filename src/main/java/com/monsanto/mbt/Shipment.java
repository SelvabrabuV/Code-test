package com.monsanto.mbt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Shipment {
Scanner scan = new Scanner(System.in);
//WidgetUtils wid =new WidgetUtils() ;
List<Widget> wd = new ArrayList<Widget>();
List<Object> swp = new ArrayList<Object>();

public Shipment(List<Widget> wid)
{
	this.wd=wid;//.getSampleWidgets();
	
	
	System.out.println("\n----------------------------\n");
	
	System.out.println("Added Widgets to the Shipment\n");
	
	for(Widget on:wd)
	{
		if(on.getColor()!=null) {
		swp.add(on);
		System.out.println("|"+on.getSerialNumber()+" |"+on.getColor()+" |"+on.getProductionDate());
	}
	}
	System.out.println("----------------------------\n");
	
}

public void sortcolor()
{

	System.out.println("Sorting based on color\n");
	Collections.sort(this.swp, new Comparator<Object>(){
	    public int compare(Object w1, Object w2) {
	    	return ((Widget) w1).getColor().compareToIgnoreCase(((Widget) w2).getColor());
	    }
	});
	
	for (Object sortedcolor : this.swp)
	{
		if(((Widget) sortedcolor).getColor()!=null)
		System.out.println("|"+((Widget) sortedcolor).getSerialNumber()+" |"+((Widget) sortedcolor).getColor()+" |"+((Widget) sortedcolor).getProductionDate());
	}
		System.out.println("----------------------------\n");
	
}

public void sortproddate()
{
	swp.removeAll(Collections.singleton(null));
	System.out.println("Sorting based on date\n");
	Collections.sort(this.swp, new Comparator<Object>(){
	    public int compare(Object w1, Object w2) {
	        return ( ((Widget) w1).getProductionDate()).compareTo(((Widget) w2).getProductionDate());
	    }
	});
	
	for (Object sorteddate : this.swp)
	{
		if(((Widget) sorteddate).getColor()!=null)
			System.out.println("|"+((Widget) sorteddate).getSerialNumber()+" |"+((Widget) sorteddate).getColor()+" |"+((Widget) sorteddate).getProductionDate());
	}
	System.out.println("----------------------------\n");
}



}
