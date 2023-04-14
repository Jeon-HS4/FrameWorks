package com.tukorea.faq.domain;

public class Faq {
    private int faqSeq;
    private String category;
    private String question;
    private String answer;
    private String regDt;

    public int getFaqSeq() {
        return faqSeq;
    }

    public String getCategory() {
        return category;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getRegDt() {
        return regDt;
    }

    public void setFaqSeq(int faqSeq) {
        this.faqSeq = faqSeq;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setRegDt(String regDt) {
        this.regDt = regDt;
    }
}
