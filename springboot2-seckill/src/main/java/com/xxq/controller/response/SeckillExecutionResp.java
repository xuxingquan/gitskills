package com.xxq.controller.response;

import com.xxq.infrastructure.persistence.entity.SeckillOrder;
import com.xxq.common.enums.SeckillStatEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * 封装执行秒杀后的结果
 */
@Getter
@Setter
public class SeckillExecutionResp {
    private Long seckillId;
    //秒杀执行结果状态
    private int state;
    //状态表示
    private String stateInfo;
    //秒杀成功的订单对象
    private SeckillOrder seckillOrder;

    public SeckillExecutionResp(Long seckillId, SeckillStatEnum seckillStatEnum, SeckillOrder seckillOrder) {
        this.seckillId = seckillId;
        this.state = seckillStatEnum.getState();
        this.stateInfo = seckillStatEnum.getStateInfo();
        this.seckillOrder = seckillOrder;
    }

    public SeckillExecutionResp(Long seckillId, SeckillStatEnum seckillStatEnum) {
        this.seckillId = seckillId;
        this.state = seckillStatEnum.getState();
        this.stateInfo = seckillStatEnum.getStateInfo();
    }

    @Override
    public String toString() {
        return "SeckillExecution{" +
                "seckillId=" + seckillId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", seckillOrder=" + seckillOrder +
                '}';
    }
}
