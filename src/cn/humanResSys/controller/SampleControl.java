package cn.humanResSys.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.humanResSys.pojo.Offer;
import cn.humanResSys.service.zhaopin.ZhaoPinService;

@Controller
@RequestMapping("sample")
public class SampleControl {
	@Resource
	private ZhaoPinService zhaoPinService;

	@RequestMapping("sampleList.html")
	public String goSampleList() {
		return "sampleList";
	}
	
	@RequestMapping("getSampleList")
	@ResponseBody
	public String getSampleList() {
		System.out.println("inControl");
		List<Offer> list = zhaoPinService.getOfferList(null, null, null, null, null, null);
		String cjson="";
		cjson=JSON.toJSONString(list);
		System.out.println(cjson);
		return cjson;
	}
}
