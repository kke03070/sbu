/** ayoung **/

package sbu.spring.dao;

import sbu.spring.domain.*;
import org.springframework.dao.DataAccessException;
import java.util.List;

public interface AccountsUserDao {

	AccountsUser getAccountsUser(String username) throws DataAccessException;
	AccountsUser getAccountsUser(String usernaem, String userpwd) throws DataAccessException;
	
	void insertAccountsUser(AccountsUser accountUser) throws DataAccessException;
	void updateAccountsUser(AccountsUser accountUser) throws DataAccessException;
	
	List<String> getUsernameList() throws DataAccessException;

}
