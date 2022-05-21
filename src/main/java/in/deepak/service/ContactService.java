package in.deepak.service;

import java.util.List;

import in.deepak.entity.Contact;

public interface ContactService {
	
	String upsert(Contact contact);
	List<Contact> getAllContacts();
	Contact getContact(int cid);
	String deleteContact(int cid);
}
