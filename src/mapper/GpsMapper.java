package mapper;

import org.apache.ibatis.annotations.Param;
import po.Gps;
import po.GpsExample;

import java.util.List;

public interface GpsMapper {
    int countByExample(GpsExample example);

    int deleteByExample(GpsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Gps record);

    int insertSelective(Gps record);

    List<Gps> selectByExampleWithBLOBs(GpsExample example);

    List<Gps> selectByExample(GpsExample example);

    Gps selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Gps record, @Param("example") GpsExample example);

    int updateByExampleWithBLOBs(@Param("record") Gps record, @Param("example") GpsExample example);

    int updateByExample(@Param("record") Gps record, @Param("example") GpsExample example);

    int updateByPrimaryKeySelective(Gps record);

    int updateByPrimaryKeyWithBLOBs(Gps record);

    int updateByPrimaryKey(Gps record);
}