package cn.humanResSys.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Resume {
    private Long id;

    private Long jobid;

    private String oname;

    private String email;

    private String address;

    private String gender;

    private String phone;

    private String idcard;

    private String location;

    private String political;

    private Long educationstatus;

    private String school;

    private String profession;

    private String workexperience;

    private Long expectedsalary;

    private String isworking;

    private String isgraduation;

    private String personalexperience;

    private String filepath;

    private String isinterview;

    private String recommend;

    @JSONField(format="yyyy-MM-dd hh-mm-ss")
   	@DateTimeFormat(pattern="yyyy-MM-dd hh-mm-ss")
    private Date recommendedtime;

    private String advise;

    private Long createdby;

    @JSONField(format="yyyy-MM-dd hh-mm-ss")
   	@DateTimeFormat(pattern="yyyy-MM-dd hh-mm-ss")
    private Date creationdate;

    private Long modifyby;

    @JSONField(format="yyyy-MM-dd hh-mm-ss")
   	@DateTimeFormat(pattern="yyyy-MM-dd hh-mm-ss")
    private Date modifydate;

    private String remarks;

    private Long resumestatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobid() {
        return jobid;
    }

    public void setJobid(Long jobid) {
        this.jobid = jobid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political == null ? null : political.trim();
    }

    public Long getEducationstatus() {
        return educationstatus;
    }

    public void setEducationstatus(Long educationstatus) {
        this.educationstatus = educationstatus;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(String workexperience) {
        this.workexperience = workexperience == null ? null : workexperience.trim();
    }

    public Long getExpectedsalary() {
        return expectedsalary;
    }

    public void setExpectedsalary(Long expectedsalary) {
        this.expectedsalary = expectedsalary;
    }

    public String getIsworking() {
        return isworking;
    }

    public void setIsworking(String isworking) {
        this.isworking = isworking == null ? null : isworking.trim();
    }

    public String getIsgraduation() {
        return isgraduation;
    }

    public void setIsgraduation(String isgraduation) {
        this.isgraduation = isgraduation == null ? null : isgraduation.trim();
    }

    public String getPersonalexperience() {
        return personalexperience;
    }

    public void setPersonalexperience(String personalexperience) {
        this.personalexperience = personalexperience == null ? null : personalexperience.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getIsinterview() {
        return isinterview;
    }

    public void setIsinterview(String isinterview) {
        this.isinterview = isinterview == null ? null : isinterview.trim();
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend == null ? null : recommend.trim();
    }

    public String getRecommendedtime() {
    	DateFormat df= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		if(recommendedtime!=null)
			return df.format(recommendedtime);
			else
				return "";
    }

    public void setRecommendedtime(Date recommendedtime) {
        this.recommendedtime = recommendedtime;
    }

    public String getAdvise() {
        return advise;
    }

    public void setAdvise(String advise) {
        this.advise = advise == null ? null : advise.trim();
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

    public Long getResumestatus() {
        return resumestatus;
    }

    public void setResumestatus(Long resumestatus) {
        this.resumestatus = resumestatus;
    }
}