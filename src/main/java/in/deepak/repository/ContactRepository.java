package in.deepak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.deepak.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
