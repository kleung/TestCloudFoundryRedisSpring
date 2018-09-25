package com.test.TestCloudFoundryRedis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.test.TestCloudFoundryRedis.model.TestRedisData;

public interface TestRedisDataRepository extends CrudRepository<TestRedisData, Integer> {
	
	public Optional<TestRedisData> findById(Integer id);
	
	public List<TestRedisData>findAll();
	
	public List<TestRedisData>findByIdLessThan(Integer value);
	
	public List<TestRedisData>findByIsValidIs(Boolean isValid);

	public List<TestRedisData>findByTestData(String testData);
	
}
