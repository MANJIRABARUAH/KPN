package com.kpn.rest.webservices.service.api.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.math.BigInteger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.kpn.rest.webservices.model.Person;
import com.kpn.rest.webservices.repository.api.PersonRepository;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceImplTest {
	
	@InjectMocks
	private PersonServiceImpl personServiceImplTest;
	
	@Mock
	private PersonRepository personRepository;

	@Test
	public void testgetPersonById() {
		Person person = new Person();
		person.setAge(BigInteger.valueOf(28));
		person.setName("manjira");
		Mockito.when(personRepository.findPersonById(28)).thenReturn(person);
		Person result = personServiceImplTest.getPersonById(28);
		assertNotNull(result);
		assertEquals("Compare name", result.getName(), "manjira");
		assertEquals("Compare Age", result.getAge(), BigInteger.valueOf(28));
		verify(personRepository).findPersonById(28);
		verifyNoMoreInteractions(personRepository);
	}
}
