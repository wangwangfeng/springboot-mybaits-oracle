package com.zfsoft.apache.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zfsoft.apache.pojo.Csyxzm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname: CsyxzmMapper
 * @Description: TODO
 * @Date: 2021/4/30 15:18
 * @author: wwf
 */
@DS("ds3")
@Mapper
public interface CsyxzmMapper extends BaseMapper<Csyxzm> {

    Csyxzm getById(@Param("id") Integer id);

}