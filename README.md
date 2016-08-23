# Maven-Mybatis-Spring-SpringMVC

## 新导入项目：
- 先修改 `pom.xml` 中的 `<artifactId>webtemplate</artifactId>` `<finalName>webtemplate</finalName>`
- 在 eclipse 中 Import->Existing Maven Projects

## 项目架构：
- Maven + Spring + Mybatis + SpringMVC
- junit 单元测试 写好的DAO 可以先测试下，很方便
- slf4j 日志
- c3p0 连接池
- Spring 注解注入
- DAO 层的实现全部是由 Mybatis 自动完成的，也就是说没有 DAO 层的实现代码
- 一种类型的 url 一个 controller

## .gitignore
```
/target/
/.settings/
.classpath
.project
```

## 项目结构：

### 一级结构
src
|-main
|-test （junit 测试相关代码）

### 二级结构
src
|-main
    |-java （Java 源文件）
    |-resources （项目配置文件）
    |-webapp （Web 相关文件）

### 三级结构
src
|-main
    |-java
        |-controller （SpringMVC 控制器包）
        |-dao （Mybatis 数据库操作接口包）
        |-dto （数据传输对象包 包装entity）
        |-service （项目业务层接口包）
        |-service.impl （项目业务层接口实现包）
        |-util （项目工具包）

src
|-main
    |-resources
        |-mapper （Mybatis dao 映射文件包）
        |-spring （Spring 配置文件包）
        |-jdbc.properties （数据库配置文件）
        |-logback.xml （日志配置文件）
        |-mybatis-config.xml （Mybatis 配置文件）

src
|-main
    |-webapp
        |-resources (web 静态资源文件)
        |-WEB-INFO
        |-favicon.ico
        |-robots.txt

### 四级结构
src
|-main
    |-webapp
        |-resources
            |-css
            |-img
            |-js

src
|-main
    |-webapp
        |-WEB-INFO
            |-jsp （所有的 jsp 文件）
            |-jboss-web.xml （wildfly 配置文件）
            |-web.xml
