package com.zfsoft.apache.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @Classname: Csyxzm
 * @Description: 新版出生医学证明编码
 * @Date: 2021/4/30 15:18
 * @author: wwf
 */
@Data
@TableName(value = "csyxzm")
public class Csyxzm implements Serializable {

    private static final long serialVersionUID = -3937091705261041461L;

    private Integer id;

    private String name;

    private String code;

}