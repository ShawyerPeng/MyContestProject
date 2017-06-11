package service;

import pageModel.DataGrid;
import pageModel.PageHelper;
import po.Car;
import po.EasyUIDataGridResult;

public interface CarService {
    public EasyUIDataGridResult getCarList(int page, int rows);

    public int addCar(Car car);
    // public DataGrid getAllCar(PageHelper pg);
    public int deleteCar(Integer id);
    public Car getCar(Integer id);
    public int updateCar(Car car);
}
