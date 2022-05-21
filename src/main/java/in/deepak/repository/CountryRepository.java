package in.deepak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.deepak.entities.CountryMasterEntity;

public interface CountryRepository extends JpaRepository<CountryMasterEntity, Integer> {

}
