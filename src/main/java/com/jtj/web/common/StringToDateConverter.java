package com.jtj.web.common;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

import java.util.Date;

/**
 * Created by MrTT (jiang.taojie@foxmail.com)
 * 2017/4/8.
 */
@Component
@Deprecated
public class StringToDateConverter implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
        if (StringUtils.isEmpty(source) || "NaN".equals(source)){
            return null;
        }
        return new Date(Long.parseLong(source));
    }
}
