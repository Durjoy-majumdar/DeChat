package androidx.compose.p002ui.platform;

import gy3.C87412m;
import java.util.Arrays;

/* renamed from: androidx.compose.ui.platform.h1 */
public final class C54173h1 {
    /* renamed from: a */
    public static final String m60886a(Object obj, String str) {
        C87412m.m108594g(obj, "obj");
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }
}
