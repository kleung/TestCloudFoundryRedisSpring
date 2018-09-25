package com.test.TestCloudFoundryRedis.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.TestCloudFoundryRedis.model.TestRedisData;
import com.test.TestCloudFoundryRedis.repository.TestRedisDataRepository;

@RestController
@RequestMapping("/api")
public class TestRedisController {
	
	@Autowired
	protected TestRedisDataRepository testRedisRepository;
	
	public TestRedisController() {
		super();
	}

	
	@PostMapping(value="/persist", consumes="application/json")
	public TestRedisData persist(@RequestBody TestRedisData data) {
		this.testRedisRepository.save(data);
		
		return data;
	}
	
	@GetMapping(value="/data/{id}", produces="application/json")
	public TestRedisData findById(@PathVariable("id")Integer id) {
		TestRedisData result = this.testRedisRepository.findById(id).orElse(null);
		
		return result;
	}
	
	@GetMapping(value="/data/lessThan/{value}", produces="application/json")
	public List<TestRedisData> findByIdLessThan(@PathVariable("value")Integer value) {
		List<TestRedisData> result = this.testRedisRepository.findByIdLessThan(value);
		
		return result;
	}
	
	@GetMapping(value="/data", produces="application/json")
	public List<TestRedisData> findAll() {
		List<TestRedisData> result = this.testRedisRepository.findAll();
		
		return result;
	}
	
	@GetMapping(value="/data/isValid/{isValid}", produces="application/json")
	public List<TestRedisData> findByIsValid(@PathVariable("isValid")Boolean isValid) {
		List<TestRedisData> result = this.testRedisRepository.findByIsValidIs(isValid);
		
		return result;
	}
	
	@GetMapping(value="/data/testData/{testData}", produces="application/json")
	public List<TestRedisData> findByTestData(@PathVariable("testData")String testData) {
		List<TestRedisData> result = this.testRedisRepository.findByTestData(testData);
		
		return result;
	}
	
	@DeleteMapping(value="/data/all")
	public void deleteAll() {
		this.testRedisRepository.deleteAll();
	}
}
