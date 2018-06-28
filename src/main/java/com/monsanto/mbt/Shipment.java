package com.monsanto.mbt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Shipment {
Scanner scan = new Scanner(System.in);
WidgetUtils wid =new WidgetUtils() ;
List<Widget> wd = new ArrayList<Widget>();


public Shipment()
{
	this.wd=wid.getSampleWidgets();
	wd.removeAll(Collections.singleton(null));
	
	System.out.println("----------------------------\n");
	
	
	for(Widget on:wd)
	{
		System.out.println("|"+on.getSerialNumber()+" |"+on.getColor()+" |"+on.getProductionDate());
	}
	
	System.out.println("----------------------------\n");
	
}

public void sortcolor()
{
	System.out.println("Sorting based on color\n");
	Collections.sort(this.wd, new Comparator<Widget>(){
	    public int compare(Widget w1, Widget w2) {
	        return w1.getColor().compareToIgnoreCase(w2.getColor());
	    }
	});
	
	for (Widget sortedcolor : this.wd)
		System.out.println("|"+sortedcolor.getSerialNumber()+" |"+sortedcolor.getColor()+" |"+sortedcolor.getProductionDate());
	System.out.println("----------------------------\n");
	
}

public void sortproddate()
{
	System.out.println("Sorting based on production date\n");
	Collections.sort(this.wd, new Comparator<Widget>(){
	    public int compare(Widget w1, Widget w2) {
	        return ( w1.getProductionDate()).compareTo(w2.getProductionDate());
	    }
	});
	
	for (Widget sorteddate : this.wd)
		System.out.println("|"+sorteddate.getSerialNumber()+" |"+sorteddate.getColor()+" |"+sorteddate.getProductionDate());
}
}
