
package com.services;

public class Inputs 
{
    private String name="";
    private String address="";
    private String date;
    private int rate;
    private int duration;
    private String contact;
    private String time;
   
    
    
       
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
        public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
        public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
        public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return duration;
	}

	public void setHours(int duration) {
		this.duration = duration;
	}

	public String showDetails() {
		return this.name+", "+this.address+","+this.contact+","+this.date +","+this.time+","+this.rate+","+this.duration;
	}
	
}
