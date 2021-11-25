package com.zfsoft.apache.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zfsoft.apache.mapper.TSysAttaMapper;
import com.zfsoft.apache.pojo.TSysAtta;
import com.zfsoft.apache.service.TSysAttaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname: TSysAttaServiceImpl
 * @Description: TODO
 * @Date: 2021/11/22 10:53
 * @author: wwf
 */
@Service
public class TSysAttaServiceImpl extends ServiceImpl<TSysAttaMapper, TSysAtta> implements TSysAttaService {

    @Resource
    private TSysAttaMapper tSysAttaMapper;

}
