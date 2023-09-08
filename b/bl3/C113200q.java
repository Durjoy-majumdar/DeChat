package bl3;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: bl3.q */
public @interface C113200q {
    int initialMode() default 1;
}
