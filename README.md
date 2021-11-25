# springboot-mybatis-oracle-mysql

springboot+mybatis-plus实现多数据源

注意：@DS可以注解在方法上、类上、接口、枚举，同时存在方法注解优先于类上注解。
1.不能使用事务，否则数据源不会切换，使用的还是是第一次加载的数据源;
2.数据源名称最好不要包含下滑线，下滑线的数据源切换不了

## 由于使用mybatis-plus可能使用自带的构造器、lambda表达式故该项目@DS注解全部使用到mapper接口上

注意：oracle区分大小写，如果不想区分，必须要用引号包住

该项目使用mybatis-plus实现；可以直接使用mapper调用对应的增删改查，以及构造器、lambda表达式实现增删改查等；
当然也可以直接按照历史的方式使用


