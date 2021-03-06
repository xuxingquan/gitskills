package com.xxq.infrastructure.persistence.mapper;

import com.xxq.infrastructure.persistence.entity.Seckill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Mapper
public interface SeckillMapper {
    /**
     * 查询所有秒杀商品的记录信息
     * @return
     */
    List<Seckill> findAll();
    /**
     * 查询所有秒杀商品的记录信息
     * @return
     */
    List<Seckill> findByPage(Map date);
    /**
     * 查询所有秒杀商品的记录信息
     * @return
     */
    List<Seckill> findByPage2(RowBounds rowBounds);

    /**
     * 根据主键查询当前秒杀商品的数据
     * @param id
     * @return
     */
    Seckill findById(long id);
    /**
     * 减库存。
     * 对于Mapper映射接口方法中存在多个参数的要加@Param()注解标识字段名称，不然Mybatis不能识别出来哪个字段相互对应
     * @param seckillId 秒杀商品ID
     * @param killTime  秒杀时间
     * @return 返回此SQL更新的记录数，如果>=1表示更新成功
     */
    int reduceStock(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);
}
