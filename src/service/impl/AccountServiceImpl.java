package service.impl;

import mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pageModel.DataGrid;
import pageModel.PageHelper;
import po.Account;
import po.User;
import service.AccountService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountMapper accountMapper;
	
	
	/**增加用户*/
	public int addUser(Account account) {
		return accountMapper.addUser(account);
	}
	
	
	/**分页查找用户信息*/
	public DataGrid getAllUser(PageHelper pg) {
		DataGrid dg = new DataGrid();
		int page = pg.getPage();
		int rows = pg.getRows();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("pageSize", rows);   //页面的大小
		map.put("curRow",(page-1)*rows);  //当前记录数
		List<Account> users = accountMapper.getUsers(map);
		dg.setRows(users);    //设置数据
		dg.setTotal(Long.valueOf(accountMapper.getAllUsersNumbers()));   //设置数据表格记录数
		return dg;
	}
	
	/**查询用户名是否存在*/
	public Account checkUsername(Account account) {
		return accountMapper.checkUsername(account);
	}
	
	/**根据用户id删除用户*/
	public int deleteUser(String id) {
		return accountMapper.deleteUser(id);
	}
	
	/**根据用户id获得用户*/
	public Account getUser(String id) {
		return accountMapper.getUser(id);
	}
	
	/**更新用户*/
	public int updateUser(Account account) {
		return accountMapper.updateUser(account);
	}
}
