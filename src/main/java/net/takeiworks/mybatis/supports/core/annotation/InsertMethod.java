package net.takeiworks.mybatis.supports.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 登録クエリーを実行するメソッドを表明するアノテーション。<br>
 * 
 * @author TAKeiWorks
 */
@QueryMethod
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InsertMethod {
    
}