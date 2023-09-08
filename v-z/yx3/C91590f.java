package yx3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: yx3.f */
public @interface C91590f {
    /* renamed from: c */
    String mo125468c() default "";

    /* renamed from: f */
    String mo125469f() default "";

    /* renamed from: l */
    int[] mo125470l() default {};

    /* renamed from: m */
    String mo125471m() default "";

    /* renamed from: v */
    int mo125472v() default 1;
}
