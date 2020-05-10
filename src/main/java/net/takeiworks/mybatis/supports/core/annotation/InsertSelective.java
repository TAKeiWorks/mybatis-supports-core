package net.takeiworks.mybatis.supports.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 任意のフィールドを指定して登録するメソッドを表明するアノテーション。<br>
 * 
 * @author TAKeiWorks
 */
@InsertMethod
@SelectiveMethod
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InsertSelective {
    
}