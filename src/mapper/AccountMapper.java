package mapper;

import po.Account;

import java.util.List;
import java.util.Map;


public interface AccountMapper {
	
	/**增加用户*/
	public int addUser(Account account);
	
	/**分页查找数据*/
	public List<Account> getUsers(Map<String, Integer> map);
	
	/**查询所有用户记录总数*/
	public int getAllUsersNumbers();
	
	/**查询用户名是否存在*/
	public Account checkUsername(Account account);
	
	/**根据用户id删除用户*/
	public int deleteUser(String id);
	
	/**根据用户id查找用户*/
	public Account getUser(String id);
	
	/**修改用户*/
	public int updateUser(Account account);
	

}
