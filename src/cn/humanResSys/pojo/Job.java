package cn.humanResSys.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Job {
    private Long id;

    private String jobcode;

    private String jobname;

    private String jobcategory;

    private Long departmentstatus;

    private String description;

    private Long createdby;

    @JSONField(format="yyyy-MM-dd hh:mm:ss")
   	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date creationdate;

    private Long modifyby;

    @JSONField(format="yyyy-MM-dd hh-mm-ss")
   	@DateTimeFormat(pattern="yyyy-MM-dd hh-mm-ss")
    private Date modifydate;

    private String remarks;
    
 //何安迪 新增属性 9-19
    private String department;
    

    
    
  public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

//
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobcode() {
        return jobcode;
    }

    public void setJobcode(String jobcode) {
        this.jobcode = jobcode == null ? null : jobcode.trim();
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getJobcategory() {
        return jobcategory;
    }

    public void setJobcategory(String jobcategory) {
        this.jobcategory = jobcategory == null ? null : jobcategory.trim();
    }

    public Long getDepartmentstatus() {
        return departmentstatus;
    }

    public void setDepartmentstatus(Long departmentstatus) {
        this.departmentstatus = departmentstatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
    	DateFormat df= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
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