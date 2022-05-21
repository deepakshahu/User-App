package in.deepak.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "COUNTRY_MASTER")
public class CountryMasterEntity {
	
	@Id
	@Column(name = "COUNTRY_ID")
	private Integer countryId;
	
	@Column(name = "COUNTRY_NAME")
	private String countryName;
}
