package cn.humanResSys.service.train;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;




import cn.humanResSys.dao.train.TrainMapper;

import cn.humanResSys.dao.train.TrainMapper;

import cn.humanResSys.pojo.Training;
import cn.humanResSys.pojo.TrainingFeedback;
@Service("trainService")
public class TrainServiceImpl implements TrainService {
	@Resource
	private TrainMapper trainMapper;
	public List<Training> getlistTrain(int currentPageNo,int pageSize) {
		currentPageNo=(currentPageNo-1)*pageSize;
		return trainMapper.getlistTrain(currentPageNo,pageSize);
	}
	@Override
	public Training getTrainDetail(int id) {
		// TODO Auto-generated method stub
		return trainMapper.getTrainDetail(id);
	}
	@Override
	public int updateTrain(Training train) {
		// TODO Auto-generated method stub
		return trainMapper.updateTrain(train);
	}
	@Override
	public int deleteTrain(int id) {
		// TODO Auto-generated method stub
		return trainMapper.deleteTrain(id);
	}
	@Override
	public int getTrainCount() {
		// TODO Auto-generated method stub
		return trainMapper.getTrainCount();
	}
	@Override
	public int getTraincheck(int id) {
		// TODO Auto-generated method stub
		return trainMapper.getTraincheck(id);
	}
	@Override
	public int getTrainFeedBack(String valueName) {
		// TODO Auto-generated method stub
		return trainMapper.getTrainFeedBack(valueName);
	}
	@Override
	public int getFeedBackTrain(TrainingFeedback trainingFeedback) {
		// TODO Auto-generated method stub
		return trainMapper.getFeedBackTrain(trainingFeedback);
	}

}
