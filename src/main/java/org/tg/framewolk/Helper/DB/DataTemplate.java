package org.tg.framewolk.Helper.DB;
import java.lang.annotation.*;


/**
 * DB의 테이블에서, 해당 필드가 가지는 특징.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DataTemplate {
 boolean isUnique = false;
 boolean nullable = false;

 boolean isPrimaryKey =false;
 boolean autoIncrement=false;

 int maximumLength = 0;
}

