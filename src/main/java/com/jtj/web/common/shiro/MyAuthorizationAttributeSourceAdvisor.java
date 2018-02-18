package com.jtj.web.common.shiro;

import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;


public class MyAuthorizationAttributeSourceAdvisor extends AuthorizationAttributeSourceAdvisor {

    public MyAuthorizationAttributeSourceAdvisor() {
        this.setAdvice(new MyAopAllianceAnnotationsAuthorizingMethodInterceptor());
    }

}
