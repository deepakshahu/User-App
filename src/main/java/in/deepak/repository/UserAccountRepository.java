package in.deepak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.deepak.entities.UserAccountEntity;

public interface UserAccountRepository extends JpaRepository<UserAccountEntity, Integer> {
	
	//SELECT * FROM USER_ACCOUNTS WHERE USER_EMAIL=? AND USER_PWD=?
	public UserAccountEntity findByEmailAndPazzword(String email, String pwd);

	//SELECT * FROM USER_ACCOUNTS WHERE USER_EMAIL=?
	public UserAccountEntity findByEmail(String email);
}
