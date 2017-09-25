package cn.humanResSys.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Salary {
    private Long id;

    private String salarycode;

    private String salaryname;

    private String makers;

    private Long basicsalary;

    private Long performancebonus;

    private Long trafficsubsidy;

    private Long communicationsubsidy;

    private Long mealsubsidy;

    private Long housesubsidy;

    private Long travelsubsidy;

    private Long overtimesubsidy;

    private Long createdby;

    @JSONField(format="yyyy-MM-dd hh-mm-ss")
   	@DateTimeFormat(pattern="yyyy-MM-dd hh-mm-ss")
    private Date creationdate;

    private Long modifyby;

    @JSONField(format="yyyy-MM-dd hh-mm-ss")
   	@DateTimeFormat(pattern="yyyy-MM-dd hh-mm-ss")
    private Date modifydate;

    private String remarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSalarycode() {
        return salarycode;
    }

    public void setSalarycode(String salarycode) {
        this.salarycode = salarycode == null ? null : salarycode.trim();
    }

    public String getSalaryname() {
        return salaryname;
    }

    public void setSalaryname(String salaryname) {
        this.salaryname = salaryname == null ? null : salaryname.trim();
    }

    public String getMakers() {
        return makers;
    }

    public void setMakers(String makers) {
        this.makers = makers == null ? null : makers.trim();
    }

    public Long getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(Long basicsalary) {
        this.basicsalary = basicsalary;
    }

    public Long getPerformancebonus() {
        return performancebonus;
    }

    public void setPerformancebonus(Long performancebonus) {
        this.performancebonus = performancebonus;
    }

    public Long getTrafficsubsidy() {
        return trafficsubsidy;
    }

    public void setTrafficsubsidy(Long trafficsubsidy) {
        this.trafficsubsidy = trafficsubsidy;
    }

    public Long getCommunicationsubsidy() {
        return communicationsubsidy;
    }

    public void setCommunicationsubsidy(Long communicationsubsidy) {
        this.communicationsubsidy = communicationsubsidy;
    }

    public Long getMealsubsidy() {
        return mealsubsidy;
    }

    public void setMealsubsidy(Long mealsubsidy) {
        this.mealsubsidy = mealsubsidy;
    }

    public Long getHousesubsidy() {
        return housesubsidy;
    }

    public void setHousesubsidy(Long housesubsidy) {
        this.housesubsidy = housesubsidy;
    }

    public Long getTravelsubsidy() {
        return travelsubsidy;
    }

    public void setTravelsubsidy(Long travelsubsidy) {
        this.travelsubsidy = travelsubsidy;
    }

    public Long getOvertimesubsidy() {
        return overtimesubsidy;
    }

    public void setOvertimesubsidy(Long overtimesubsidy) {
        this.overtimesubsidy = overtimesubsidy;
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