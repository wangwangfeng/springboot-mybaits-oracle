package com.zfsoft.apache.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @Classname: Test
 * @Description: 本机测试表
 * @Date: 2021/4/30 10:23
 * @author: wwf
 */
@Data
@TableName(schema = "WEB_XIZANG", value = "TEST")
public class Test implements Serializable {

    private static final long serialVersionUID = -45546665447042719L;

    private String id;

    private String xm;

    private String age;

}