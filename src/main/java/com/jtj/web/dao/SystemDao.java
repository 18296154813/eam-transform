package com.jtj.web.dao;

import com.jtj.web.entity.Dictionary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface SystemDao {

    int init();

    List<Dictionary> getDictionary();

}
