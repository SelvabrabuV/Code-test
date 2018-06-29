package com.monsanto.mbt;

import java.util.Date;


public class Widget {
    private int serialNumber;
    private String color;
    private Date productionDate;
    
static int count =0;
    public Widget(int serialNumber, String color, Date productionDate) {
    	if(count<10) {
        this.serialNumber = serialNumber;
        this.color = color;
        this.productionDate = productionDate;
    	}
    	else
    		System.out.println("You can add only 10 widgets");
    	
    	count++;	
    }
    


    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }
}
