package net.takeiworks.mybatis.supports.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 主キーで任意のフィールドを更新するメソッドを表明するアノテーション。<br>
 * 
 * @author TAKeiWorks
 */
@UpdateMethod
@PrimaryKeyMethod
@SelectiveMethod
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UpdateByPrimaryKeySelective {
    
}