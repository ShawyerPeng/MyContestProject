package service.impl;

import com.github.pagehelper.PageInfo;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.*;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	
	/**增加用户*/
	public int addUser(User user) {
		return userMapper.insert(user);
	}


	public EasyUIDataGridResult getUserList(int page, int rows) {
		//分页处理
		com.github.pagehelper.PageHelper.startPage(page, rows);

		//查询结果
		UserExample example = new UserExample();
		List<User> list = userMapper.selectByExample(example);

		//获取分页信息
		PageInfo<User> info = new PageInfo<>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		long total = info.getTotal();

		//封装分页信息
		List<User> row = info.getList();
		result.setRows(row);
		result.setTotal(total);
		return result;
	}


	/**根据用户id删除用户*/
	public int deleteUser(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	/**根据用户id获得用户*/
	public User getUser(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	/**更新用户*/
	public int updateUser(User u) {
		return userMapper.updateByPrimaryKey(u);
	}
}
