package com.njj.dao;

import com.njj.bean.Human;
import com.njj.bean.HumanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HumanDAO {
//所有----单表  增--数据  删---根据id删除 根据条件删除(动态sql) 改----条件修改(动态sql)
//查--按主键id查对象,查总条数 (动态)  查所有的数据(动态)
    long countByExample(HumanExample example);// 用example类 查询总条数，动态的sql去查询总条数
      //当example类为null的时候，sql 语句等于如下
        //select count(*) from person
      //当example类 不为 null的时候，sql 语句等于如下
    //select count(*) from human where gender=2   example参数如何传递？
    int deleteByExample(HumanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Human record);

    int insertSelective(Human record);

    List<Human> selectByExample(HumanExample example);

    Human selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Human record, @Param("example") HumanExample example);

    int updateByExample(@Param("record") Human record, @Param("example") HumanExample example);

    int updateByPrimaryKeySelective(Human record);

    int updateByPrimaryKey(Human record);
}