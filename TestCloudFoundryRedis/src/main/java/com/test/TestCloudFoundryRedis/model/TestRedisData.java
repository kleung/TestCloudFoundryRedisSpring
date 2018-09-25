package com.test.TestCloudFoundryRedis.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash("TestRedisData")
public class TestRedisData implements Serializable {

	private static final long serialVersionUID = -3560105521367849993L;
	
	@Id
	protected Integer id;

	@Indexed
	protected String testData;
	
	@Indexed
	protected Boolean isValid;
	
	@Indexed
	protected Date dateValue;
	
	public TestRedisData() {
		super();
	}

	public TestRedisData(Integer id, String testData, Boolean isValid, Date dateValue) {
		super();
		this.id = id;
		this.testData = testData;
		this.isValid = isValid;
		this.dateValue = dateValue;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTestData() {
		return testData;
	}

	public void setTestData(String testData) {
		this.testData = testData;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	public Date getDateValue() {
		return dateValue;
	}

	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}
	
}
