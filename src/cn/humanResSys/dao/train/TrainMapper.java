package cn.humanResSys.dao.train;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import cn.humanResSys.pojo.Training;
import cn.humanResSys.pojo.TrainingFeedback;
public interface TrainMapper {
	public List<Training> getlistTrain(@Param("currentPageNo") int currentPageNo,
			                           @Param("pageSize")int pageSize
			);
	public int getTrainCount();
	public Training getTrainDetail(@Param("id") int id);
	public int updateTrain(Training train);
	public int deleteTrain(@Param("id") int id);
	public int getTraincheck(@Param("id") int id);
	public int getTrainFeedBack(@Param("valueName") String valueName);
	public int getFeedBackTrain(TrainingFeedback trainingFeedback);
	

}
