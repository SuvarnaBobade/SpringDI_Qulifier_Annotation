package com.AllQulifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Person {
	@Qualifier("airtel")
	@Autowired
	private Sim smi1;
	@Qualifier("jio")
	@Autowired
	private Sim smi2;

	@Override
	public String toString() {
		return "Person [smi1=" + smi1 + ", smi2=" + smi2 + "]";
	}

	public Sim getSmi1() {
		return smi1;
	}

	public void setSmi1(Sim smi1) {
		this.smi1 = smi1;
	}

	public Sim getSmi2() {
		return smi2;
	}

	public void setSmi2(Sim smi2) {
		this.smi2 = smi2;
	}

}
