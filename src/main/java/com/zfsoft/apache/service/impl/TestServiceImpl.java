package com.zfsoft.apache.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zfsoft.apache.mapper.TestMapper;
import com.zfsoft.apache.pojo.Test;
import com.zfsoft.apache.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname: TestServiceImpl
 * @Description: TODO
 * @Date: 2021/4/30 10:23
 * @author: wwf
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public Test getById(String id) {
        return testMapper.getById(id);
    }

}
