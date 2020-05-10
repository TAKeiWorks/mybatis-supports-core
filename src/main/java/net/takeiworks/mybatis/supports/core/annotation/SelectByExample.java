package net.takeiworks.mybatis.supports.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 検索条件を指定して選択するメソッドを表明するアノテーション。<br>
 * 
 * @author TAKeiWorks
 */
@SelectMethod
@ExampleMethod
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SelectByExample {
    
}