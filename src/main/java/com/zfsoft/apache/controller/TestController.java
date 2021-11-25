package com.zfsoft.apache.controller;

import cn.hutool.core.date.DateUtil;
import com.zfsoft.apache.mapper.CsyxzmMapper;
import com.zfsoft.apache.mapper.TestMapper;
import com.zfsoft.apache.pojo.Csyxzm;
import com.zfsoft.apache.pojo.Test;
import com.zfsoft.apache.service.CsyxzmService;
import com.zfsoft.apache.service.TSysAttaService;
import com.zfsoft.apache.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname: TestController
 * @Description: 本机测试后台
 * @Date: 2021/4/30 10:33
 * @author: wwf
 */
@Controller
@Slf4j
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private CsyxzmService csyxzmService;

    @Autowired
    private CsyxzmMapper csyxzmMapper;

    @Autowired
    private TSysAttaService tSysAttaService;

    @GetMapping(value = "/test")
    @ResponseBody
    public String test() {

        log.info("测试oracle双数据源");
/*        Test test = new LambdaQueryChainWrapper<>(testMapper)
                .eq(Test::getId, "1")
                .one();*/
        Test test = testService.getById("1");
        log.info("数据:{}", test.getXm());

        return DateUtil.now() + "+" + test.getXm();
    }

    @GetMapping(value = "/test1")
    @ResponseBody
    public String test1() {

        log.info("测试mysql双数据源");
/*        Csyxzm csyxzm = new LambdaQueryChainWrapper<>(csyxzmMapper)
                .eq(Csyxzm::getId, 1)
                .one();*/
        Csyxzm csyxzm = csyxzmService.getById(0);
        log.info("数据:{}", csyxzm.getName());

        return DateUtil.now() + "+" + csyxzm.getName();
    }

    @GetMapping(value = "/test2")
    @ResponseBody
    //@Transactional
    public String test2() {

        /**
         * @Transactional跟@DS动态数据源注解冲突
         *
         * 一：把这两个入库操作分为两个独立的方法，并且都加上@Transactional和 @DS注解（在service上加）
         * 在完成了aMapper.save()之后去调用bMapper.save()时，
         * 一定要把@Transactional设置为Propagation.REQUIRES_NEW，
         * 这样在调用另一个事务方法时，TransactionInterceptor 会将原事务挂起，暂时性的将原事务信息和当前线程解绑。
         *
         * 二：在一个事务方法里用this来调用另一个事务方法时，@DS也会起作用，原因是this调用的不是事务对象，不会开启事务。
         **/

        log.info("测试事务");
/*        Test test = new LambdaQueryChainWrapper<>(testMapper)
                .eq(Test::getId, "1")
                .one();*/
        Test test = testService.getById("1");
        log.info("mysql数据:{}", test.getXm());
        test.setXm("李四3");
        testService.updateById(test);

        Csyxzm csyxzm = csyxzmService.getById(0);
        log.info("oracle数据:{}", csyxzm.getName());
        csyxzm.setName("测试3");
        csyxzmService.updateById(csyxzm);

        return DateUtil.now();
    }

}
