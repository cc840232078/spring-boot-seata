package com.funtl.spring.cloud.alibaba.seata.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_order_item")
public class TbOrderItem implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_item_id")
    private Integer orderItemId;

    private static final long serialVersionUID = 1L;
}