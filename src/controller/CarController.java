package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pageModel.DataGrid;
import pageModel.Json;
import pageModel.PageHelper;
import po.Car;
import po.EasyUIDataGridResult;
import service.CarService;

import javax.servlet.http.HttpServletRequest;

@Controller
// @RequestMapping("/car")
public class CarController {
	@Autowired
	private CarService carService;

	@RequestMapping("/car/list")
	@ResponseBody
	private EasyUIDataGridResult getCarList(Integer page, Integer rows){
		EasyUIDataGridResult lists = carService.getCarList(page,rows);
		return lists;
	}





	/** 跳转用户管理界面 */
	@RequestMapping(value="/car/carmanage",method = RequestMethod.GET)
	public String show() {
		return "CarList";
	}
	
	// /** 分页显示用户 */
	// @ResponseBody
	// @RequestMapping(value="/getAllCars")
	// public DataGrid getAllCar(PageHelper pg) {
	// 	return carService.getAllCar(pg);
	// }
	
	/** 增加车辆 */
	@ResponseBody
	@RequestMapping(value="/add")
	public Json addCar(Car car) {
		int result = carService.addCar(car);
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
	@RequestMapping(value="/addCarPage")
	public String addCarPage() {
		return "/addCarPage";
	}

	
	/** 批量删除用户 */
	@ResponseBody
	@RequestMapping(value="/batchDelete")
	public Json batchDelete(String ids) {
		Json j = new Json();
		if(ids != null && ids.length() > 0) {
			for (String id : ids.split(",")) {
				if (id != null) {
					Integer intid = Integer.valueOf(id);
					carService.deleteCar(intid);
				}
			}
		}
		j.setMsg("批量删除成功！");
		j.setSuccess(true);
		return j;
	}
	
	/** 跳转到更改用户界面 */
	@RequestMapping(value="/editPage")
	public String editPage(HttpServletRequest request, Integer id) {
		Car car = carService.getCar(id);
		request.setAttribute("car", car);
		return "/editCarPage";
	}
	
	/** 修改用户 */
	@ResponseBody
	@RequestMapping(value="/editCar")
	public Json editCar(Car car) {
		int result = carService.updateCar(car);
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
	@RequestMapping(value="/deleteCar")
	public Json deleteUser(Integer id) {
		int result = carService.deleteCar(id);
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
