package org.tg.framewolk.Helper.DB;
import java.lang.annotation.*;


/**
 * DB의 테이블에서, 해당 필드가 가지는 특징을 관리하는 Annotation
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DataTemplate {
 boolean isUnique = false;
 boolean nullable = false;

 boolean isPrimaryKey =false;

 int maximumLength = 0;
}

