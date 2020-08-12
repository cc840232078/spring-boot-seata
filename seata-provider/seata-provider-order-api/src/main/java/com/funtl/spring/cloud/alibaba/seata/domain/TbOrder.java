package com.funtl.spring.cloud.alibaba.seata.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_order")
public class TbOrder implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "user_id")
    private Long userId;

    private static final long serialVersionUID = 1L;
}