package p270xi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: xi.b */
public @interface C91212b {

    /* renamed from: xi.b$a */
    public static class C53355a implements C53356d {
    }

    Class<? extends C53356d> exportInterface() default C53355a.class;
}
