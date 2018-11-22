package liulu.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import liulu.demo.City;

@Mapper
public interface CityMapper {

	@Select("select * from city where state = #{state}")
	City findByState(@Param("state") String state);

}
