package com.glaucous.numberIncrement.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaucous.numberIncrement.DatabaseComponent;
import com.glaucous.numberIncrement.ExceptionHandling.DatabaseException;
import com.glaucous.numberIncrement.Repository.NumberRepository;
import com.glaucous.numberIncrement.model.Number;

@Transactional
@Service
public class NumberServiceImpl implements NumberService {
	
	@Autowired
	private NumberRepository numberRepository;
	@Autowired
	DatabaseComponent databaseComponent;
	
	/**
	 * increaseCountByOne
	 * method to save number
	 */
	@Override
	public  void increaseCountByOne() {
		try{
			
			numberRepository.save(new Number(1,databaseComponent.getCountData().getAndIncrement()));
			
		}
			
		catch(Exception e){
			throw new DatabaseException("Occuring An issue while Saving Data");
		}
		
	}
	
}
