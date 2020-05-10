package net.takeiworks.mybatis.supports.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 検索条件でカウントするメソッドを表明するアノテーション。<br>
 * 
 * @author TAKeiWorks
 */
@CountMethod
@ExampleMethod
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CountByExample {
    
}