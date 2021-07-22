package com.capgemini.model;

import java.io.Serializable;

//PLEASE UPDATE THIS IMPLEMENTATION (REFER TODOS)
/**
 * 
 * This is a CarDTO class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *  
 */
public class CarDTO implements Serializable
{
    private int id;
    private String make;
    private String model;
    private String model_Year;

    public CarDTO()
    {
        //TODO 1 initialize id to -1 and rest of the member variables to a blank string
		id = -1;
		make = model = model_Year = "Not Specified";
    }

    
    
    public CarDTO(String make, String model, String modelYear) {
		this.make = make;
		this.model = model;
		this.model_Year = modelYear;
	}

    	

	//TODO 2 Implement the setter and getter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModelYear() {
		return model_Year;
	}

	public void setModelYear(String modelYear) {
		this.model_Year = modelYear;
	}
}