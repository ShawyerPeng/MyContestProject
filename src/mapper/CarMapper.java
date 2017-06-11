package mapper;

import org.apache.ibatis.annotations.Param;
import po.Car;
import po.CarExample;
import po.User;

import java.util.List;
import java.util.Map;

public interface CarMapper {
    int countByExample(CarExample example);

    int deleteByExample(CarExample example);

    int deleteByPrimaryKey(Integer carid);

    int insert(Car record);

    int insertSelective(Car record);

    List<Car> selectByExample(CarExample example);

    Car selectByPrimaryKey(Integer carid);

    int updateByExampleSelective(@Param("record") Car record, @Param("example") CarExample example);

    int updateByExample(@Param("record") Car record, @Param("example") CarExample example);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);

    /**分页查找数据*/
    public List<Car> getCars(Map<String, Integer> map);

    /**查询所有用户记录总数*/
    public int getAllCarsNumbers();
}