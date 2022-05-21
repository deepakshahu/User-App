package in.deepak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.deepak.entities.CityMasterEntity;

public interface CityRepository extends JpaRepository<CityMasterEntity, Integer> {
	
	//SELECT * FROM CITIES_MASTER WHERE STATE_ID=?
	public List<CityMasterEntity> findByStateId(Integer stateId);
}
