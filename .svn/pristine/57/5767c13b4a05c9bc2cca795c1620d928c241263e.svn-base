package cn.humanResSys.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Test {
    private Long id;

    private String title;

    private Long type;

    private Long level;

    private String content;

    private String filepath;

    private Long departmentstatus;

    private Long createdby;

    @JSONField(format="yyyy-MM-dd hh-mm-ss")
   	@DateTimeFormat(pattern="yyyy-MM-dd hh-mm-ss")
    private Date creationdate;

    private Long modifyby;

    @JSONField(format="yyyy-MM-dd hh-mm-ss")
   	@DateTimeFormat(pattern="yyyy-MM-dd hh-mm-ss")
    private Date modifydate;

    @JSONField(format="yyyy-MM-dd hh-mm-ss")
   	@DateTimeFormat(pattern="yyyy-MM-dd hh-mm-ss")
    private Date remarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public Long getDepartmentstatus() {
        return departmentstatus;
    }

    public void setDepartmentstatus(Long departmentstatus) {
        this.departmentstatus = departmentstatus;
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
    	DateFormat df= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		if(remarks!=null)
			return df.format(remarks);
			else
				return "";
    }

    public void setRemarks(Date remarks) {
        this.remarks = remarks;
    }
}