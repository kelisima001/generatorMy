package com.liangzi.mapper;

import com.liangzi.pojo.TSystemNotice;
import com.liangzi.pojo.TSystemNoticeExample;
import com.liangzi.pojo.TSystemNoticeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemNoticeMapper {
    long countByExample(TSystemNoticeExample example);

    int deleteByExample(TSystemNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSystemNoticeWithBLOBs record);

    int insertSelective(TSystemNoticeWithBLOBs record);

    List<TSystemNoticeWithBLOBs> selectByExampleWithBLOBs(TSystemNoticeExample example);

    List<TSystemNotice> selectByExample(TSystemNoticeExample example);

    TSystemNoticeWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSystemNoticeWithBLOBs record, @Param("example") TSystemNoticeExample example);

    int updateByExampleWithBLOBs(@Param("record") TSystemNoticeWithBLOBs record, @Param("example") TSystemNoticeExample example);

    int updateByExample(@Param("record") TSystemNotice record, @Param("example") TSystemNoticeExample example);

    int updateByPrimaryKeySelective(TSystemNoticeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TSystemNoticeWithBLOBs record);

    int updateByPrimaryKey(TSystemNotice record);
}