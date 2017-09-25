package cn.humanResSys.service.zhaopin;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.humanResSys.pojo.Offer;

public interface ZhaoPinService {
	public int addOffer(Offer offer);
	public int updateOffer(Offer offer);
	public int delOfferById(@Param("id")Integer id);
	public List<Offer> getOfferList(@Param("jobname")String jobname,
			@Param("jobcategory")String jobcategory,
			@Param("creationdate")String creationdate,@Param("endtime")String endtime,
			@Param("currentPageNo")Integer currentPageNo,@Param("pageSize")Integer pageSize);
	public int getOfferCount(@Param("jobname")String jobname,
			@Param("jobcategory")String jobcategory,
			@Param("creationdate")String creationdate,@Param("endtime")String endtime);
	public Offer getOfferById(@Param("id")Integer id);

}
