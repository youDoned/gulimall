package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1. 整合mybatis-plus
 *      1）导入依赖
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *       2） 1.配置数据源信息  yml配置
 *           2. 配置mybatisplus的 注解@MapperScan 和sql映射文件在哪 mapper
 *
 * 2.逻辑删除 mybatis-plus 有自带
 * 1) yml 文件配置 全局逻辑删除规则
 * mybatis-plus:
 *   global-config:
 *     db-config:
 *       logic-delete-field: flag  # 全局逻辑删除的实体字段名(since 3.3.0,配置后可以忽略不配置步骤2)
 *       logic-delete-value: 1 # 逻辑已删除值(默认为 1)
 *       logic-not-delete-value: 0 # 逻辑未删除值(默认为 0)
 *
 * 2）
 * 配置全局的逻辑册除规则（省咯)2)
 * 配置逻辑册除的组件Bean（省略)
 * 重要： 加上逻辑删除注解 @TableLogic
 *
 * 3. JSR303
 * 1）给属性bean添加校验注解 比如@NotBlank(message = "品牌名必须提交") 以及message提示
 * 2）开启校验功能 比如在save方法上面 @Valid  效果 校验错误之后会有默认的响应
 *  3） 给校验的bean save方法 紧跟一个BindingResult 就可以获取校验结果
 *  4)分组校验（多场景的复杂校验
 *  1）加上group={接口.class} @Null(message="xxx",group={AddGroup.class} )给校验得注解标注上面时候进行校验
 *  2）@Validated({AddGroup.class})
 *  3)默认没有指定分组得 在分组校验得情况下不生效   /  在不分组的时候就生效
 *
 * 4. 统一的异常处理
 * @ControllerAdvice
 * 1)编写异常处理类 使用controllerAdvice
 * 2）使用@ExceptionHandler标注方法可以处理的异常
 *
 * 5.自定义校验
 * 1）编写一个自定义校验注解 ListValue
 * 2）编写一个自定义校验器 ConstraintValidator
 * 3）关联自定义校验器和自定义的校验注解 @Constraint(validatedBy = { ListValueConstraintValidator.class})*/
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
