package service;

import po.EasyUIDataGridResult;
import po.Gps;

public interface GpsService {
    public EasyUIDataGridResult getCarList(int page, int rows);
    public int addCar(Gps gps);
    public int deleteCar(Long id);
    public Gps getCar(Long id);
    public int updateCar(Gps gps);
}
