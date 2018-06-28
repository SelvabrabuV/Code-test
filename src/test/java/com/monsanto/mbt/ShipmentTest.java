package com.monsanto.mbt;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.*;

public class ShipmentTest {
	Shipment cg = new Shipment();
	
	
	@Test
	public void testShipment_Sorted_By_Color() {
		// Implement your solution to get list of shipments
		
cg.sortcolor();
//Assert.assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testShipment_Sorted_By_Date() {
		// Implement your solution to get list of shipments
	
cg.sortproddate();
	}

	
}
