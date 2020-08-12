package com.funtl.spring.cloud.alibaba.seata.service.impl;

import com.funtl.spring.cloud.alibaba.seata.dao.TbOrderDao;
import com.funtl.spring.cloud.alibaba.seata.domain.TbOrder;
import com.funtl.spring.cloud.alibaba.seata.service.api.TbOrderService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service(version = "1.0.0")
public class TbOrderServiceImpl implements TbOrderService {

    @Resource
    private TbOrderDao tbOrderDao;

    @Override
    public void insert(TbOrder order) {
        tbOrderDao.save(order);
    }
}
