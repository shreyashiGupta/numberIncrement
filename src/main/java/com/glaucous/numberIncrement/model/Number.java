package com.glaucous.numberIncrement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/**
 * 
 * @author shreyashi
 *
 */

@Entity
@Table(name="Number")
public class Number {
	@Id
	private Integer id;
	@Column (name="count")
	private Integer count;
	public Number() {
		
	}
	public Number(Integer id,Integer count) {
		super();
		this.id = id;
		this.count = count;
	}
	public Integer getId() 
	{ return id; }
	public void setId(Integer id) 
	{ this.id = id; }
	 
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	

}
