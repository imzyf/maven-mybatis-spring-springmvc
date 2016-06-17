package com.moma.dmv.entity;

/**
 * 
 * 问题表
 * 
 * @ClassName Question
 * @Description
 * @author moma
 * @date Jun 17, 2016
 *
 * 
 */
public class Question {

	private Long questionId;
	private Long testId;
	private String text; // 标题
	private String imageUrl;// 没用
	private String imageLocalpath;// 没用
	private String answers;// 回答选项
	private Integer answer;// 答案号
	private String hint;// 提示
	private String explanation;// 分析

	// auto >>>>>>>>>>>>>>>>>>>>>

	public Question() {
		super();
	}

	public Question(Long questionId, Long testId, String text, String imageUrl, String imageLocalpath, String answers,
			Integer answer, String hint, String explanation) {
		super();
		this.questionId = questionId;
		this.testId = testId;
		this.text = text;
		this.imageUrl = imageUrl;
		this.imageLocalpath = imageLocalpath;
		this.answers = answers;
		this.answer = answer;
		this.hint = hint;
		this.explanation = explanation;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public Long getTestId() {
		return testId;
	}

	public void setTestId(Long testId) {
		this.testId = testId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageLocalpath() {
		return imageLocalpath;
	}

	public void setImageLocalpath(String imageLocalpath) {
		this.imageLocalpath = imageLocalpath;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public Integer getAnswer() {
		return answer;
	}

	public void setAnswer(Integer answer) {
		this.answer = answer;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", testId=" + testId + ", text=" + text + ", imageUrl=" + imageUrl
				+ ", imageLocalpath=" + imageLocalpath + ", answers=" + answers + ", answer=" + answer + ", hint="
				+ hint + ", explanation=" + explanation + "]";
	}
}
