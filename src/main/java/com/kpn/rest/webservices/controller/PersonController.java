package com.kpn.rest.webservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kpn.rest.webservices.model.Person;
import com.kpn.rest.webservices.service.api.PersonService;

/**
 * @author manjiramazinderbaruah
 * This is the controller class
 */
@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	
	/**
	 * @param id 
	 * It accepts person id from end user
	 * @return
	 * returns object model of person: name, age
	 */
	@GetMapping(path = "/api/v1/person/id/{id}", produces = { MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Person> getPesonDetailsById(@PathVariable Integer id) {
		return new ResponseEntity<>(personService.getPersonById(id), HttpStatus.OK);
	}

}
