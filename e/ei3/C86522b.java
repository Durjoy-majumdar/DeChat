package ei3;

import com.tencent.p014mm.app.C80625v0;
import di3.C7335d;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ei3.b */
public @interface C86522b {
    Class<?> creator() default Void.class;

    Class<? extends C7335d>[] dependencies() default {};

    C80625v0[] onProcess() default {};
}
