package cn.humanResSys.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.humanResSys.pojo.Training;
import cn.humanResSys.pojo.TrainingFeedback;
import cn.humanResSys.service.train.TrainService;
import cn.humanResSys.utils.PageSupport;
@Controller
@RequestMapping(value="/train")
public class TrainController {
	private Logger logger = Logger.getLogger(TrainController.class);
	@Resource
	private TrainService trainService;
	@RequestMapping(value="/trainlist")
	public String trainLiat(Model model,@RequestParam(value="pageIndex",required=false) String pageIndex){
		int pageSize = 5;
		Integer currentPageNo = 1;
		if(pageIndex != null){
			try{
				currentPageNo = Integer.valueOf(pageIndex);
			}catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		int totalCount=trainService.getTrainCount();
		PageSupport page=new PageSupport();
		page.setPageSize(pageSize);
		page.setTotalCount(totalCount);
		page.setCurrentPageNo(currentPageNo);
		int totalPageCount = page.getTotalPageCount();
		if(currentPageNo < 1){
			currentPageNo = 1;
		}else if(currentPageNo > totalPageCount){
			currentPageNo = totalPageCount;
		}
		List<Training> training=trainService.getlistTrain(currentPageNo,pageSize);
		model.addAttribute("training",training);
		model.addAttribute("page",page);
		return "trainList";
	}
	
	@RequestMapping(value="/trainDetail")
	public String trainDetail(@RequestParam("idd") String idd,
			                  Model model
			){
		int id=Integer.parseInt(idd);
		Training train=trainService.getTrainDetail(id);
		model.addAttribute("a",train);
		return "trainDetail";
	}
	
	@RequestMapping(value="/updateTrain")
	public String updateTrain(@RequestParam("idd") String idd,
			                  @ModelAttribute("train") Training train,
			                  Model model,HttpSession session
			){
		int id=Integer.parseInt(idd);
		train=trainService.getTrainDetail(id);
		session.setAttribute("train", train);
		model.addAttribute("train",train);
		return "trainUpdate";
	}
	
	@RequestMapping(value="/updatetrain",method=RequestMethod.POST)
	public String updatetrain(@RequestParam String idd,
			@RequestParam String trainname,
			@RequestParam String trainteacher,
			@RequestParam String trainpurpose,
			@RequestParam String trainees,
			@RequestParam String description
			){
		long id=Integer.parseInt(idd);
		Training train=new Training();
		train.setId(id);
		train.setTrainname(trainname);
		train.setTrainteacher(trainteacher);
		train.setTrainpurpose(trainpurpose);
		train.setTrainees(trainees);
		train.setDescription(description);
		int update=trainService.updateTrain(train);
		if(update>0){
			return "redirect:/train/trainlist";
		}
		return "trainUpdate";
	}
	
	@RequestMapping(value="/deletedetail")
	public String deletedetail(@RequestParam("idd") String idd){
		int id=Integer.parseInt(idd);
		int delete=trainService.deleteTrain(id);
		if(delete>0){
			return "redirect:/train/trainlist";
		}
		return "trainList";
	}
	
	@RequestMapping(value="/traincheck")
	public String traincheck(@RequestParam("idd") String idd,
			                 @ModelAttribute("train") Training train,
			                 Model model
			){
		int id=Integer.parseInt(idd);
		train=trainService.getTrainDetail(id);
		model.addAttribute("train",train);
		return "trainCheck";
	}
@RequestMapping(value="/trainChecks")
	public String trainChecks(@RequestParam("name") String name){
		int id=Integer.parseInt(name);
		int check=trainService.getTraincheck(id);
		if(check>0){
			return "redirect:/train/trainlist";
		}
		return "trainList";
	}

@RequestMapping(value="trainfeedback")
public String trainfeedback(@RequestParam("idd") String idd,@ModelAttribute("train") Training train,
        Model model){
	int id=Integer.parseInt(idd);
	train=trainService.getTrainDetail(id);
	model.addAttribute("train",train);
	return "trainFeedback";
}

@RequestMapping(value="/trainFeedBack")
public String trainFeedBack(@RequestParam("valueName") String valueName,
		                    @RequestParam("summarize") String summarize,
		                    @RequestParam("trainResults") String trainResults	
		                    		
		){
	/*long a=trainService.getTrainFeedBack(valueName);*/
	TrainingFeedback trainingFeed=new TrainingFeedback();
	/*trainingFeed.setTrainingFeedback(a);*/
	trainingFeed.setSummarize(summarize);
	trainingFeed.setTrainresults(trainResults);
	int b=trainService.getFeedBackTrain(trainingFeed);
	if(b>0){
		return "redirect:/train/trainlist";
	}
	return "trainFeedback";
}
}
