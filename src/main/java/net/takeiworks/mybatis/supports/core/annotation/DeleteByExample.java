package net.takeiworks.mybatis.supports.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 検索条件で削除するメソッドを表明するアノテーション。<br>
 * 
 * @author TAKeiWorks
 */
@DeleteMethod
@ExampleMethod
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DeleteByExample {
    
}