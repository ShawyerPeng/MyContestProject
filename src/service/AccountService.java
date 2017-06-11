package service;

import pageModel.DataGrid;
import pageModel.PageHelper;
import po.Account;

public interface AccountService {
    public int addUser(Account account);
    public DataGrid getAllUser(PageHelper pg);
    public Account checkUsername(Account account);
    public int deleteUser(String id);
    public Account getUser(String id);
    public int updateUser(Account account);
}
