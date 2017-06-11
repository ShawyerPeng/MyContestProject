package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pageModel.DataGrid;
import pageModel.Json;
import pageModel.PageHelper;
import po.Account;
import service.AccountService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService accountService;


	/** 用户登录 */
	@ResponseBody
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public Json login(Account account) {
		Json j = new Json();
		if("cjy".equals(account.getUsername()) && "123".equals(account.getPassword())) {

		} else {
			j.setMsg("用户名或密码错误");
		}
		return j;
	}

	/** 跳转用户管理界面 */
	@RequestMapping(value="/accountmanage",method = RequestMethod.GET)
	public String show() {
		return "user";
	}


	/** 分页显示用户 */
	@ResponseBody
	@RequestMapping(value="/getAllUsers")
	public DataGrid getAllUser(PageHelper pg) {
		return accountService.getAllUser(pg);
	}

	/** 增加用户 */
	@ResponseBody
	@RequestMapping(value="/add")
	public Json addUser(Account account) {
		int result = accountService.addUser(account);
		Json json = new Json();
		if(result == 1) {
			json.setMsg("添加用户成功");
			json.setSuccess(true);
		} else {
			json.setMsg("添加用户失败");
			json.setSuccess(false);
		}
		return json;
	}

	/** 跳转增加用户界面 */
	@RequestMapping(value="/addUserPage")
	public String addUserPage() {
		return "/addUserPage";
	}


	/** 检查用户名是否存在 */
	@ResponseBody
	@RequestMapping(value="/checkUsername")
	public Json checkUsernameIsExist(Account account) {
		Account u = accountService.checkUsername(account);
		Json j = new Json();
		if(u == null) {
			j.setMsg("恭喜您，用户名可以使用");
			j.setSuccess(true);
		} else {
			j.setMsg("很遗憾，用户名已经存在");
			j.setSuccess(false);
		}
		return j;
	}

	/** 批量删除用户 */
	@ResponseBody
	@RequestMapping(value="/batchDelete")
	public Json batchDelete(String ids) {
		Json j = new Json();
		if(ids != null && ids.length() > 0) {
			for (String id : ids.split(",")) {
				if (id != null) {
					accountService.deleteUser(id);
				}
			}
		}
		j.setMsg("批量删除成功！");
		j.setSuccess(true);
		return j;
	}

	/** 跳转到更改用户界面 */
	@RequestMapping(value="/editPage")
	public String editPage(HttpServletRequest request, String id) {
        Account account = accountService.getUser(id);
		request.setAttribute("account", account);
		return "editUserPage";
	}

	/** 修改用户 */
	@ResponseBody
	@RequestMapping(value="/editUser")
	public Json editUser(Account account) {
		int result = accountService.updateUser(account);
		Json j = new Json();
		if(result == 1) {
			j.setMsg("修改用户成功");
			j.setSuccess(true);
		} else {
			j.setMsg("修改用户失败");
			j.setSuccess(false);
		}
		return j;
	}

	/** 删除用户 */
	@ResponseBody
	@RequestMapping(value="/deleteUser")
	public Json deleteUser(String id) {
		int result = accountService.deleteUser(id);
		Json json = new Json();
		if(result == 1) {
			json.setMsg("删除成功");
			json.setSuccess(true);
		} else {
			json.setMsg("删除失败");
			json.setSuccess(false);
		}
		return json;
	}


	
}
