package cn.humanResSys.service.train;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.humanResSys.pojo.Training;
import cn.humanResSys.pojo.TrainingFeedback;

public interface TrainService {
	public List<Training> getlistTrain(int currentPageNo,int pageSize);
	public int getTrainCount();
	public Training getTrainDetail(int id);
	public int updateTrain(Training train);
	public int deleteTrain(int id);
	public int getTraincheck(int id);
	public int getTrainFeedBack(String valueName);
	public int getFeedBackTrain(TrainingFeedback trainingFeedback);

}
