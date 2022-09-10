package org.restone;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class One {
	private int id;
	private Two category;
	private String name;
	private ArrayList photoUrls;
	private ArrayList<Three> tags;
	private String status;
	public int getId() {
		return id;
	}
	public One(int id, Two category, String name, ArrayList photoUrls, ArrayList<Three> tags, String status) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
	}
	public Two getCategory() {
		return category;
	}
	public String getName() {
		return name;
	}
	public ArrayList getPhotoUrls() {
		return photoUrls;
	}
	public ArrayList<Three> getTags() {
		return tags;
	}
	public String getStatus() {
		return status;
	}
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

