package com.tukorea.faq.dto;

public class FaqListDto {

    private String searchCategory;
    private String searchType;
    private String searchKeyword;
    private int pageNum;

    public FaqListDto(){
        this.pageNum=1;
        this.searchType="question";
    }

    public String getSearchCategory() {
        return searchCategory;
    }

    public String getSearchType() {
        return searchType;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setSearchCategory(String searchCategory) {
        this.searchCategory = searchCategory;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
