package com.glaucous.numberIncrement;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

@Component
public class  DatabaseComponent {
	private  AtomicInteger countData= new AtomicInteger(0) ;
	
    
	public AtomicInteger getCountData() {
		return countData;
	}

	public void setCountData(AtomicInteger countData) {
		this.countData = countData;
	}

}
