package service.impl;

import com.github.pagehelper.PageInfo;
import mapper.GpsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.*;
import service.GpsService;

import java.util.List;

@Service
public class GpsServiceImpl implements GpsService {
	@Autowired
	private GpsMapper gpsMapper;


    public EasyUIDataGridResult getCarList(int page, int rows) {
        //分页处理
        com.github.pagehelper.PageHelper.startPage(page, rows);

        //查询结果
        GpsExample example = new GpsExample();
        List<Gps> list = gpsMapper.selectByExample(example);

        //获取分页信息
        PageInfo<Gps> info = new PageInfo<>(list);
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        long total = info.getTotal();

        //封装分页信息
        List<Gps> row = info.getList();
        result.setRows(row);
        result.setTotal(total);
        return result;
    }

    /**增加用户*/
    public int addCar(Gps gps) {
        return gpsMapper.insert(gps);
    }


    /**根据用户id删除用户*/
    public int deleteCar(Long id) {
        return gpsMapper.deleteByPrimaryKey(id);
    }

    /**根据用户id获得用户*/
    public Gps getCar(Long id) {
        return gpsMapper.selectByPrimaryKey(id);
    }

    /**更新用户*/
    public int updateCar(Gps gps) {
        return gpsMapper.updateByPrimaryKey(gps);
    }
}
