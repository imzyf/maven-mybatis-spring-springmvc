package com.readhi.template.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("ads_domain")
public class Domain implements Serializable {

	private static final long serialVersionUID = -4390811717690171698L;

	private Long domainNid; // domain 主键
	private String domainName; // domain 名称
	private String domainSlug; // slug
	private String domainCountry; // domain 所属国家

	private Date domainCreatetime; // domain创建时间
	private Integer domainAdsenseStatus; // domainAdsense状态
	private Timestamp domainIncludetime; // domain 收录时间
	private Timestamp domainModifytime; // domain 修改时间

	public Long getDomainNid() {
		return domainNid;
	}

	public void setDomainNid(Long domainNid) {
		this.domainNid = domainNid;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDomainCountry() {
		return domainCountry;
	}

	public void setDomainCountry(String domainCountry) {
		this.domainCountry = domainCountry;
	}

	public Date getDomainCreatetime() {
		return domainCreatetime;
	}

	public void setDomainCreatetime(Date domainCreatetime) {
		this.domainCreatetime = domainCreatetime;
	}

	public Integer getDomainAdsenseStatus() {
		return domainAdsenseStatus;
	}

	public void setDomainAdsenseStatus(Integer domainAdsenseStatus) {
		this.domainAdsenseStatus = domainAdsenseStatus;
	}

	public Timestamp getDomainIncludetime() {
		return domainIncludetime;
	}

	public void setDomainIncludetime(Timestamp domainIncludetime) {
		this.domainIncludetime = domainIncludetime;
	}

	public Timestamp getDomainModifytime() {
		return domainModifytime;
	}

	public void setDomainModifytime(Timestamp domainModifytime) {
		this.domainModifytime = domainModifytime;
	}

	public String getDomainSlug() {
		return domainSlug;
	}

	public void setDomainSlug(String domainSlug) {
		this.domainSlug = domainSlug;
	}

	@Override
	public String toString() {
		return "Domain [domainNid=" + domainNid + ", domainName=" + domainName + ", domainSlug=" + domainSlug
				+ ", domainCountry=" + domainCountry + ", domainCreatetime=" + domainCreatetime
				+ ", domainAdsenseStatus=" + domainAdsenseStatus + ", domainIncludetime=" + domainIncludetime
				+ ", domainModifytime=" + domainModifytime + "]";
	}

}
