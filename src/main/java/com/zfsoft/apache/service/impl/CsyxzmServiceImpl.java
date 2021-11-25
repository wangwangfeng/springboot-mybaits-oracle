package com.zfsoft.apache.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zfsoft.apache.mapper.CsyxzmMapper;
import com.zfsoft.apache.pojo.Csyxzm;
import com.zfsoft.apache.service.CsyxzmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname: CsyxzmServiceImpl
 * @Description: TODO
 * @Date: 2021/4/30 15:18
 * @author: wwf
 */
@Service
public class CsyxzmServiceImpl extends ServiceImpl<CsyxzmMapper, Csyxzm> implements CsyxzmService {

    @Resource
    private CsyxzmMapper csyxzmMapper;

    @Override
    public Csyxzm getById(Integer id) {
        return csyxzmMapper.getById(id);
    }
}
