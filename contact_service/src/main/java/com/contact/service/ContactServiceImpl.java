package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{
List<Contact> list =List.of(
		new Contact(2001L,"asda@asd","Suraj",1001L),
		new Contact(2002L,"asda@asd11","Suraj01",1001L),
		new Contact(2003L,"asda40@asd","Suraj02",1001L),
		new Contact(2004L,"asda@asd","Ravi",1002L),
		new Contact(2005L,"asda@asd","Ravi01",1002L)
		
		);
			



@Override
public List<Contact> getContactsOfUser(Long userId) {
	return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
}
}

