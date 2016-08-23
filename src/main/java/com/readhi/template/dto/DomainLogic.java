package com.readhi.template.dto;

import java.util.List;

import com.readhi.template.entity.Domain;

public class DomainLogic {

	private List<Domain> domainLost;
	private String sumRevenue; // 总收入
	private String sumAve; // 每日收入总和

	public List<Domain> getDomainLost() {
		return domainLost;
	}

	public void setDomainLost(List<Domain> domainLost) {
		this.domainLost = domainLost;
	}

	public String getSumRevenue() {
		return sumRevenue;
	}

	public void setSumRevenue(String sumRevenue) {
		this.sumRevenue = sumRevenue;
	}

	public String getSumAve() {
		return sumAve;
	}

	public void setSumAve(String sumAve) {
		this.sumAve = sumAve;
	}

	@Override
	public String toString() {
		return "DomainLogic [domainLost=" + domainLost + ", sumRevenue=" + sumRevenue + ", sumAve=" + sumAve + "]";
	}

}
