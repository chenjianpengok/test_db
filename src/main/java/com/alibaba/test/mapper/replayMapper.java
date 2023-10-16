package com.alibaba.test.mapper;

import com.alibaba.test.entity.replay;

public interface replayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(replay record);

    int insertSelective(replay record);

    replay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(replay record);

    int updateByPrimaryKeyWithBLOBs(replay record);

    int updateByPrimaryKey(replay record);
}