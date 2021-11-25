package com.zfsoft.apache.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zfsoft.apache.pojo.Test;

/**
 * @Classname: TestService
 * @Description: TODO
 * @Date: 2021/4/30 10:23
 * @author: wwf
 */
public interface TestService extends IService<Test> {

    Test getById(String id);

}
