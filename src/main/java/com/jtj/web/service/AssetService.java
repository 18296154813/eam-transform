package com.jtj.web.service;

import com.jtj.web.common.ResultDto;
import com.jtj.web.dao.AssetDao;
import com.jtj.web.dto.AssetDto;
import com.jtj.web.entity.Asset;
import com.jtj.web.service.base.CurdService;
import org.springframework.stereotype.Service;


@Service
public interface AssetService extends CurdService<Asset,AssetDto,AssetDao> {

    ResultDto<Object> updateStatus(String uuid, Integer status, String remark);
}
