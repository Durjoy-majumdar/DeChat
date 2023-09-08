package p14;

import java.util.List;
import n14.C25217e;

/* renamed from: p14.d0 */
public final class C25426d0 {

    /* renamed from: a */
    public static final C25217e[] f72013a = new C25217e[0];

    /* renamed from: a */
    public static final C25217e[] m32742a(List<? extends C25217e> list) {
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return f72013a;
        }
        Object[] array = list.toArray(new C25217e[0]);
        if (array != null) {
            return (C25217e[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
