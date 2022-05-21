package in.deepak.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.deepak.entity.Contact;
import in.deepak.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository repo;

	@Override
	public String upsert(Contact contact) {
		contact.setActiveSw("Y");
		repo.save(contact);
		return "SUCCESS";
	}

	@Override
	public List<Contact> getAllContacts() {
		return repo.findAll();
	}

	@Override
	public Contact getContact(int cid) {
		Optional<Contact> id = repo.findById(cid);
		if(id.isPresent()) {
			return id.get();
		}
		return null;
	}

	@Override
	public String deleteContact(int cid) {
		//repo.deleteById(cid);
		Optional<Contact> id = repo.findById(cid);
		if(id.isPresent()) {
			Contact contact = id.get();
			contact.setActiveSw("N");
			repo.save(contact);
		}
		return "SUCCESS";
	}

}
