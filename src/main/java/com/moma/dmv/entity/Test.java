package com.moma.dmv.entity;

import org.apache.ibatis.type.Alias;

/**
 * 
 * 考试表 数据库实体
 * 
 * @ClassName Test
 * @Description
 * @author zyf
 * @date Jun 17, 2016
 * 
 */
@Alias("dmv_test")
public class Test {

	private Long testId;// 考试id
	private Long stateId;// 州
	private String testType;// 考试类型
	private String testTitle;//
	private String testDesc;
	private String testLevel;// 考试等级
	private String testLanguage;
	private String testUrl;// 没使用
	private Long requestId;// 没使用
	private String testMaxnumber;// 这个测试的题目数量
	private String testNumber;// 这个州实际考试时的 题目数量
	private String testPassNum;// 这个州考试时通过要答对的题目数量
	private String testPassScore;
	private String testBigTitle;
	private String testBigDesc;

	// auto >>>>>>>>>>>>>>>>>>>>>

	public Test() {
		super();
	}

	public Test(Long testId, Long stateId, String testType, String testTitle, String testDesc, String testLevel,
			String testLanguage, String testUrl, Long requestId, String testMaxnumber, String testNumber,
			String testPassNum, String testPassScore, String testBigTitle, String testBigDesc) {
		super();
		this.testId = testId;
		this.stateId = stateId;
		this.testType = testType;
		this.testTitle = testTitle;
		this.testDesc = testDesc;
		this.testLevel = testLevel;
		this.testLanguage = testLanguage;
		this.testUrl = testUrl;
		this.requestId = requestId;
		this.testMaxnumber = testMaxnumber;
		this.testNumber = testNumber;
		this.testPassNum = testPassNum;
		this.testPassScore = testPassScore;
		this.testBigTitle = testBigTitle;
		this.testBigDesc = testBigDesc;
	}

	public Long getTestId() {
		return testId;
	}

	public void setTestId(Long testId) {
		this.testId = testId;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public String getTestDesc() {
		return testDesc;
	}

	public void setTestDesc(String testDesc) {
		this.testDesc = testDesc;
	}

	public String getTestLevel() {
		return testLevel;
	}

	public void setTestLevel(String testLevel) {
		this.testLevel = testLevel;
	}

	public String getTestLanguage() {
		return testLanguage;
	}

	public void setTestLanguage(String testLanguage) {
		this.testLanguage = testLanguage;
	}

	public String getTestUrl() {
		return testUrl;
	}

	public void setTestUrl(String testUrl) {
		this.testUrl = testUrl;
	}

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public String getTestMaxnumber() {
		return testMaxnumber;
	}

	public void setTestMaxnumber(String testMaxnumber) {
		this.testMaxnumber = testMaxnumber;
	}

	public String getTestNumber() {
		return testNumber;
	}

	public void setTestNumber(String testNumber) {
		this.testNumber = testNumber;
	}

	public String getTestPassNum() {
		return testPassNum;
	}

	public void setTestPassNum(String testPassNum) {
		this.testPassNum = testPassNum;
	}

	public String getTestPassScore() {
		return testPassScore;
	}

	public void setTestPassScore(String testPassScore) {
		this.testPassScore = testPassScore;
	}

	public String getTestBigTitle() {
		return testBigTitle;
	}

	public void setTestBigTitle(String testBigTitle) {
		this.testBigTitle = testBigTitle;
	}

	public String getTestBigDesc() {
		return testBigDesc;
	}

	public void setTestBigDesc(String testBigDesc) {
		this.testBigDesc = testBigDesc;
	}

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", stateId=" + stateId + ", testType=" + testType + ", testTitle=" + testTitle
				+ ", testDesc=" + testDesc + ", testLevel=" + testLevel + ", testLanguage=" + testLanguage
				+ ", testUrl=" + testUrl + ", requestId=" + requestId + ", testMaxnumber=" + testMaxnumber
				+ ", testNumber=" + testNumber + ", testPassNum=" + testPassNum + ", testPassScore=" + testPassScore
				+ ", testBigTitle=" + testBigTitle + ", testBigDesc=" + testBigDesc + "]";
	}

}
