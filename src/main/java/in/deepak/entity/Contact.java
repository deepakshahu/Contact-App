package in.deepak.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CONTACT_DTLS")
@Data
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	private String name;
	private String email;
	private Long phno;
	private String activeSw;
}
