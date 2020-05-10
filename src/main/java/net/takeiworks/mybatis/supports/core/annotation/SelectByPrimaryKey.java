package net.takeiworks.mybatis.supports.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 主キーを指定して選択するメソッドを表明するアノテーション。<br>
 * 
 * @author TAKeiWorks
 */
@SelectMethod
@PrimaryKeyMethod
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SelectByPrimaryKey {
    
}