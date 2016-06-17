package com.moma.dmv.entity;

/**
 * 手册表
 * 
 * @ClassName Handbook
 * @Description
 * @author moma
 * @date Jun 17, 2016
 *
 * 
 */
public class Handbook {
	private Long handbookId;
	private Long stateId;
	private String title;
	private String desc;
	private String fileUrl;
	private String fileLocalpath;
	private String handbookUrl;

	// auto >>>>>>>>>>>>>>>>>>>>>

	public Handbook() {
		super();
	}

	public Handbook(Long handbookId, Long stateId, String title, String desc, String fileUrl, String fileLocalpath,
			String handbookUrl) {
		super();
		this.handbookId = handbookId;
		this.stateId = stateId;
		this.title = title;
		this.desc = desc;
		this.fileUrl = fileUrl;
		this.fileLocalpath = fileLocalpath;
		this.handbookUrl = handbookUrl;
	}

	public Long getHandbookId() {
		return handbookId;
	}

	public void setHandbookId(Long handbookId) {
		this.handbookId = handbookId;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFileLocalpath() {
		return fileLocalpath;
	}

	public void setFileLocalpath(String fileLocalpath) {
		this.fileLocalpath = fileLocalpath;
	}

	public String getHandbookUrl() {
		return handbookUrl;
	}

	public void setHandbookUrl(String handbookUrl) {
		this.handbookUrl = handbookUrl;
	}

	@Override
	public String toString() {
		return "Handbook [handbookId=" + handbookId + ", stateId=" + stateId + ", title=" + title + ", desc=" + desc
				+ ", fileUrl=" + fileUrl + ", fileLocalpath=" + fileLocalpath + ", handbookUrl=" + handbookUrl + "]";
	}

}
