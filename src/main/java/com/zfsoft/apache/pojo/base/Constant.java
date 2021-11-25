package com.zfsoft.apache.pojo.base;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 常量类
 * 从常量配置文件获取所有值
 *
 * @author 86131
 */
@Configuration
@ConfigurationProperties(prefix = "constant")
@PropertySource("classpath:constant.properties")
@Data
public class Constant {

    /**
     * 分页查询条数
     */
    private String limitBegin;
    private String limitEnd;

    /**
     * 线程池相关参数
     */
    private Integer corePoolSize;
    private Integer maxPoolSize;
    private Long keepAliveSeconds;

}
