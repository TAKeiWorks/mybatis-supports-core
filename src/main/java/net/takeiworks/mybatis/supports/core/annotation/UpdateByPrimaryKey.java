package net.takeiworks.mybatis.supports.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 主キーで更新するメソッドを表明するアノテーション。<br>
 * 
 * @author TAKeiWorks
 */
@UpdateMethod
@PrimaryKeyMethod
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UpdateByPrimaryKey {
    
}