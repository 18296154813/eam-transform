package com.jtj.web.service;

import com.jtj.web.common.ResultDto;
import com.jtj.web.dao.UserDao;
import com.jtj.web.dto.UserDto;
import com.jtj.web.entity.User;
import com.jtj.web.service.base.CurdService;
import org.springframework.stereotype.Service;


@Service
public interface UserService extends CurdService<User,UserDto,UserDao> {

    ResultDto<User> getUserById(long id);

}
