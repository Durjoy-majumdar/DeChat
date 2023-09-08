package m31;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o31.C11345b;
import o31.C76986a;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: m31.a */
public @interface C117520a {
    C76986a bizGroupId();

    C11345b pageId();

    int policy();

    int routeRule();
}
