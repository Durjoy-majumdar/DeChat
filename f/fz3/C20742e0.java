package fz3;

import gy3.C87412m;
import u04.C90591a;
import vz3.C22826c;
import vz3.C26408b;
import z04.C112551y;

/* renamed from: fz3.e0 */
public final class C20742e0 {

    /* renamed from: a */
    public static final C22826c f58630a;

    /* renamed from: b */
    public static final C26408b f58631b = C26408b.m33990e("kotlin/jvm/internal/RepeatableContainer");

    static {
        C22826c cVar = new C22826c("kotlin.jvm.JvmField");
        f58630a = cVar;
        C26408b.m33992l(cVar);
        C26408b.m33992l(new C22826c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
    }

    /* renamed from: a */
    public static final String m22697a(String str) {
        C87412m.m108594g(str, "propertyName");
        if (m22699c(str)) {
            return str;
        }
        return "get" + C90591a.m113487a(str);
    }

    /* renamed from: b */
    public static final String m22698b(String str) {
        String str2;
        C87412m.m108594g(str, "propertyName");
        StringBuilder sb = new StringBuilder();
        sb.append("set");
        if (m22699c(str)) {
            str2 = str.substring(2);
            C87412m.m108593f(str2, "this as java.lang.String).substring(startIndex)");
        } else {
            str2 = C90591a.m113487a(str);
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    public static final boolean m22699c(String str) {
        C87412m.m108594g(str, "name");
        if (!C112551y.m153819s(str, "is", false) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        return C87412m.m108596i(97, charAt) > 0 || C87412m.m108596i(charAt, 122) > 0;
    }
}
