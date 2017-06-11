package service;

import po.EasyUIDataGridResult;
import po.User;

public interface UserService {
    public int addUser(User user);
    public EasyUIDataGridResult getUserList(int page, int rows);
    public int deleteUser(Integer id);
    public User getUser(Integer id);
    public int updateUser(User u);
}
