package com.zfsoft.apache.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zfsoft.apache.pojo.Csyxzm;

/**
 * @Classname: CsyxzmService
 * @Description: TODO
 * @Date: 2021/4/30 15:18
 * @author: wwf
 */
public interface CsyxzmService extends IService<Csyxzm> {

    Csyxzm getById(Integer id);

}
