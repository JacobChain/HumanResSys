package cn.humanResSys.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Training {
    private Long id;

    private String trainname;

    private String trainteacher;

    @JSONField(format="yyyy-MM-dd")
   	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date starttime;

    @JSONField(format="yyyy-MM-dd")
   	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endtime;

    private String trainpurpose;

    private String trainees;

    private String description;

    private String filepath;

    private String checkopinion;

    private Long check_status;

    private Long createdby;

    @JSONField(format="yyyy-MM-dd")
   	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date creationdate;

    private Long modifyby;

    @JSONField(format="yyyy-MM-dd")
   	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date modifydate;

    private String remarks;
    private String valuename ;
    private String valuenames;

    public String getvaluenames() {
		return valuenames;
	}

	public void setvaluenames(String valuenames) {
		this.valuenames = valuenames;
	}

	public String getValuename() {
		return valuename;
	}

	public void setValuename(String valuename) {
		this.valuename = valuename;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname == null ? null : trainname.trim();
    }

    public String getTrainteacher() {
        return trainteacher;
    }

    public void setTrainteacher(String trainteacher) {
        this.trainteacher = trainteacher == null ? null : trainteacher.trim();
    }

    public String getStarttime() {
    	DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
		if(starttime!=null)
			return df.format(starttime);
			else
				return "";
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
    	DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
		if(endtime!=null)
			return df.format(endtime);
			else
				return "";
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getTrainpurpose() {
        return trainpurpose;
    }

    public void setTrainpurpose(String trainpurpose) {
        this.trainpurpose = trainpurpose == null ? null : trainpurpose.trim();
    }

    public String getTrainees() {
        return trainees;
    }

    public void setTrainees(String trainees) {
        this.trainees = trainees == null ? null : trainees.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getCheckopinion() {
        return checkopinion;
    }

    public void setCheckopinion(String checkopinion) {
        this.checkopinion = checkopinion == null ? null : checkopinion.trim();
    }

    public Long getcheck_status() {
        return check_status;
    }

    public void setcheck_status(Long check_status) {
        this.check_status = check_status;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public String getCreationdate() {
    	DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
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
    	DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
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
}