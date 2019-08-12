package com.kpn.rest.webservices.service.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpn.rest.webservices.model.Person;
import com.kpn.rest.webservices.repository.api.PersonRepository;
import com.kpn.rest.webservices.service.api.PersonService;

/**
 * @author manjiramazinderbaruah
 * This is the implementation class for Person interface
 *
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	/**
	 * It accepts id from the controller
	 */
	@Override
	public Person getPersonById(Integer id) {
		return personRepository.findPersonById(id);
	}

}
