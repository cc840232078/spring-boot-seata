package com.funtl.spring.cloud.alibaba.seata.dao;

import com.funtl.spring.cloud.alibaba.seata.domain.TbOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbOrderDao extends JpaRepository<TbOrder,Long> {
}
