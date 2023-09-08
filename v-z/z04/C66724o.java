package z04;

import fy3.C32226l;
import gy3.C87412m;

/* renamed from: z04.o */
public class C66724o {
    /* renamed from: a */
    public static final <T> void m78727a(Appendable appendable, T t, C32226l<? super T, ? extends CharSequence> lVar) {
        C87412m.m108594g(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t));
            return;
        }
        if (t == null ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
