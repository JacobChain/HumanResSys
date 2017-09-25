package cn.humanResSys.service.zhaopin;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.humanResSys.dao.zhaopin.ZhaoPinMapper;
import cn.humanResSys.pojo.Offer;

@Service("zhaoPinService")
public class ZhaoPinServiceImpl implements ZhaoPinService {
	
	@Autowired
	@Qualifier("zhaoPinMapper")
	private ZhaoPinMapper zhaoPinMapper;

	@Override
	public int addOffer(Offer offer) {
		// TODO Auto-generated method stub
		return zhaoPinMapper.addOffer(offer);
	}

	@Override
	public int updateOffer(Offer offer) {
		// TODO Auto-generated method stub
		return zhaoPinMapper.updateOffer(offer);
	}

	@Override
	public int delOfferById(Integer id) {
		// TODO Auto-generated method stub
		return zhaoPinMapper.delOfferById(id);
	}

	@Override
	public List<Offer> getOfferList(String jobname,
			String jobcategory, String creationdate, String endtime,Integer currentPageNo,Integer pageSize) {
		// TODO Auto-generated method stub
		System.out.println("inservice");
		return zhaoPinMapper.getOfferList(jobname, jobcategory, creationdate, endtime);
	}

	@Override
	public int getOfferCount(String jobname, String jobcategory,
			String creationdate, String endtime) {
		// TODO Auto-generated method stub
		return zhaoPinMapper.getOfferCount(jobname, jobcategory, creationdate, endtime);
	}

	@Override
	public Offer getOfferById(Integer id) {
		// TODO Auto-generated method stub
		return zhaoPinMapper.getOfferById(id);
	}

}
