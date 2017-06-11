package service.impl;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pageModel.DataGrid;
import po.Car;
import po.CarExample;
import po.EasyUIDataGridResult;
import service.CarService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	private CarMapper carMapper;

	public EasyUIDataGridResult getCarList(int page, int rows) {
		//分页处理
		PageHelper.startPage(page, rows);

		//查询结果
		CarExample example = new CarExample();
		List<Car> list = carMapper.selectByExample(example);

		//获取分页信息
		PageInfo<Car> info = new PageInfo<>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		long total = info.getTotal();

		//封装分页信息
		List<Car> row = info.getList();
		result.setRows(row);
		result.setTotal(total);
		return result;
	}

	/**增加用户*/
	public int addCar(Car car) {
		return carMapper.insert(car);
	}
	
	/**根据用户id删除用户*/
	public int deleteCar(Integer id) {
		return carMapper.deleteByPrimaryKey(id);
	}
	
	/**根据用户id获得用户*/
	public Car getCar(Integer id) {
		return carMapper.selectByPrimaryKey(id);
	}
	
	/**更新用户*/
	public int updateCar(Car car) {
		return carMapper.updateByPrimaryKey(car);
	}
}
