package net.takeiworks.mybatis.supports.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 検索条件で更新するメソッドを表明するアノテーション。<br>
 * 
 * @author TAKeiWorks
 */
@UpdateMethod
@ExampleMethod
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UpdateByExample {
    
}