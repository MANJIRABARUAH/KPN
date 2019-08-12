package com.kpn.rest.webservices.repository.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kpn.rest.webservices.model.Person;
import com.kpn.rest.webservices.repository.api.PersonRepository;

/**
 * @author manjiramazinderbaruah
 * This is the repository 
 *
 */
@Repository
public class PersonRepositoryImpl implements PersonRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 *It accepts id from service class and sends back person object
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Person findPersonById(Integer id) {
		String sql = "SELECT * FROM PERSON WHERE ID = ?";
		return (Person) jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(Person.class));
	}

}
