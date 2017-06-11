package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import po.EasyUIDataGridResult;
import service.GpsService;

@Controller
public class GpsController {
	@Autowired
	private GpsService gpsService;

	/** 跳转用户管理界面 */
	@RequestMapping(value="/gps/gpsmanage",method = RequestMethod.GET)
	public String show() {
		return "GpsList";
	}

	@RequestMapping("/gps/list")
	@ResponseBody
	private EasyUIDataGridResult getGpsList(Integer page, Integer rows){
		EasyUIDataGridResult lists = gpsService.getCarList(page,rows);
		return lists;
	}
}
