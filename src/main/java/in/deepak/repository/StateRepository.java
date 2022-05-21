package in.deepak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.deepak.entities.StateMasterEntity;

public interface StateRepository extends JpaRepository<StateMasterEntity, Integer> {

	//SELECT * FROM STATES_MASTER WHERE COUNTRY_ID=?
	public List<StateMasterEntity> findByCountryId(Integer countryId);
}
