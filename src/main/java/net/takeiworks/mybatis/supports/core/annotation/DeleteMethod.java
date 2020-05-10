package net.takeiworks.mybatis.supports.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 削除を実行するメソッドを表明するアノテーション。<br>
 * 
 * @author TAKeiWorks
 */
@QueryMethod
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DeleteMethod {
    
}