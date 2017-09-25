package cn.humanResSys.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.humanResSys.pojo.Offer;
import cn.humanResSys.service.zhaopin.ZhaoPinService;



@Controller
public class ZhaoPinController {
	@Resource
	private ZhaoPinService zhaoPinService;
	
	@RequestMapping("offerList.html")
	public String goOfferList(){
		
		return "offerList" ;
	}
	
	@RequestMapping("offerList")
	@ResponseBody
	public String getOfferList(Model model,
			@RequestParam(value = "jobname", required = false) String jobname,
			@RequestParam(value = "jobcategory", required = false) String jobcategory,
			@RequestParam(value = "creationdate", required = false) String creationdate,
			@RequestParam(value = "endtime", required = false) String endtime){
	System.out.println("inControl");
	List<Offer> list = zhaoPinService.getOfferList(jobname == null || "".equals(jobname) ? null : jobname,
			jobcategory == null || "".equals(jobcategory) ? null : jobcategory,
					creationdate == null || "".equals(creationdate) ? null : creationdate,
							endtime == null || "".equals(endtime) ? null : endtime
									, 1, 10);
	String cjson="";
	cjson=JSON.toJSONString(list);
	System.out.println(cjson);
	return cjson;
    	
	}
	
	@RequestMapping(value="addOffer.html",method=RequestMethod.GET)
	public String addZhaoPin(@ModelAttribute("offer") Offer offer){
		
		return "addOffer";
	}
	
	@RequestMapping(value="addOffer")
	public String addZhaoPin(Offer offer,HttpSession session){
		
		if(zhaoPinService.addOffer(offer)>0){
			return "redirect:offerList.html"; 
		}
		return "addOffer";
		
	}
	
	@RequestMapping("updateOffer.html")
	public String enterupdateOffer(@RequestParam("id")String id,Model m){
		m.addAttribute("offer", id);
		return "UpdateOffer";
	}
	
	@RequestMapping(value ="updateOffer",method = RequestMethod.POST)
	public String doUpdateOffer(Offer offer, HttpSession session){
		
		
		int res = zhaoPinService.updateOffer(offer);
		if (res > 0) {
			return "redirect:updateOffer.html";
		}

		return "UpdateOffer";
	}
	
	@RequestMapping(value="delOffer" )
	public String delOffer(@RequestParam("id")String id){
		int num=zhaoPinService.delOfferById(Integer.getInteger(id));
		if(num>0){
			return "redirect:offerList.html";
		}else{
		    return 	"syserror";
		}
			
	}
	
	@RequestMapping(value = "offerView.html")
	public String showapp(@RequestParam("id") String id, Model model) {
		Offer offer=zhaoPinService.getOfferById(Integer.parseInt(id));
		model.addAttribute("offer", offer);
		
		return "offerView";

	}
	


}
