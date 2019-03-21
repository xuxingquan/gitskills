package com.xxq.domain.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xxq.controller.response.GoodsResp;
import com.xxq.domain.repository.GoodsRepository;
import com.xxq.domain.service.GoodsService;
import com.xxq.domain.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRepository goodsRepository;
    @Override
    public GoodsVo insert(GoodsVo vo) {
        return goodsRepository.insert(vo);
    }

    @Override
    public GoodsVo queryByid(Long id) {
        return goodsRepository.queryByid(id);
    }

    @Override
    public Boolean deleteByid(Long id) {
        return goodsRepository.deleteByid(id);
    }

    @Override
    public Boolean update(GoodsVo vo) {
        return goodsRepository.update(vo);
    }

    @Override
    public PageInfo queryByPage(int currentPage, int pageSize) {
        List<GoodsVo> goodsVos = goodsRepository.findByPage(currentPage,pageSize);
        PageInfo<GoodsVo> userInfoDtoPageInfo = new PageInfo<>(goodsVos);
        return userInfoDtoPageInfo;
    }
}
