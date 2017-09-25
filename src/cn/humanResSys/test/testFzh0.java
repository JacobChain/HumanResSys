package cn.humanResSys.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.humanResSys.pojo.Offer;
import cn.humanResSys.service.zhaopin.ZhaoPinService;

public class testFzh0 {
	public static Logger logger=Logger.getLogger(testFzh0.class);
	/*@Test
	public void testaddOffer(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		ZhaoPinService zhaoPinService = (ZhaoPinService)context.getBean("zhaoPinService");
		Offer offer=new Offer();
		offer.setCreatedby((long) 8);
		offer.setCreationdate(new Date());
		offer.setDepartmentstatus((long) 3);
		offer.setEndtime(new Date());
		offer.setHiringnumber((long) 5);
		offer.setId((long) 2);
		offer.setJobid((long) 2);
		offer.setModifyby(null);
		offer.setModifydate(new Date());
		offer.setOfferType((long) 3);
		offer.setRemarks(null);
		offer.setRequirements("Ϊ����");
		int result=zhaoPinService.addOffer(offer);
		if(result>0){
			logger.info(result);
		}
		
	}*/
	
	@Test
	public void testOfferList(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		ZhaoPinService zhaoPinService = (ZhaoPinService)context.getBean("zhaoPinService");
		int id=3;
		String jobname="��������";
		String jobcategory ="����";
		String creationdate= "2017-05-24";
		String endtime= "2017-05-31";
		int currentPageNo=1;
		int pageSize=5;

		List<Offer> offerList=zhaoPinService.getOfferList(jobname, jobcategory, creationdate, endtime, currentPageNo, pageSize);
		for(Offer offer:offerList){
			logger.info(offer.getJobcode()+offer.getJobname()+offer.getJobcategory()+offer.getDepartmentstatus()+offer.getHiringnumber()+
					offer.getCreationdate()+offer.getEndtime());
		}
	
	}

}
