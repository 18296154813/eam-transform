package com.jtj.web.service;

import com.jtj.web.common.ResultDto;
import com.jtj.web.dao.PermissionDao;
import com.jtj.web.dto.PermissionDto;
import com.jtj.web.entity.KeyValue;
import com.jtj.web.entity.Permission;
import com.jtj.web.service.base.CurdService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface PermissionService extends CurdService<Permission,PermissionDto,PermissionDao> {

    ResultDto<List<KeyValue>> getMap();
}
