package com.tukorea.faq.dao;

import com.tukorea.faq.domain.Faq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import java.util.Objects;
@Mapper
public interface FaqDao {
    public String[] selectFaqCategory();

    public int selectFaqListTotalCount(Map<String, Object> paramMap);

    public List<Faq> selectFaqList(Map<String, Object> paramMap);
}
