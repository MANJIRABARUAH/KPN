package com.kpn.rest.webservices.repository.api;

import com.kpn.rest.webservices.model.Person;

public interface PersonRepository {
	
	Person findPersonById(Integer id);

}
