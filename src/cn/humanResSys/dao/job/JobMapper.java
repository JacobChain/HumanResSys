package cn.humanResSys.dao.job;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.humanResSys.pojo.Job;

@Component("jobMapper")
public interface JobMapper {
	public List<Job> getlist();

}
