package com.zfsoft.apache.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zfsoft.apache.pojo.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname: TestMapper
 * @Description: TODO
 * @Date: 2021/4/30 10:23
 * @author: wwf
 */
@DS("ds2")
@Mapper
public interface TestMapper extends BaseMapper<Test> {

    Test getById(@Param("id") String id);

}