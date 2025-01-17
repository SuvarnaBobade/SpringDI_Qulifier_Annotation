package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	@Value("100")
	private int id;
	@Value("java devloper")
	private String d_name;

	public Department() {
		super();
	}

	public Department(int id, String d_name) {
		super();
		this.id = id;
		this.d_name = d_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", d_name=" + d_name + "]";
	}

}
