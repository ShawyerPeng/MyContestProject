package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import po.EasyUIDataGridResult;
import service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	/** 跳转用户管理界面 */
	@RequestMapping(value="/usersmanage",method = RequestMethod.GET)
	public String show() {
		return "users";
	}

    @RequestMapping("/list")
    @ResponseBody
    private EasyUIDataGridResult getCarList(Integer page, Integer rows){
        EasyUIDataGridResult lists = userService.getUserList(page,rows);
        return lists;
    }

}
