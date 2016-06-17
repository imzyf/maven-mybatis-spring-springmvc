package com.moma.dmv.entity;

import org.apache.ibatis.type.Alias;

/**
 * 州字典表
 * 
 * @ClassName DicState
 * @Description
 * @author zyf
 * @date Jun 17, 2016
 *
 * 
 */
@Alias("dmv_dic_state")
public class DicState {

	private Long stateId;// 州id
	private String stateName;// 州名
	private String stateUrl; // 没用
	private String stateTitle;// 没用

	// auto >>>>>>>>>>>>>>>>>>>>>

	public DicState() {
		super();
	}

	public DicState(Long stateId, String stateName, String stateUrl, String stateTitle) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.stateUrl = stateUrl;
		this.stateTitle = stateTitle;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateUrl() {
		return stateUrl;
	}

	public void setStateUrl(String stateUrl) {
		this.stateUrl = stateUrl;
	}

	public String getStateTitle() {
		return stateTitle;
	}

	public void setStateTitle(String stateTitle) {
		this.stateTitle = stateTitle;
	}

	@Override
	public String toString() {
		return "DicState [stateId=" + stateId + ", stateName=" + stateName + ", stateUrl=" + stateUrl + ", stateTitle="
				+ stateTitle + "]";
	}

}
