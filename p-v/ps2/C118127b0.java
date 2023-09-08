package ps2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ps2.b0 */
public @interface C118127b0 {
    int priority() default 1;

    int resType();
}
