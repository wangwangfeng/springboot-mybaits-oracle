package com.zfsoft.apache;

import cn.gjing.tools.swagger.core.EnableSingleDoc;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wwf
 * springboot+mybatis-plus+druid多数据源
 */
@SpringBootApplication
//@MapperScan(value = "com.zfsoft.apache.mapper")
//@EnableSwagger2Doc
@EnableSingleDoc
public class SpringBootApacheApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringBootApacheApplication.class, args);
        SpringApplication app = new SpringApplication(SpringBootApacheApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
