package cn.humanResSys.dao.zhaopin;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import cn.humanResSys.pojo.Offer;
@Component("zhaoPinMapper")
public interface ZhaoPinMapper {
	public int addOffer(Offer offer);
	public int updateOffer(Offer offer);
	public int delOfferById(@Param("id")Integer id);
	public List<Offer> getOfferList(@Param("jobname")String jobname,
			@Param("jobcategory")String jobcategory,
			@Param("creationdate")String creationdate,@Param("endtime")String endtime);
	public int getOfferCount(@Param("jobname")String jobname,
			@Param("jobcategory")String jobcategory,
			@Param("creationdate")String creationdate,@Param("endtime")String endtime);
	public Offer getOfferById(@Param("id")Integer id);

}
