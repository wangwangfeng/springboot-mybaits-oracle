package com.zfsoft.apache.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zfsoft.apache.pojo.TSysAtta;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname: TSysAttaMapper
 * @Description: TODO
 * @Date: 2021/11/22 10:53
 * @author: wwf
 */
// 默认主库可以不写
@DS("ds1")
@Mapper
public interface TSysAttaMapper extends BaseMapper<TSysAtta> {

}