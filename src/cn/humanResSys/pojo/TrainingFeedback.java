package cn.humanResSys.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class TrainingFeedback {
    private Long id;

    private Long trainingFeedback;

    private String summarize;

    private String trainresults;

    private Long createdby;

    @JSONField(format="yyyy-MM-dd hh:mm:ss")
   	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date creationdate;

    private Long modifyby;

    @JSONField(format="yyyy-MM-dd hh:mm:ss")
   	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date modifydate;

    private String remarks;

    private Long trainingid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrainingFeedback() {
        return trainingFeedback;
    }

    public void setTrainingFeedback(Long trainingFeedback) {
        this.trainingFeedback = trainingFeedback;
    }

    public String getSummarize() {
        return summarize;
    }

    public void setSummarize(String summarize) {
        this.summarize = summarize == null ? null : summarize.trim();
    }

    public String getTrainresults() {
        return trainresults;
    }

    public void setTrainresults(String trainresults) {
        this.trainresults = trainresults == null ? null : trainresults.trim();
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public String getCreationdate() {
    	DateFormat df= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		if(creationdate!=null)
			return df.format(creationdate);
			else
				return "";
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getModifyby() {
        return modifyby;
    }

    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    public String getModifydate() {
    	DateFormat df= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		if(modifydate!=null)
			return df.format(modifydate);
			else
				return "";
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Long getTrainingid() {
        return trainingid;
    }

    public void setTrainingid(Long trainingid) {
        this.trainingid = trainingid;
    }
}